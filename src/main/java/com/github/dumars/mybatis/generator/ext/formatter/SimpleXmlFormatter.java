package com.github.dumars.mybatis.generator.ext.formatter;

import java.io.IOException;
import java.io.StringReader;

import org.apache.commons.io.IOUtils;
import org.mybatis.generator.api.XmlFormatter;
import org.mybatis.generator.api.dom.xml.Document;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.internal.util.StringUtility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SimpleXmlFormatter implements XmlFormatter {

	@Override
	public void setContext(Context context) {
	}

	@Override
	public String getFormattedContent(Document document) {
		return format(document.getFormattedContent());
	}
	
	static String format(String xml) {
		StringBuilder doc = new StringBuilder();
		try {
			for(String line : IOUtils.readLines(new StringReader(xml))) {
				if(StringUtility.stringHasValue(line) && line.startsWith("  ")) {
					line = line.replaceAll("  ", "	");
				}
				doc.append(line).append(System.lineSeparator());
			}
			return doc.toString();
		} catch (IOException e) {
			log.error(e.getMessage(), e);
		}
		return xml;
	}
}
