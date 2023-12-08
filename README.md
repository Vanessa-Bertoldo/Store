<p align="center">
  <a href="https://hibernate.org/" target="blank"><img src="/assets/JPA-hibernate.jpg" width="320" alt="Hibernate Logo" /></a>
</p>

# ⚠️ This project is under development

# Data persistence with JPA: Hibernate
<p>This API is based on a system for internal use of a store</p>

## Prerequisites ⚒️
<ul>
    <li>JDK (version 11)</li>
</ul>


## How the API works
### Database configuration

<p>Configure the file "persistence.xml" with data from your database </p>

```bash
     <properties>
            <property name="" value=""/>
            <property name="javax.persistence.jdbc.driver" value="org.h2.Driver"/>
            <property name="javax.persistence.jdbc.url" value="jdbc:h2:mem:store"/>
            <property name="javax.persistence.jdbc.user" value="sa"/>
            <property name="javax.persistence.jdbc.password" value=""/>
            <property name="hibernate.dialect" value="org.hibernate.dialect.H2Dialect"/>
        </properties>
```  
<p>This is a local database configuration</p>

