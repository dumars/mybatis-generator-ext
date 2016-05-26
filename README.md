# mybatis-generator-ext

---
### Maven

```xml
<repositories>
	<repository>
		<id>mybatis-generator-ext-mvn-repo</id>
		<url>https://raw.github.com/dumars/mybatis-generator-ext/mvn-repo/</url>
		<snapshots>
			<enabled>true</enabled>
			<updatePolicy>always</updatePolicy>
		</snapshots>
	</repository>
</repositories>

<dependency>
	<groupId>com.github.dumars</groupId>
	<artifactId>mybatis-generator-ext</artifactId>
	<version>0.0.3</version>
</dependency>
```

---
### CustomsCommentGenerator plugin
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
