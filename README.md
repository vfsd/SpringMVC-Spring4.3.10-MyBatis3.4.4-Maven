springMVC + spring4.3.10  + mybatis3.4.4 +maven 项目框架<br/>
===================================  
注意：首先我们来罗列一下Spring4.x的大变化。  
-----------------------------------  
1、支持JDK8 。
2、Groovy Bean Definition DSL 风格配置。
3、依赖注入支持泛型。
4、合并部分注解，如@RestController  ＝ @Controller ＋ @ReponseBody  。
5、Spring-test 部分功能的改进。
    
###  
  	<!-- Spring 在 3.2.13版本后，要单独引用 -->
	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-context</artifactId>
	    <version>4.2.5.RELEASE</version>
	</dependency>
	<!-- Spring 在 3.2.13版本后，要单独引用 -->
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-test</artifactId>
		<version>4.2.5.RELEASE</version>
	</dependency>
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-webmvc</artifactId>
		<version>4.2.5.RELEASE</version>
	</dependency>
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-context-support</artifactId>
		<version>4.2.5.RELEASE</version>
	</dependency>
	<dependency>
		<groupId>org.springframework</groupId>
		<artifactId>spring-core</artifactId>
		<version>4.2.5.RELEASE</version>
	</dependency>
	<dependency>
	    <groupId>org.springframework</groupId>
	    <artifactId>spring-jdbc</artifactId>
	    <version>4.2.5.RELEASE</version>
	</dependency>  
  
###    
  

### 如果你用到了ref 标签的 bean  
    <bean id="sessionManager" class="org.apache.shiro.web.session.mgt.DefaultWebSessionManager">
		.....
     		<property name="sessionListeners">
         		<list>
             		<ref local="customSessionListener"/>
         		</list>
     		</property>
     		.....
	</bean> 
需要改成：

	<bean id="sessionManager" class="org.apache.shiro.web.session.mgt.DefaultWebSessionManager">
		.....
     		<property name="sessionListeners">
	         <list>
	             <ref bean="customSessionListener"/>
	         </list>
     		</property>
     		.....
	</bean> 
	
如果发现启动报错：
	org.springframework.web.util.NestedServletException: Handler processing failed; nested exception is java.lang.NoSuchMethodError: com.fasterxml.jackson.databind.JavaType.isReferenceType()
	
那么把下面 Spring  4.x 依赖的相关 json   jar  包加上即可。

	<!-- Spring 升级4+ 依赖的JSON包 -->
	<dependency>
	    <groupId>com.fasterxml.jackson.core</groupId>
	    <artifactId>jackson-databind</artifactId>
	    <version>2.7.4</version>
	</dependency>
	<dependency>
	    <groupId>com.fasterxml.jackson.core</groupId>
	    <artifactId>jackson-core</artifactId>
	    <version>2.7.4</version>
	</dependency>
	<dependency>
	    <groupId>com.fasterxml.jackson.core</groupId>
	    <artifactId>jackson-annotations</artifactId>
	    <version>2.7.4</version>
	</dependency>
	<!-- /Spring 升级4+ 依赖的JSON包 -->
	



