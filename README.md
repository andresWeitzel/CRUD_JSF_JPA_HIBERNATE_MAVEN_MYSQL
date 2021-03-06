# CRUD JSF, MAVEN, JPA-HIBERNATE, MYSQL



</br>

| **Tecnologías** | **Versión** | **Finalidad** |               
| ------------- | ------------- | ------------- |
| Java |   12.0.2 | JDK |
| XAMPP | 3.2.2  | Paquete de Servidores |
| Maven |  4.0.0 | Gestor de Proyectos |
| JPA-Hibernate | 2.1  | Framework para el mapeo de objetos y persistencia en la db |
| JSF     | 2.2.13 | Framework para el Desarrollo de Interfaces Web | 
| WildFly |   23.0 Runtime | Servidor de Despliegue |
| Eclipse IDE EE |  4.20 | Entorno de Desarrollo Integrado |
| GNU bash / Terminal | 4.4.23  | Bash / Terminal para el manejo e implementación de Git integrado al IDE Eclipse |
| Git | 2.29.1  | Control de Versiones |

</br>

| **Dependencias Maven** | **Finalidad** |   
| ------------- | ------------- |
| javax.servlet-api-4.0.1|  Librerías para el uso de Servlets |
| mysql-connector-8.0.21|  Conexión e Implementación de Queries a la db con Mysql |
| Hibernate-Core 5.3.6 | El Core de Hibernate |
| Javax Annotation API 1.3.2 | Api para la lectura de Annotation |
| Javax XML Bind API 2.3.1 | Api para transf. de Objetos Java y Documentos XML |
| JSF API 2.2.17 | API para el Desarrollo de Interfaces | 
| JSF Impl 2.2.17 | Especificaciones para la Implementación de JSF |


* Repostorio dependencia servlet: https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api
* Repositorio dependencia mysql: https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21
* Repositorio dependencia Hibernate-Core: https://mvnrepository.com/artifact/org.hibernate/hibernate-core/5.3.6.Final
* Repositorio dependencia Javax Annotation API: https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api/1.3.2
* Repositorio dependencia Javax XML Bin API : https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api/2.3.1
* Repositorio dependencia API JSF: https://mvnrepository.com/artifact/com.sun.faces/jsf-api/2.2.17
* Repositorio dependencia Implementación JSF: https://mvnrepository.com/artifact/com.sun.faces/jsf-impl/2.2.17

</br>

## Descarga y Documentación de las Tecnologías empleadas:
#### Java-JDK 12:                     https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html
#### XAMPP:                            https://www.apachefriends.org/download.html
#### Maven Repositories:              https://mvnrepository.com/
#### Servidor WildFly:                     https://www.wildfly.org/downloads/
#### Maven Repositories:              https://mvnrepository.com/
#### Eclipse:                        https://www.eclipse.org/
#### Cygwin:                           https://cygwin.com/install.html
#### Git:                              https://git-scm.com/docs


</br>

<hr>

## ` Documentación y Guía del Proyecto `
#### (Esta Documentación que Desarrollé es para la Creación y Configuración del Proyecto desde Cero, Manejo y Dependencias de Maven, JSF, JPA, Mysql, Servidor de Despliegue y otros usos. Recomiendo Leerla y Realizar todo paso a paso como se indica en la misma).

</br>

