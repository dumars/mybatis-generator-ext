package com.github.dumars.mybatis.generator.ext.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.internal.util.StringUtility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ExampleSubPackagePlugin extends PluginAdapter {
	
	private String subPackageName;
	
	public ExampleSubPackagePlugin() {
		super();
	}

	@Override
	public boolean validate(List<String> warnings) {
		subPackageName = properties.getProperty("subPackageName");
		return StringUtility.stringHasValue(subPackageName);
	}
	
	@Override
	public void initialized(IntrospectedTable introspectedTable) {
		String exampleType = introspectedTable.getExampleType();
		log.debug("the origin type: {}", exampleType);
		
		StringBuilder type = new StringBuilder();
		type.append(exampleType.substring(0, exampleType.lastIndexOf(".")));
		type.append(subPackageName);
		type.append(exampleType.substring(exampleType.lastIndexOf(".")));
		
		log.debug("the new type: {}", type.toString());
		
		introspectedTable.setExampleType(type.toString());
	}

}
