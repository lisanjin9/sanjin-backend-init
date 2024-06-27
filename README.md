# 创建一个万用模板
[个人博客地址✈](https://lisanjin9.top/)


## 主流框架 & 特点
- Spring Boot(2.7.2)
- lombok
- mybatis plus
- knife4j


## 项目配置
### 基础设置
````
# 项目名称
spring:
  application:
    name: sanjin-backend-init
# 端口
server:
  port: 8080
````  
### 数据库配置
````
datasource:
  driver-class-name: com.mysql.cj.jdbc.Driver
  url: jdbc:mysql://localhost:3306/my_db
  username: root
  password: root
  
  <!--引入 mysql，mybatis plus 配置文件中的driver-class-name   -->
        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>com.baomidou</groupId>
            <artifactId>mybatis-plus-boot-starter</artifactId>
            <version>3.5.2</version>
        </dependency>
````        
###  引入knife4j
````
<dependency>
    <groupId>com.github.xiaoymin</groupId>
    <artifactId>knife4j-openapi2-spring-boot-starter</artifactId>
    <version>4.4.0</version>
</dependency>

# 接口文档配置
knife4j:
  enable: true
  openapi:
    title: "金答评判系统"
    version: 1.0
    group:
      default:
        api-rule: package
        api-rule-resources:
          - com.sanjin.controller  # controller路径

````