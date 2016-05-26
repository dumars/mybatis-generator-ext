# mybatis-generator-ext

###CustomsCommentGenerator plugin
for comment configuration.

CustomsCommentGenerator extends DefaultCommentGenerator

```xml
<commentGenerator type="com.github.dumars.mybatis.generator.ext.plugin.CustomsCommentGenerator">
    <property name="suppressAllComments" value="false" />
	<property name="suppressDate" value="true" />
	<property name="suppressClassComment" value="false" />
	<property name="showColumnName" value="true" />
	<property name="showColumnJdbcType" value="true" />
	<property name="showColumnDefaultValue" value="true" />
	<property name="showColumnRemark" value="true" />
</commentGenerator>
```

###ExampleSubPackagePlugin

```xml
<plugin type="com.github.dumars.mybatis.generator.ext.plugin.ExampleSubPackagePlugin">
	<property name="subPackageName" value="criterion" />
</plugin>
```

###NoExamplePlugin

```xml
<plugin type="com.github.dumars.mybatis.generator.ext.plugin.NoExamplePlugin"/>
```

###SimpleXmlFormatter
Replace from two space to tab.

```xml
<property name="xmlFormatter" value="com.github.dumars.mybatis.generator.ext.formatter.SimpleXmlFormatter"/>
```