## Indice

 #### Sección 1) Creación del Proyecto y Configuraciones   
   - [Paso 1) Creación y Configuraciones de un Proyecto Web con Maven en Eclipse.](#paso-1-creación-de-un-proyecto-web-con-maven-en-eclipse-y-configuraciónes-iniciales)
    
   - [Paso 2) Otras Configuraciones del Proyecto.](#paso-2-otras-configuraciones-del-proyecto)


 #### Sección 2) Configuracion del Servidor, Dependencias del Proyecto y Configuración del Descriptor de Despliegue
   - [Paso 3) Configuración del Servidor de Despliegue (Wildfly).](#paso-3-configuración-del-servidor-de-despliegue-wildfly)
    
   - [Paso 4) Dependencias del Proyecto.](#paso-4-dependencias-del-proyecto)
    
   - [Paso 5) Configuraciones del Descriptor de Despliegue (web.xml)](#paso-5-configuraciones-del-descriptor-de-despliegue-webxml) 
    

 
 #### Sección 3) Configuración del SGDB Mysql y JPA-Hibernate para la Persistencia de Datos
   - [Paso 6) Configuración del SGDB Mysql.](#paso-6-configuraciones-del-sgdb-mysql)
    
   - [Paso 7) Configuración de JPA-HIBERNATE para la Persistencia de datos.](#paso-7-configuración-de-jpa-hibernate-para-la-persistencia-de-datos)
   
 
 #### Sección 4) Creación, Configuración y Manejo de Clases, Interfaces y Paquetes para el CRUD MVC
   - [Paso 8) Creación de Nuestra Clase Entidad-Modelo Cliente para la Persistencia de Datos.](#paso-8-creación-de-nuestra-clase-entidad-modelo-cliente-para-la-persistencia-de-datos)
    
   - [Paso 9) Creación de la Clase JPA Util para la Persistencia de los datos a la db.](#paso-9-creación-de-la-clase-jpa-util-para-la-persistencia-de-los-datos-a-la-db)
   
   - [Paso 10) Configuración de la Clase JPA Util para la Persistencia de los datos a la db.](#paso-10-configuración-de-la-clase-jpa-util-para-la-persistencia-de-los-datos-a-la-db)
   
   - [Paso 11) Creación y Configuración de la Interfaz I_ClienteRepository para la Definición de los Métodos de Uso (Patrón DAO).](#paso-11-creación-y-configuración-de-la-interfaz-i_clienterepository-para-la-definición-de-los-métodos-de-uso)
   
   - [Paso 12) Creación y Configuración de la Clase ClienteRepository para la Persistencia de Datos con JPA (Patrón DAO).](#paso-12-creación-y-configuración-de-la-clase-clienterepository-para-la-persistencia-de-datos-con-jpa)
   
   - [Paso 13) Creación, Configuración y Test de la Clase Controller ClienteBean para la Interacción de la Vista (index.xhtml), el Modelo (Clase Entidad) y JPA (Clases e Interfaz Repositories) (Patrón MVC).](#paso-13-creación-configuración-y-test-de-la-clase-controller-clientebean-para-la-interacción-de-la-vista-el-modelo-y-jpa)

   - [Paso 14) Creación y Configuración de la Vista XHTML con JSF](#paso-14-creación-y-configuración-de-la-vista-xhtml-con-jsf)



 #### Sección 5) Herramientas del Proyecto
   - [Herramienta Cygwin para el uso de Git.](#uso-de-cygwin)







</br>

## Sección 1) Creación del Proyecto y Configuraciones

</br>

### Paso 1) Creación de un Proyecto Web con Maven en Eclipse y Configuraciónes Iniciales.
#### (Primeramente deberás configurar tu espacio de trabajo, en donde se alojará la aplicación. Cada vez que muevas el Proyecto de Directorio, recomiendo crear o setear nuevamente el Espacio de Trabajo junto con el Servidor).

</br>

* Seleccionar la Pestaña File 
	* --> New 
	* --> Proyect Maven(Si no aparece buscar en Other)


* Por defecto dejar marcado Use default Workspace location 
	* --> Next
	

* Esperar a que carguen los Group id y en Filter escribir `org.apache.maven.archetypes`
	* --> Seleccionar el ultimo(maven-archetype-webapp), este pertenece al Group id `org.apache.maven.archetypes`
	* --> Next


* Configuramos el Group Id (PAQUETE DEL PROYECTO) , en mi caso `com.crud_jsf_jpa_maven`

* Configuramos el Artifact Id (NOMBRE DEL PROYECTO), en mi caso `CRUD_JSF_JPA_HIBERNATE_MAVEN_MYSQL`

* Seguidamente Finish.

* Si cerraste alguna ventana/utilidad de Eclipse.
	* --> Window
	* --> Perspective
	* --> Reset perspective

</br>



### Paso 2) Otras Configuraciones del Proyecto.
#### (Para este paso se anexan configuraciones que para el Proyecto son relevantes, capaz creando el Proyecto desde otro IDE se autoconfiguran dichas configuraciones).

</br>

### 2.1) Actualización de Java-1.7 a 1.8

* Vamos al pom.xml (el archivo al final de todo)

* Dentro de el tag properties donde dice UTF-8 cambiar la version del compiler a 1.8, ctrl+s para guardar

* Click Der sobre el Proyecto
	* --> Maven
	* --> Update Proyect
	* --> Fijate que el Proyecto este seleccionado y Boton ok

* Si cambio JavaSE-1.7 a JavaSE-1.8 se efectuo el cambio

</br>

### 2.2) Paquetes Maven (Java Resources).

* Por Defecto Viene deshabilitada la opción de paquetes Maven, en donde vamos a guardar nuestros paquetes y clases
	* --> Para habilitar las mismas, click Der sobre el Proyecto.
	* --> Properties.
	* --> Buscamos la sección Java Build Path
	* --> Seleccionamos la casilla Maven Dependencies.
	* --> Apply and Close.
	* --> F5 y deberían aparecer `(src/main/java y src/test/java)`







</br>


## Sección 2) Configuración del Servidor y Dependencias del Proyecto

</br>

### Paso 3) Configuración del Servidor de Despliegue Wildfly.
#### (Las Configuraciones de los Servidores de despliegue son casi los mismos pasos para todos, Tomcat, Jboss, Wildfly, etc. En mi caso opté por Wildfly ya que no requiere tanta configuración que el resto y además es más estable, menos restrictivo para algunas cosas, etc. No hay una única configuración, ni tampoco es algo que se configura una única vez, en caso de algún error, eliminar el Servidor creado, volverlo a configurar y paciencia que levantarlo la primera vez es LERDO (Dependiendo el Hardware). Si tarda en ejecutar el proyecto, parar la ejecución y ejecutar de nuevo.


* Link de Descarga del Servidor a implementar https://www.wildfly.org/downloads/

* Descargar, descomprimir, colocar en el directorio del proyecto u otro seguro.

*  Click Derecho sobre el Proyecto.
	* --> Properties
	* --> Buscar `Proyect Facets`
	* --> Pestaña `Runtimes` (a la derecha de todo, al lado de Details)
	* --> Seleccionar el Server WildFly 23.0 Runtime (En mi caso), SI NO APARECE UNO CREARLO, SEGUIR LOS SIG. PASOS
	* --> En caso de que no aparezca Click en `New`
	* --> Se abrirá una interfaz llamada `New Server Runtime Environment`
	* --> Seleccionamos la Version del Server, si descargaste Wildfly 13, selecciona el 13, si es 23, 23, etc para mantener compatibilidad
	* --> Ahora Aparece una Interfaz llamada `JBoss Runtime`
	* --> Dentro de la misma, en Name, colocar el nombre a gusto del server a Utilizar o dejar por defecto
	* --> En `Home Directory` Click en Browse... y buscamos la ruta del server descargado
	* --> Finish
	* --> Ahora debería aparecer el server en la pestaña `Runtimes`.
	* --> Lo Seleccionamos
	* --> Apply and Close

* Otra forma de realizar esto es desde la pestaña `Servers`, en las pestañas de abajo de eclipse(a mí me surgieron algunos problemas, uso la anterior).

* Fijarse que se elimina el cartel rojo sobre el proyecto, indicando que faltaba configurar el servidor de despliegue.

* Deployamos la App en el Server 
	 * --> Click Der sobre `index.jsp` o `index.html` la ruta es `/src/main/webapp/index.jsp`
	 * --> Run As 
	 * --> Run on Server 
	 * --> Seleccionas la versión del Wildfly descargada y configurada
	 * --> Next 
	 * --> Finish
	 * --> ATENTI, si usaste otro proyecto en Maven, el mismo quedó configurado en la pestaña `Configured` junto con el nuevo, seleccionar el viejo y click en el botón `Remove`, nos quedamos con el Nuevo (en mi caso nombre del proyecto).
	 * --> Lo seleccionas y Finish.

* Fijarse el Log en Console (todo el registro de despliegue del Server), tarda unos segundos. Si tarda en ejecutar el proyecto, parar la ejecución y ejecutar de nuevo.

* Si se abre un localhost con Hello World! todo está correcto. Si aparece un mensaje de página no encontrada, borrar el `index.jsp` dentro de `webapp` y volver a crear el index.jsp, luego actualizar proyecto, actualizar Maven y correr Nuevamente en el Server.

* Si no funciona lo anterior, siempre recomiendo cerrar y volver a abrir Eclipse. En caso de que persista el problema volver a configurar el server


</br>


### Paso 4) Dependencias del Proyecto
#### (Las siguientes dependencias del Proyecto se deberán agregar al pom.xml para el correcto funcionamiento del Proyecto).


</br>

#### 4.1)Dependencia para los servlets (JSF trabaja con Servlets).
* En Internet Buscar Maven Repository (https://mvnrepository.com/)
* Buscamos Java Servlet Api (https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api)
* La última fue actualizada el 2018, 4.0.1 (https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api/4.0.1)
	* --> Copias la dependency desde maven o desde acá y lo llevas al pom.xml.
 
```xml
<!-- https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api -->
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>4.0.1</version>
    <scope>provided</scope>
</dependency>

```
* ...
	* --> Control+s guardas y actualizamos el proyecto
	* --> Click Der sobre el proyecto
	* --> Seleccionamos Maven
	* -->  Update Proyect
	* --> Fijate que el Proyecto este seleccionado y Boton ok

</br>


#### 4.2)Dependencia para el conector de Mysql.
* Buscamos Mysql Connector (https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21)
	* --> Copias la dependencia y la incluis en el pom del proyecto

```xml
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.21</version>
</dependency>

```
* ...
	* --> Ctrl + s Guardas 
	* --> Click Der sobre el proyecto
	* --> Maven y update Maven o Alt + F5
	* --> Fijarse dentro de Maven Dependencies si Maven descargo la misma

</br>

#### 4.3) Dependencias para JPA-Hibernate (persistencia de Datos).
* La Primera será el core de Hibernate, hibernate-core la 5.4... Final (https://search.maven.org/artifact/org.hibernate/hibernate-core/5.3.6.Final/jar).

```xml
<!-- https://mvnrepository.com/artifact/org.hibernate/hibernate-core -->
<dependency>
    <groupId>org.hibernate</groupId>
    <artifactId>hibernate-core</artifactId>
    <version>5.3.6.Final</version>
</dependency>
```
* ...

* La Segunda dependencia será para las Lecturas de las Anotaciones para JPA-Hibernate, Javax Annotation API (https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api/1.3.2)

```xml
<!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.2</version>
</dependency>
```
* ...


* La Tercera Dependencia será para las Transformaciones de Objetos Java a Objetos de Documentos XML, Javax XML Bind (https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api/2.3.1) 
```xml
<!-- https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api -->
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.3.1</version>
</dependency>

```



</br>

#### 4.4)Dependencias para JSF (Desarrollo de Interfaces Web).
* La Primera será para la API de JSF
	* --> Buscamos la API de JSF (https://mvnrepository.com/artifact/com.sun.faces/jsf-api/2.2.17)
	* --> Copias la dependencia y la incluis en el pom del proyecto

```xml
<!-- https://mvnrepository.com/artifact/com.sun.faces/jsf-api -->
<dependency>
    <groupId>com.sun.faces</groupId>
    <artifactId>jsf-api</artifactId>
    <version>2.2.17</version>
</dependency>

```
* ...

* La Segunda será para la Implementación de JSF.
	* --> Buscamos la dependencia https://mvnrepository.com/artifact/com.sun.faces/jsf-impl/2.2.17
	* --> Copias la dependencia y la incluis en el pom del proyecto

```xml
<!-- https://mvnrepository.com/artifact/com.sun.faces/jsf-impl -->
<dependency>
    <groupId>com.sun.faces</groupId>
    <artifactId>jsf-impl</artifactId>
    <version>2.2.17</version>
</dependency>

```
* ...
	* --> Ctrl + s Guardas 
	* --> Click Der sobre el proyecto
	* --> Maven y update Maven o Alt + F5
	* --> Fijarse dentro de Maven Dependencies si Maven descargo la misma

</br>


### Paso 5) Configuraciones del Descriptor de Despliegue (web.xml) 
#### (Este Archivos nos proporciona información de configuración y despliegue para los componentes web de Nuestra Aplicación usando Servlets).

* --> Se Puede buscar por Internet alguna Plantilla similar, ya que son las configuraciones estandars, asegurarse de cambiar la versión a 3.1, por defecto viene 2.3

* --> Copiar y Pegar los siguientes namespaces dentro de web.xml (src/main/java/webapp/WEB-INF/web.xml)

```xml
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee 
         http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd"
	version="3.1">

	<display-name>Archetype Created Web Application</display-name>

	<context-param>
		<param-name>javax.faces.PROJECT_STAGE</param-name>
		<param-value>Development</param-value>
	</context-param>
	<servlet>
		<servlet-name>Faces Servlet</servlet-name>
		<servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
		<load-on-startup>1</load-on-startup>
	</servlet>
	<servlet-mapping>
		<servlet-name>Faces Servlet</servlet-name>
		<url-pattern>/faces/*</url-pattern>
	</servlet-mapping>
	
	<servlet-mapping>
		<servlet-name>Faces Servlet</servlet-name>
		<url-pattern>*.jsf</url-pattern>
	</servlet-mapping>
	<session-config>
		<session-timeout>30</session-timeout>
	</session-config>
	
	<welcome-file-list>
		<welcome-file>faces/index.xhtml</welcome-file>
	</welcome-file-list>
</web-app>
```

* --> Actualizamos el Proyecto (F5) y Compilamos con Maven (Alt+F5)
* --> Generalmente si hay algún problema de incompatibilidad con alguna dependencia nos indica eclipse a modo de advertencia, si hasta el momento no surge ningún error seguimos..







</br>

## Sección 3) Configuración del SGDB Mysql y JPA-Hibernate para la Persistencia de Datos

</br>


### Paso 6) Configuraciones del SGDB Mysql.
#### (El Sistema de Gestión de Base de datos(SGDB) es un conjunto de programas que nos permiten gestionar la base de datos, es común confundirse con el Nombre, Mysql como tal no es la Base de Datos, sino un SGDB, el Motor de Mysql que he implementado es INNODB, el más común).

* Hasta acá deberías tener incluido el conector para Mysql en el pom para que se descargue la dependencia (Fijarse la Sección de dependencias).

* Abrimos la Herramienta XAMPP ( Buscate un microtutorial para usarla ), o la que se tenga, levantamos los Servicios de Mysql y Creamos una Nueva Base de Datos.
	* --> Depende que S.O tengas podrás o no tener esta herramienta, no hace falta tenerla, también es posible levantar un servicio mysql desde la bash en Linux
	* --> Una vez abierto, en el control panel inicializas los servicios de Mysql y Apache para ver las dbs desde el localhost en el Navegador
	* --> Colocas localhost... en el navegador y accedes a PHPMYADMIN o clickeas Admin desde xampp en la parte de Apache.
	* --> Vamos a crear una db de prueba, para eso en la esquina izquierda superior tocás en Nueva.
	* --> Colocas el Nombre a la derecha (en mi caso db_test_jpa_jsf) y luego en Crear
	* --> Vamos a Crear una sola tabla con solo 2 campos para persistir posteriormente los datos con Hibernate.
	* --> Selecciona la db creada y a la derecha te va a aparecer crear tabla, colocamos clientes, numero de columnas 2 y continuar.
	* --> Ahora creamos los campos(columnas), el primero sera id y el segundo nombre, dejamos todo por defecto.
	* --> Guardar.
	* --> A la izquierda, debajo de la db_test_jpa_jsf, se te deberia desplegar la nueva tabla y si la seleccionas los nuevos campos, id y nombre.
	* --> Solamente creamos la db, la tabla y los 2 campos, la config de usuarios, atributos de los campos , etc, lo dejamos todo por defecto para realizar la conexion con el connector de mysql posteriormente.
	* --> Fijate de Visualizar la db creada, la tabla y los campos, continuamos..


</br>


### Paso 7) Configuración de JPA-HIBERNATE para la Persistencia de datos.
#### (JPA-HIBERNATE nos va a ahorrar tiempo de desarrollo de las clases en java para cada entidad mapeando atributos y completando el código para persistir los datos en una db con el SGDB Mysql).

* Dependencias JPA-HIBERNATE
	* --> Hasta ese punto deberías haber incluido las dependencias descritas en la sección dependencias del Proyecto(Core de  Hibernate, JPA para hibernate y Javax Annotation API).
	* --> Seguidamente vamos a Crear el fichero persistence.xml

* Archivo de Configuración XML de JPA-Hibernate (persistence.xml).
	* --> Vamos a crear el Archivo de configuración persistence.xml dentro de la carpeta META-INF que se deberá alojar en src/main/java. Actualmente este archivo de configuración se almacena junto al web.xml. Pero utilizando JSF y Dependencias con versiones antiguas surgen algunos errores, entonces mantendremos el formato definido
	* --> Creamos el persistence.xml dentro de META-INF
	* --> Click Derecho sobre src/main/java
	* --> New Folder o buscar en Other
	* --> Asegurarse que se está sobre la ruta nombrada y escribimos META-INF
	* --> Dentro de esta carpeta creamos un archivo .xml
	* --> Filtramos escribiendo xml, seleccinamos xml file
	* --> Asegurarse que la ruta sea la indicada anteriormente, FormularioMaven/src/main/java/META-INF
	* --> En el file Name escribimos persistence.xml
	* --> Next, Next
	* --> Todo por defecto y Finish
	* --> En eclipse tenes varias vistas para ciertos tipos de archivos, fijate debajo de este que tenes Design y Source, toca en Source
	* --> Tendriamos solamente una linea de codigo ( <?xml version="1.0" encoding="UTF-8"?> )

* Configurando el Archivo persistence.xml para JPA-Hibernate
	* --> Dentro del archivo persistence.xml vamos a configurar la conexión con mysql y Nuestro Mapeo ORM de JPA-Hibernate.
	* --> Recomiendo la siguiente página para conocer acerca de este archivo. `(https://vladmihalcea.com/jpa-persistence-xml/)`
	* Vamos a pasarle el nombre de la db y otras propiedades de configuración, debajo del código se explica esto
	* --> Copiar el siguiente código y pegarlo dentro del persistence.xml
	* --> No dejar espacios al comienzo
	* --> Código Snippet..

```xml
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
             http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd"
  version="2.1">
  
    <persistence-unit name="jpaPersistence" transaction-type="RESOURCE_LOCAL">
 
      
 		<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
 		
 		
	    <properties>
	     <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/db_test_jpa_jsf?serverTimezone=UTC"/>
	      <property name="javax.persistence.jdbc.user" value="root" />
	      <property name="javax.persistence.jdbc.password" value="" />
	       <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>

	      <property name="hibernate.show_sql" value="true" />
	      <property name="hibernate.hbm2ddl.auto" value="update" />        
	    </properties>
	      
    </persistence-unit>
</persistence>

```

* --> ATENTI: Las propiedades de este Archivo depende del Proyecto. Si se sigue al pie de la letra, es copiar y pegar, las propiedades varian dependiendo las configuraciones dadas en la db creada.      
*  La Propiedad <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/db_test_jpa_jsf?serverTimezone=UTC"/> posee el nombre de la db creada (db_test_jpa_jsf) y el puerto por defecto de mysql.
*  Lo mismo para la propiedad user y password. 












</br>

##  Sección 4) Creación, Configuración y Manejo de Clases, Interfaces y Paquetes para el CRUD MVC
#### (CRUD = Create, Read, Update, Delete | MVC = Modelo-Vista-Controlador)
#### (MVC = Patrón de Diseño Modelo Vista Controlador)

</br>

### Paso 8) Creación de Nuestra Clase Entidad-Modelo Cliente para la Persistencia de Datos


* Creación de nuestro paquete para la Clase Modelo-Entidad Cliente.
	* --> Click Der sobre src/main/java
	* --> New Package
	* --> En Name escribimos com.mypackages.models (en mi caso)
	* --> Creamos la Clase Cliente
	* --> Click Der sobre com.mypackages.models
	* --> En Name escribimos Cliente
	* --> Los atributos de la clase deberán ser los mismos que los campos creados en la db.
	* --> Luego de crear los atributos creamos los getters y setters.
	* --> Seleccionas los atributos y en Source generate getters and setters (acomodarlos a preferencia).
	* --> También toString de la misma forma.
	* --> Implementamos el uso de anotaciones para que hibernate reconozca el modelo de persistencia
	* --> @Entity (Definimos a Hibernate la entidad)
	* --> @Table(name="clientes") (Definimos a Hibernate el nombre Tabla de la db, siempre el name igual que la tabla de la db)
	* --> Se deberan generan las anotaciones para cada atributo, recordar que el id deberá ser auto incrementable, entonces @GeneratedValue(strategy=GenerationType.IDENTITY)
	* --> Para los atributos de tipo String la anotation será @Column


```java

package com.mypackages.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="clientes") //Mismo nombre de tabla de la db
public class Cliente {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column
	private String nombre;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + "]";
	}
}

```

</br>


### Paso 9) Creación de la Clase `JPA Util`
#### (En esta Clase se crea el objeto que nos permite realizar la persistencia de los datos y conexión en la db).

* Creación del paquete que alojará la Clase dentro de la ruta ya usada (src/main/java).
	* --> Sobre la misma Click Der, New, package
	* --> En Name colocamos com.mypackages.utils
	* --> Finish y F5 para Actualizar.
	* --> Dentro del Paquete Creamos la Clase JpaUtil.
	* --> Click Der sobre el paquete, New, Class
	* --> Asegurarse estar en la ruta estipulada y en Name colocamos JpaUtil
	* --> Finish y F5 para actualizar
	* --> Te debería haber quedado..

```java

package com.mypackages.utils;

public class JpaUtil {

}

```


</br>



### Paso 10) Configuración de la Clase `JPA Util`
#### (Vamos a configurar la Unidad de Persistencia, el entityManager y la Persistencia de la misma con el EntityManagerFactory. Todo esto para persistir los datos desde esta Clase).

 * Unidad de Persistencia = Modelo relacional de objeto que correlaciona las clases Java.

 * Entity Manager  = El entity manager comprueba qué entidades han sido modificadas y vuelca los cambios a la base de datos.

 * Entity Manager  Factory = Es la clase que se encarga de abrir la conexión a la base de datos y pone a nuestra disposición los distintos EntityManager que usemos.
 

* Primeramente Configuramos el Nombre de la Unidad de Persistencia dentro de la Clase Creada JpaUtil

```java
private static final String PERSISTENCE_UNIT_NAME = "jpaPersistence";

```
* Notar que el Nombre deberá ser el mismo que el creado peviamente en el persistence.xml ... ```xml <persistence-unit name="jpaPersistence"> ```

* Ahoramos Creamos un Objeto de tipo EntityManagerFactory que será el que abra la conexión a la db creada. Importar la Clase

```java
private static EntityManagerFactory factory;

```

* Seguidamento vamos a crear 2 métodos para la conexión a la db.

* El Primer Método será un getter y tendrá la Lógica de Persistir los datos de la Unidad de Persistencia con el EntityManagerFactory en caso de que no se haya persistido aún. Importar la Clase requerida.

```java
public static EntityManagerFactory getEntityManagerFactory(){
	
	if (factory == null){
		
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	return factory;

}


```

* El Segundo Método finaliza la conexión a la db si es que el EntityManagerFactory tiene un Valor, si lo tiene, significa que se ha persistido el objeto en la db o se establecio la conexión.


```java
public static void shutdown(){
	if(factory != null){
		factory.close();
	}
}


```

* El Código Completo quedaría..


```java
package com.mypackages.utils;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {
	
	private static final String PERSISTENCE_UNIT_NAME = "jpaPersistence";
	private static EntityManagerFactory factory;
	
	public static EntityManagerFactory getEntityManagerFactory(){
		
		if (factory == null){
			
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;

	}
	
	public static void shutdown(){
		if(factory != null){
			factory.close();
		}
	}

}

```
* ATENTI: Ahora la Pregunta es, porqué no Crear un Paquete y Clase con el Nombre EntityManagerFactory directamente para no marearnos mucho? Por qué ya es una Clase de Java, recordár las convenciones de Nombres, así que guardaremos esta fábrica de conexiones de Unidades de Persistencias dentro de Jpa Util.



</br>



### Paso 11) Creación y Configuración de la Interfaz `I_ClienteRepository`
#### (La Arquitectura Dao suministra las interfaces  para poder usar los metodos CRUD sin necesidad de duplicar codigo. Vamos a Crear una Interfaz que nos provea de los métodos a implementar para usarlos dentro de la Clase Repository con JPA).

</br>

#### 11.1) Creación de la Interfaz `I_ClienteRepository`
 
* Creamos un Nuevo paquete para las Interfaces.
	* --> Sobre la ruta src/main/java Click Der, New, package
	* --> En Name colocamos com.mypackages.repositories.interfaces
	* --> Finish y F5 para Actualizar.
* Dentro del Paquete Creamos la Interfaz I_ClienteRepository.
	* --> Click Der sobre el paquete, New, Interface
	* --> Asegurarse estar en la ruta estipulada y en Name colocamos I_ClienteRepository
	* --> Finish y F5 para actualizar
	* --> Te debería haber quedado..

```java

package com.mypackages.repositories.interfaces;

public interface I_ClienteRepository {

}


```


</br>

#### 11.2) Configuración de la Interfaz `I_ClienteRepository`
 
* Creación de los métodos para ser implementados y configurados en la clase ClienteRepository CON JPA
* Los Métodos serán save, remove, update,getAll, getById, etc. El  Método getAll será una Lista de Tipo Cliente, el método getById devolverá un objeto cliente según el id pasado en su parametro. Todo esto lo veremos a detalle en la Clase Repository cuando se implementen dichos métodos.



```java

package com.mypackages.repositories.interfaces;

import com.mypackages.models.Cliente;

public interface I_ClienteRepository {
	
	//MÉTODOS CRUD JPA
	void save(Cliente cliente);
	
	void remove(Cliente cliente);
	
	void update(Cliente cliente);
	
	List<Cliente> getAll();
	
	public Cliente getById(int id);

	
}


```

</br>


### Paso 12) Creación y Configuración de la Clase `ClienteRepository `
#### (La Arquitectura Dao suministra las interfaces para poder usar los metodos CRUD sin necesidad de duplicar codigo.Vamos a Crear una Clase Implementando la Interfaz Creada y dándole el cuerpo a los métodos de la misma para implementar JPA).

</br>

#### 12.1) Creación de la Clase `ClienteRepository`
 
* Primeramente Creamos un Nuevo paquete para los Repositories JPA.
	* --> Sobre la ruta src/main/java Click Der, New, package
	* --> En Name colocamos com.mypackages.repositories.jpa
	* --> Finish y F5 para Actualizar.
	* --> Dentro del Paquete Creamos la Clase dao ClienteRepository.
	* --> Click Der sobre el paquete, New, Class
	* --> Asegurarse estar en la ruta estipulada y en Name colocamos ClienteRepository
	* --> Finish y F5 para actualizar
	* --> Te debería haber quedado..

```java

package com.mypackages.repositories.jpa;

public class ClienteRepository {

}

```

</br>

#### 12.2) Configuración de la Clase `ClienteRepository`

* Vamos a implementar la Interfaz Creada para trabajar con los métodos de la misma.

```java

package com.mypackages.repositories.jpa;

import java.util.List;
import com.mypackages.models.Cliente;
import com.mypackages.repositories.interfaces.I_ClienteRepository;


public class ClienteRepository implements I_ClienteRepository{

	@Override
	public void save(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Cliente cliente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cliente> getAll() {
		// TODO Auto-generated method stub
		return null;
	}
}

```

* Creamos el Objeto EntityManager y usamos la Clase Creada JpaUtil que tiene el pull de conexiones. El objeto instanciado nos va a permitir usar los métodos de la Interfaz creada.

```java

EntityManager entity = JpaUtil.getEntityManagerFactory().createEntityManager();
```


</br>

#### 12.3) Creación de los Métodos de la Clase `ClienteRepository`
#### (Con JPA-Hibernate se trabaja con Transacciones (los objetos creados tienen un tiempo de vida y hay que indicar cada proceso del mismo).


</br>

#### 12.3.1) Creación del Método `save()`
* Este Método se deberá encargar de guardar el objeto Cliente en la db
* Comenzaremos una transacción
```java

	@Override
	public void save(Cliente cliente) {
		entity.getTransaction().begin();
		
	}

```
* Persistimos el Objeto Cliente en la Tabla de la Base de Datos

```java

	@Override
	public void save(Cliente cliente) {
		entity.getTransaction().begin();
		entity.persist(cliente);
		
	}

```

* Cerramos la Transacción y Guardamos la Persistencia del Objeto Cliente con un commit en la Tabla de la Base de Datos

```java

@Override
	public void save(Cliente cliente) {
		entity.getTransaction().begin();
		entity.persist(cliente);
		entity.getTransaction().commit();		
	}

```

* Cerramos la Conexión a la Base de Datos implementando el metodo creado shutdown de la Clase JpaUtil

```java

	@Override
	public void save(Cliente cliente) {
		entity.getTransaction().begin();
		entity.persist(cliente);
		entity.getTransaction().commit();	
		JpaUtil.shutdown();
	}

```


</br>

#### 12.3.2) Creación del Método `remove()`
* --> Comenzaremos una transacción
```java

	@Override
	public void remove(Cliente cliente) {
		entity.getTransaction().begin();
		
	}
```

* --> Eliminamos el objeto
```java

	@Override
	public void remove(Cliente cliente) {
		entity.getTransaction().begin();
		entity.remove(cliente);
		
		
	}
```

* --> Cerramos la Transacción y Guardamos la Modificación del Objeto Cliente Eliminado en la Tabla de la Base de Datos.
```java

	@Override
	public void remove(Cliente cliente) {
		entity.getTransaction().begin();
		entity.remove(cliente);
		entity.getTransaction().commit();
		
		
	}
```

* --> Cerramos la Conexión a la Base de Datos implementando el metodo creado shutdown de la Clase JpaUtil
```java

	@Override
	public void remove(Cliente cliente) {
		entity.getTransaction().begin();
		entity.remove(cliente);
		entity.getTransaction().commit();
		JpaUtil.shutdown();
		
		
	}
```


</br>

#### 12.3.3) Creación del Método `update()`
* --> Comenzaremos una transacción
```java

	@Override
	public void update(Cliente cliente) {
		entity.getTransaction().begin();
		
	}
```
* --> Actualizamos cualquier modificación del Objeto Cliente
```java

	@Override
	public void update(Cliente cliente) {
		entity.getTransaction().begin();
		entity.merge(cliente);
		
	}
```

* --> Guardamos la Persistencia del Objeto Cliente en la Tabla de la Base de Datos con un commit y Cerramos la Conexión del EntityManager.
```java
	@Override
	public void update(Cliente cliente) {
		entity.getTransaction().begin();
		entity.merge(cliente);
		entity.getTransaction().commit();	
		JpaUtil.shutdown();
		
	}
```


</br>

#### 12.3.4) Creación del Método `getAll()`
* --> Comenzaremos una transacción

```java

@Override
	public List<Cliente> getAll() {
	
		entity.getTransaction().begin();
		
		
		
		return null;
	}
```
* --> Creamos una Lista de tipo Cliente 
```java

@Override
	public List<Cliente> getAll() {
	
		entity.getTransaction().begin();
		
		List<Cliente> listaClientes = new ArrayList<Cliente>();
		
		
		
		return null;
	}
```
* --> Creamos una consulta con JPA a traves del EntityManager que nos devuelva todos los clientes y ese resultado lo guardamos en la Lista Creada, utilizamos `HQL`, que es un lenguaje de consultas que usa Hibernate para obtener los objetos desde la db mapeando las entidades Desarrolladas. El principal punto fuerte es que se realizan las consultas sobre los objetos Java, en nuestro modelo de negocio, las entidades que se persisten en Hibernate. Importamos la Clase Query del paquete del `javax.persistence`
* Importante tener en consideración que la consulta `HQL` deberá incluir el nombre de la Entidad y no de la base de datos, en nuestro caso `Cliente`, es case sensitive, el nombre deberá ser el nombre que se le paso a la etiqueta @Table de la entidad.
* Recomiendo http://www.cursohibernate.es/doku.php?id=unidades:05_hibernate_query_language:02_hql


```java

@Override
	public List<Cliente> getAll() {
	

		entityManager.getTransaction().begin();
		
		List<Cliente> listaClientes = new ArrayList<>();
		
		//Obtenemos los registros de la Tabla Cliente
		Query query = entityManager.createQuery("SELECT c from Cliente c");
		
		//Guardamos los registros en la Lista
		listaClientes = query.getResultList();
			
		
		
		return null;
	}
```
* -->  Comitiamos, Cerramos la conexion y devolvemos la lista de Clientes.


```java

@Override
	public List<Cliente> getAll() {
	
		entityManager.getTransaction().begin();
		
		List<Cliente> listaClientes = new ArrayList<>();
		
		//Obtenemos los registros de la Tabla Cliente
		Query query = entityManager.createQuery("SELECT c from Cliente c");
		
		//Guardamos los registros en la Lista
		listaClientes = query.getResultList();
		
		
		entityManager.getTransaction().commit();
		
		JpaUtil.shutdown();
		
		return listaClientes;
	}
```



</br>

#### 12.3.5) Creación del Método `getById()`
* --> Comenzaremos una transacción
```java

	@Override
	public Cliente getById(int id) {
		
		entityManager.getTransaction().begin();
		
		
		return null;
	}

```
* --> Creamos un Objeto de Tipo Cliente
```java

	@Override
	public Cliente getById(int id) {
		
		entityManager.getTransaction().begin();
		
		Cliente cliente = new Cliente();
		
		
		return null;
	}

```

* --> Guardamos el Objeto encontrado a traves del metodo find del entityManager, si no lo encuentra lo guarda nulo.

```java

	@Override
	public Cliente getById(int id) {
		
		entityManager.getTransaction().begin();
		
		Cliente cliente = new Cliente();
		
		cliente = entityManager.find(Cliente.class , id);
		
		
		return null;
	}

```

* --> Comitiamos los cambios del Objeto Cliente en la Tabla de la Base de Datos y cerramos la conexión.

```java

	@Override
	public Cliente getById(int id) {
		
		entityManager.getTransaction().begin();
		
		Cliente cliente = new Cliente();
		
		cliente = entityManager.find(Cliente.class , id);
		
		entityManager.getTransaction().commit();
		
		
		return null;
	}

```

* --> Cerramos la Conexión a la Base de Datos implementando el metodo creado shutdown de la Clase JpaUtil


```java

	@Override
	public Cliente getById(int id) {
		
		entityManager.getTransaction().begin();
		
		Cliente cliente = new Cliente();
		
		cliente = entityManager.find(Cliente.class , id);
		
		entityManager.getTransaction().commit();
		
		JpaUtil.shutdown();
		
		
		return null;
	}

```

* --> Indicamos que el Método devuelva el Objeto Clientes con el Id pedido.
```java
	@Override
	public Cliente getById(int id) {
		
		entityManager.getTransaction().begin();
		
		Cliente cliente = new Cliente();
		
		cliente = entityManager.find(Cliente.class , id);
		
		entityManager.getTransaction().commit();
		
		JpaUtil.shutdown();
		
		
		return cliente;
	}

```


</br>
</br>

</br>

#### 12.3.6) Código Completo de la Clase `ClienteRepository`

```java
package com.mypackages.repositories.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mypackages.models.Cliente;
import com.mypackages.repositories.interfaces.I_ClienteRepository;
import com.mypackages.utils.JpaUtil;


public class ClienteRepository implements I_ClienteRepository{

	
	EntityManager entityManager = JpaUtil.getEntityManagerFactory().createEntityManager();

	
	
	@Override
	public void save(Cliente cliente) {
		entityManager.getTransaction().begin();
		entityManager.persist(cliente);
		entityManager.getTransaction().commit();	
		JpaUtil.shutdown();
	}

	@Override
	public void remove(Cliente cliente) {
		entityManager.getTransaction().begin();
		entityManager.remove(cliente);
		entityManager.getTransaction().commit();
		JpaUtil.shutdown();
		
		
	}

	@Override
	public void update(Cliente cliente) {
		entityManager.getTransaction().begin();
		entityManager.merge(cliente);
		entityManager.getTransaction().commit();	
		JpaUtil.shutdown();
		
	}

	@Override
	public List<Cliente> getAll() {
		

		entityManager.getTransaction().begin();
		
		List<Cliente> listaClientes = new ArrayList<>();
		
		//Obtenemos los registros de la Tabla Cliente
		Query query = entityManager.createQuery("SELECT c from Cliente c");
		
		//Guardamos los registros en la Lista
		listaClientes = query.getResultList();
		
		
		entityManager.getTransaction().commit();
		
		JpaUtil.shutdown();
		
		return listaClientes;
	}

	@Override
	public Cliente getById(int id) {
		
		entityManager.getTransaction().begin();
		
		Cliente cliente = new Cliente();
		
		cliente = entityManager.find(Cliente.class , id);
		
		entityManager.getTransaction().commit();
		
		JpaUtil.shutdown();
		
		
		return cliente;
	}

}



```

</br>

### Paso 13) Creación, Configuración y Test de la Clase Controller `ClienteBean`
#### (La Clase Controller es para que la misma realice la interacción(eventos) que hace el usuario en la Vista(index.xhtml), luego la vista realice las peticiones al modelo a traves de jpa(clase e interfaz repositories) para pasarlos a la base de datos y devolverlos a la vista (Patrón MVC). La Clase la vamos a llamar ClienteBean. Recordar que un bean es una clase con requisitos de negocio concretos).

</br>

#### 13.1) Creación de la Clase Controladora `ClienteBean`
* Primero creamos un Nuevo paquete para la Clase. 
	* --> Sobre la ruta src/main/java Click Der, New, package
	* --> En Name colocamos com.mypackages.controllers
	* --> Finish y F5 para Actualizar.
* Dentro del Paquete Creamos la Clase Controller llamada ClienteBean.
	* --> Click Der sobre el paquete, New, Class
	* --> Asegurarse estar en la ruta estipulada y en Name colocamos ClienteBean
	* --> Finish y F5 para actualizar
	* --> Te debería haber quedado..

```java

package com.mypackage.controllers;

public class ClienteBean {

}


```


</br>


#### 13.2) Configuración de la Clase Controller `ClienteBean`.
* Vamos a hacer uso de Anotaciones para trabajar con JSF.
	* --> Hacemos uso de la anotacion @ManagedBean y @RequestScoped.
	* --> La primera es para que JSF reconozca la clase como un componente Managed Bean(Componente JSF) y la Segunda para indicarle el Alcance de esta Clase. Le indicamos que siempre que se realice la peticion hacia el servidor se mantenga el Bean. Dentro del ManagedBean le pasamos el nombre del mismo

```java
package com.mypackage.controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@SuppressWarnings("deprecation")
@ManagedBean(name="ClienteBean")
@RequestScoped
public class ClienteBean {

}

```

* Seguidamente creamos un metodo que nos muestre todos los Clientes de la base de datos implementando los metodos del repositorio creado.

```java
	public List<Cliente> getAll(){
		
		
		ClienteRepository clienteRepository = new ClienteRepository();
		

		 return clienteRepository.getAll();
		

		
	}

```
* Código Completo ...

```java
package com.mypackages.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.mypackages.models.Cliente;
import com.mypackages.repositories.jpa.ClienteRepository;

@SuppressWarnings("deprecation")
@ManagedBean(name="ClienteBean")
@RequestScoped
public class ClienteBean {
	
	
	public List<Cliente> getAll(){
		
		
		ClienteRepository clienteRepository = new ClienteRepository();
		

		 return clienteRepository.getAll();
		

		
	}

	

}


```



</br>

#### 13.3) Test de la Clase Controladora `ClienteBean`
* Creamos un Nuevo paquete para la Clase. 
* --> Sobre la ruta src/main/java Click Der, New, package
* --> Nuestro paquete será `mypackages.tests`
* --> Creamos la Clase `TestClienteBean`
* --> Usamos el Repository para obtener los registros aplicando java8
* --> Para que Hibernate traiga los registros debemos tener levantado el servicio de Mysql
* --> Ejecutamos la clase y visualizamos los registros por Consola
* Código de la Clase..

```java
package com.mypackages.tests;

import com.mypackages.repositories.jpa.ClienteRepository;

public class TestClienteBean {
	
	//TEST MOCK
	public static void main(String[] args) {
	
			ClienteRepository clienteRepository = new ClienteRepository();
			
			clienteRepository.getAll().forEach(System.out::println);	
		}
	

}

```

</br>

### Paso 14) Creación y Configuración de la Vista XHTML con JSF
#### (Si Trabajamos con JSF no es válido el index.html, osea html puro, ya que el mismo no nos permite trabajar con componentes JSF, vamos a usar xhtml).

</br>

#### 5.1) Creación de la Vista.
* XHTML = Es HTML expresado como XML válido.
* Instalación de Herramientas para el Uso de xhtml
	* --> Por defecto Eclipse no trae instalado los paquetes para el uso de xhtml, tendremos que instalarlos desde Eclipse.
	* --> Vamos a Help, Eclipse Marketplace y en Search colocamos JBoss Tools.
	* --> Instalar JBoss Tools 4.21.0.Final, Aaegurarse que esté instalado y reiniciar el IDE.
* Creación del Archivo index.xhtml
	* --> Dentro de webapp (src/main/java/webapp) creamos el index.xhtml
	* --> Click Der , New, XHTML Page,. Si no aparece en Other y Filtras.
	* --> En el File name colocamos index.xhtml y Finish

</br>


#### 5.2) Configuración de la Vista.
##### (Las Etiquetas en html son como los componentes en jsf).
* Vamos a darle el cuerpo al Archivo, buscar una plantilla base a gusto, te recomiendo https://www.adictosaltrabajo.com/2010/04/20/jsf-2-facelets-templates-and-composite-components/ o copiar la siguiente


```html

<!DOCTYPE HTML>
<html lang="es" xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://xmlns.jcp.org/jsf/core">
<h:head>
	<meta charset="utf-8" name="viewport"
		content="width=device-width, initial-scale=1"
		http-equiv="X-UA-Conpatible" />
	<title>Plantilla Básica JSF</title>
</h:head>
<h:body>
	
	<h3>
	  	<h:outputText value="LISTA DE CLIENTES"></h:outputText>
	</h3>
	
</h:body>
</html>

```
* Todos los componentes en JSF comienzan con el prefijo h dentro de las etiquetas
* Vamos a Crear una Tabla para Desplegar la información del Manager Bean(Clase Controller), primero creamos la etiqueta de tabla, dentro la columna ID y Nombre, cada columna tiene una etiqueta de tipo facet, que es un tipo especial de encabezado.

```html

<h:dataTable border="1">
		
		<h:column>
			
			<f:facet name="header">ID</f:facet>
			
		</h:column>
		
			<h:column>
			
			<f:facet name="header">Nombre</f:facet>
			
		</h:column>
		
</h:dataTable>



```

* Vamos a traer los datos de la Clase Bean colocando el nombre de la clase dentro del dataTable e invocando el método getAll() de la Clase ClienteRepository

``` html

<h:dataTable value="#{ClienteBean.getAll()}" border="1">
		
		<h:column>
			
			<f:facet name="header">ID</f:facet>
			
		</h:column>
		
			<h:column>
			
			<f:facet name="header">Nombre</f:facet>
			
		</h:column>
		
</h:dataTable>


```

* Necesitamos recorrer la lista y mostrarla en la tabla, usaremos una variable para almacenar los objetos que vengan en la lista. Las variables en JSF dentro de etiquetas se declaran con el nombre var

``` html

	<h:dataTable  value="#{ClienteBean.getAll()}" var="objetoCliente" border="1">
		
		<h:column>
			
			<f:facet name="header">ID</f:facet>
			
		</h:column>
		
			<h:column>
			
			<f:facet name="header">Nombre</f:facet>
			
		</h:column>
		
	</h:dataTable>

``` 

* Vamos a mostrar los campos de los objetos (de la clase, no los campos de la db. De eso se encarga hibernate-jpa con las clases e interfaces creadas) que traemos del Bean (id, nombre) con los binds("#{}") y a traves de la variable declarada objetoCliente.

``` html
	<h:dataTable  value="#{ClienteBean.getAll()}" var="objetoCliente" border="1">
		
		<h:column>
			
			<f:facet name="header">ID</f:facet>
			<h:outputText value="#{objetoCliente.id}"></h:outputText>
			
		</h:column>
		
			<h:column>
			
			<f:facet name="header">Nombre</f:facet>
			<h:outputText value="#{objetoCliente.nombre}"></h:outputText>
			
			
		</h:column>
		
	</h:dataTable>

``` 

* Código Completo

``` html

<!DOCTYPE HTML>
<html lang="es" xmlns="http://www.w3.org/1999/xhtml"
	xmlns:h="http://java.sun.com/jsf/html"
	xmlns:f="http://xmlns.jcp.org/jsf/core">
<h:head>
	<meta charset="utf-8" name="viewport"
		content="width=device-width, initial-scale=1"
		http-equiv="X-UA-Conpatible" />
	<title>Plantilla Básica JSF</title>
</h:head>
<h:body>

	<h2>
		<h:outputText value="LISTA DE CLIENTES"></h:outputText>
	</h2>
	
	<h:dataTable  value="#{ClienteBean.getAll()}" var="objetoCliente" border="1">
		
		<h:column>
			
			<f:facet name="header">ID</f:facet>
			<h:outputText value="#{objetoCliente.id}"></h:outputText>
			
		</h:column>
		
			<h:column>
			
			<f:facet name="header">Nombre</f:facet>
			<h:outputText value="#{objetoCliente.nombre}"></h:outputText>
			
			
		</h:column>
		
	</h:dataTable>
	
</h:body>
</html>


``` 
* Si lo Ejecutamos no vemos ningún Registro de la DB, hasta el momento no tenemos datos en la misma, vamos a abrir phpMyAdmin y cargar algunos Registros de Prueba. El comando sería..

```sql
use db_test_jpa_jsf;
insert into clientes(id, nombre) values 
(1,"Marcos"),
(2,"Julieta"),
(3,"Rocío"),
(4,"Juan");

```





</br>







</br>

## Uso de Cygwin.
#### (Esta es una magnífica herramienta para trabajar con git a nivel consola desde algún IDE. Desde mi punto de vista simplifica muchísimo
la integración del Proyecto con Git).

#### 1)Descargar la herramienta en https://cygwin.com/install.html dependiendo la arquitectura que se tenga (32-64 bits)
* --> Como toda aplicacion siguiente.... siguiente....
* --> (IMPORTANTE:NO TENER ABIERTO EL IDE DURANTE LA INSTALACION, SINO NO RECONOCE EL PATH)

#### 2) Seleccionar el proyecto en Eclipse Ide para implementar git.
* --> Click Der 
* --> Show in Local Terminal
* --> Seleccionas Git Console o Terminal
* --> Si seleccionaste git console, te debería aparecer algo parecido a esto(Ruta Absoluta de tu proyecto)...
* --> andre@DESKTOP-7BN69K1 MINGW64 /c/Users/andre/OneDrive/Escritorio/LenguajesProgramacion/JAVA_AplicacionesWeb/Formu
larioMavenJSP/FormularioMaven (master)

#### 4)Creación de un Nuevo Repositorio git o usar el ya creado
* --> Debajo de esta sección, explico como usar git de forma detallada.

#### 5) Más Información https://ourcodeworld.com/articles/read/680/how-to-configure-an-integrated-terminal-command-prompt-in-netbeans-for-windows

</br>

## Subir el proyecto al repositorio con la terminal a traves de Cygwin en Eclipse
#### 1)Creamos un nuevo repositorio en GitHub.

#### 2)Inicializamos nuestro repositorio local .git desde la terminal.
* git init

#### 3)Agregamos lo desarrollado a nuestro repo local desde la terminal.
* git add *

#### 4)Agregamos lo que tenemos en nuestro repo local al área de Trabajo desde la terminal.
* git commit -m "agrega un comentario entre comillas"

#### 5)Le indicamos a git donde se va a almacenar nuestro proyecto(fijate en tu repositorio de github cual es el enlace de tu proyecto(esta en code)).
* git remote add origin https://github.com/andresWeitzel/CRUD_JSF_JPA_HIBERNATE_MAVEN_MYSQL

#### 6)Subimos nuestro proyecto.
* git push -u origin master


</br>


## Actualización de el proyecto al repositorio con la terminal a traves de Cygwin en Netbeans

#### 1)Visualizamos las modificaciones realizadas en local
* git status

#### 2)Agregamos lo modificado al area de trabajo
* git add *

#### 3)Confirmamos las modificaciones realizadas
* git commit -m "tu commit entre comillas"

#### 4)Sincronizamos y traemos todos los cambios del repositorio remoto a la rama en la que estemos trabajando actualmente.
##### (SOLO SI SE REALIZARON CAMBIOS DESDE OTRA LADO, ej: en github u/o/y un equipo de trabajo)
* git pull https://github.com/andresWeitzel/CRUD_JSF_JPA_HIBERNATE_MAVEN_MYSQL

#### 5)Enviamos todos los cambios locales al repo en github
* git push https://github.com/andresWeitzel/CRUD_JSF_JPA_HIBERNATE_MAVEN_MYSQL

#### 6) En casos extremos pisamos todo el repositorio
* git push -f --set-upstream origin master


</br>

