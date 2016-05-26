package com.github.dumars.mybatis.generator.ext.plugin;

import java.util.List;

import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.Plugin;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.api.dom.xml.XmlElement;

public class NoExamplePlugin extends PluginAdapter implements Plugin {

	@Override
	public boolean validate(List<String> paramList) {
		return true;
	}

	@Override
	public boolean clientGenerated(Interface paramInterface, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientCountByExampleMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientDeleteByExampleMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientDeleteByPrimaryKeyMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientInsertMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientInsertSelectiveMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(Method paramMethod,
			TopLevelClass paramTopLevelClass, IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientSelectByPrimaryKeyMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientUpdateByExampleSelectiveMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientUpdateByExampleWithBLOBsMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(Method paramMethod,
			TopLevelClass paramTopLevelClass, IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientUpdateByPrimaryKeySelectiveMethodGenerated(Method paramMethod,
			TopLevelClass paramTopLevelClass, IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientUpdateByPrimaryKeyWithBLOBsMethodGenerated(Method paramMethod,
			TopLevelClass paramTopLevelClass, IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method paramMethod,
			TopLevelClass paramTopLevelClass, IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientCountByExampleMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientDeleteByExampleMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientDeleteByPrimaryKeyMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientInsertMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientInsertSelectiveMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientSelectAllMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientSelectAllMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientSelectByExampleWithBLOBsMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientSelectByExampleWithoutBLOBsMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientSelectByPrimaryKeyMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientUpdateByExampleSelectiveMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientUpdateByExampleWithBLOBsMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientUpdateByExampleWithoutBLOBsMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean clientUpdateByPrimaryKeySelectiveMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientUpdateByPrimaryKeyWithBLOBsMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean clientUpdateByPrimaryKeyWithoutBLOBsMethodGenerated(Method paramMethod, Interface paramInterface,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean modelFieldGenerated(Field paramField, TopLevelClass paramTopLevelClass,
			IntrospectedColumn paramIntrospectedColumn, IntrospectedTable paramIntrospectedTable,
			ModelClassType paramModelClassType) {
		return true;
	}

	@Override
	public boolean modelGetterMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedColumn paramIntrospectedColumn, IntrospectedTable paramIntrospectedTable,
			ModelClassType paramModelClassType) {
		return true;
	}

	@Override
	public boolean modelSetterMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedColumn paramIntrospectedColumn, IntrospectedTable paramIntrospectedTable,
			ModelClassType paramModelClassType) {
		return true;
	}

	@Override
	public boolean modelPrimaryKeyClassGenerated(TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean modelBaseRecordClassGenerated(TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean modelExampleClassGenerated(TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean sqlMapGenerated(GeneratedXmlFile paramGeneratedXmlFile, IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapDocumentGenerated(Document paramDocument, IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapResultMapWithoutBLOBsElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapCountByExampleElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean sqlMapDeleteByExampleElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean sqlMapDeleteByPrimaryKeyElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapExampleWhereClauseElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean sqlMapBaseColumnListElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapBlobColumnListElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapInsertElementGenerated(XmlElement paramXmlElement, IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapInsertSelectiveElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean sqlMapResultMapWithBLOBsElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapSelectAllElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapSelectByPrimaryKeyElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean sqlMapUpdateByExampleSelectiveElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapUpdateByExampleWithBLOBsElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapUpdateByExampleWithoutBLOBsElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean sqlMapUpdateByPrimaryKeySelectiveElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapUpdateByPrimaryKeyWithBLOBsElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean sqlMapUpdateByPrimaryKeyWithoutBLOBsElementGenerated(XmlElement paramXmlElement,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean providerGenerated(TopLevelClass paramTopLevelClass, IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean providerApplyWhereMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean providerCountByExampleMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean providerDeleteByExampleMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean providerInsertSelectiveMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return true;
	}

	@Override
	public boolean providerSelectByExampleWithBLOBsMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean providerSelectByExampleWithoutBLOBsMethodGenerated(Method paramMethod,
			TopLevelClass paramTopLevelClass, IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean providerUpdateByExampleSelectiveMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean providerUpdateByExampleWithBLOBsMethodGenerated(Method paramMethod, TopLevelClass paramTopLevelClass,
			IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean providerUpdateByExampleWithoutBLOBsMethodGenerated(Method paramMethod,
			TopLevelClass paramTopLevelClass, IntrospectedTable paramIntrospectedTable) {
		return false;
	}

	@Override
	public boolean providerUpdateByPrimaryKeySelectiveMethodGenerated(Method paramMethod,
			TopLevelClass paramTopLevelClass, IntrospectedTable paramIntrospectedTable) {
		return true;
	}
}
