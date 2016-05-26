package com.github.dumars.mybatis.generator.ext.plugin;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;
import org.mybatis.generator.internal.util.StringUtility;

public class CustomsCommentGenerator extends DefaultCommentGenerator implements CommentGenerator {
	
	private Properties properties;
	private boolean suppressDate;
	private boolean suppressAllComments;
	private boolean suppressClassComment;
	private boolean showColumnName;
	private boolean showColumnJdbcType;
	private boolean showColumnDefaultValue;
	private boolean showColumnRemark;
	private String dateFormatPattern;
	private Format format;
	
	public CustomsCommentGenerator() {
		this.properties = new Properties();
		this.suppressDate = false;
		this.suppressAllComments = false;
		this.suppressClassComment = false;
		this.showColumnName = false;
		this.showColumnJdbcType = false;
		this.showColumnDefaultValue = false;
		this.showColumnRemark = false;
	}

	public void addConfigurationProperties(Properties paramProperties) {
		this.properties.putAll(paramProperties);
		this.suppressDate = StringUtility.isTrue(properties.getProperty("suppressDate"));
		this.suppressAllComments = StringUtility.isTrue(properties.getProperty("suppressAllComments"));
		this.suppressClassComment = StringUtility.isTrue(properties.getProperty("suppressClassComment"));
		this.showColumnName = StringUtility.isTrue(properties.getProperty("showColumnName"));
		this.showColumnJdbcType = StringUtility.isTrue(properties.getProperty("showColumnJdbcType"));
		this.showColumnDefaultValue = StringUtility.isTrue(properties.getProperty("showColumnDefaultValue"));
		this.showColumnRemark = StringUtility.isTrue(properties.getProperty("showColumnRemark"));
		
		this.dateFormatPattern = properties.getProperty("dateFormatPattern");
		if(!StringUtility.stringHasValue(dateFormatPattern)) {
			dateFormatPattern = "yyyy/MM/dd HH:mm:ss";
		}
		format = new SimpleDateFormat(dateFormatPattern);
	}

	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
		addClassComment(innerClass, introspectedTable, false);
	}
	
	public void addFieldComment(Field field, IntrospectedTable table,
			IntrospectedColumn column) {
		if (this.suppressAllComments) {
			return;
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append(" * Column-Name: ").append(column.getActualColumnName());
		sb.append(", JDBC-Type: ").append(column.getJdbcTypeName());
		sb.append(", Length: ").append(column.getLength());
		sb.append(", Scale: ").append(column.getScale());

		field.addJavaDocLine("/**");
		field.addJavaDocLine(combinColumnComment(column));
		field.addJavaDocLine(" */");
	}

	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
	}

	@Override
	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
	}

	@Override
	public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
	}

	public void addClassComment(InnerClass innerClass,
			IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
		if (this.suppressAllComments || this.suppressClassComment) {
			return;
		}

		super.addClassComment(innerClass, introspectedTable, markAsDoNotDelete);
	}

	public void addGetterComment(Method method, IntrospectedTable table,
			IntrospectedColumn column) {
		if (this.suppressAllComments) {
			return;
		}

		method.addJavaDocLine("/**");
		addCustomComment(method, column);

		StringBuilder sb = new StringBuilder();
		sb.append(" * @return the value of ");
		sb.append(table.getFullyQualifiedTable());
		sb.append('.');
		sb.append(column.getActualColumnName());
		method.addJavaDocLine(sb.toString());
		method.addJavaDocLine(" */");
	}

	public void addSetterComment(Method method, IntrospectedTable table,
			IntrospectedColumn column) {
		if (this.suppressAllComments) {
			return;
		}

		method.addJavaDocLine("/**");
		addCustomComment(method, column);

		Parameter parm = (Parameter) method.getParameters().get(0);
		StringBuilder sb = new StringBuilder();
		sb.append(" * @param ");
		sb.append(parm.getName());
		sb.append(" the value for ");
		sb.append(table.getFullyQualifiedTable());
		sb.append('.');
		sb.append(column.getActualColumnName());
		method.addJavaDocLine(sb.toString());
		method.addJavaDocLine(" */");
	}
	
	public void addComment(XmlElement xmlElement) {
		if (this.suppressAllComments) {
			return;
		}

		String s = getDateString();
		if (s != null) {
			xmlElement.addElement(new TextElement("<!--"));
			
			StringBuilder sb = new StringBuilder();
			sb.append("  This file was generated on ");
			sb.append(s);
			sb.append('.');
			xmlElement.addElement(new TextElement(sb.toString()));
			xmlElement.addElement(new TextElement("-->"));
		}
	}

	public void addRootComment(XmlElement paramXmlElement) {
		return;
	}
	
	protected String getDateString() {
		if (this.suppressDate) {
			return null;
		}
		return format.format(new Date());
	}
	
	protected String combinColumnComment(IntrospectedColumn column) {
		StringBuilder sb = new StringBuilder();
		sb.append(" * ").append(column.getActualColumnName());
		sb.append(" ").append(column.getJdbcTypeName());
		sb.append("(").append(column.getLength());
		if (column.getScale() != 0)
			sb.append(".").append(column.getScale());
		
		sb.append(")");
		return sb.toString();
	}
	
	protected void addCustomComment(Method method, IntrospectedColumn column) {
		if(showColumnName)
			method.addJavaDocLine(" * Column name: " + column.getActualColumnName());
		
		StringBuilder sb = new StringBuilder();
		if(showColumnJdbcType) {
			sb.append(" * Column type: ").append(column.getJdbcTypeName());
			sb.append("(").append(column.getLength());
			if(column.getScale() != 0)
				sb.append(".").append(column.getScale());
			
			sb.append(")");
			method.addJavaDocLine(sb.toString());
		}
		
		if(showColumnDefaultValue && StringUtility.stringHasValue(column.getDefaultValue())) {
			sb.setLength(0);
			sb.append(" * Default value: ").append(column.getDefaultValue());
			method.addJavaDocLine(sb.toString());
		}
		
		if(showColumnRemark && StringUtility.stringHasValue(column.getRemarks())) {
			method.addJavaDocLine(" * Remark: " + column.getRemarks());
		}
	}
}
