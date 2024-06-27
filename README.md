# 创建一个万用模板
[个人博客地址✈](https://lisanjin9.top/)
## 基础设置
````
# 项目名称
spring:
  application:
    name: sanjin-backend-init
# 端口
server:
  port: 8080
  
# 数据库配置
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
## 主流框架 & 特点
- Spring Boot(2.7.2)
- lombok
- mybatis plus
