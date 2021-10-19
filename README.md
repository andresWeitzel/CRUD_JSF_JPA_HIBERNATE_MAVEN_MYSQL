# CRUD_JSF_JPA_HIBERNATE_MAVEN_MYSQL

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
| Cygwin | 3.1.6-1  | Colección de Herramientas / Terminal en Windows integrada al IDE Eclipse |
| Git | 2.29.1.windows.1  | Control de Versiones |

</br>

| **Dependencias Maven** | **Finalidad** |   
| ------------- | ------------- |
| javax.servlet-api-4.0.1|  Librerías para el uso de Servlets |
| mysql-connector-8.0.21|  Conexión e Implementación de Queries a la db con Mysql |
| Hibernate-Core 5.4.27| El Core de Hibernate |
| JPA-Hibernate 2.1 |  Persistencia de datos a la db |
| Javax Annotation API 1.3.2 | Api para la lectura de Annotation |
| JSF API 2.2.13 | API para el Desarrollo de Interfaces | 
| JSF Impl 2.2.20 | Especificaciones para la Implementación de JSF | 


* Repostorio dependencia servlet: https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api
* Repositorio dependencia mysql: https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21
* Repositorio dependencia Hibernate-Core: https://search.maven.org/artifact/org.hibernate/hibernate-core/5.4.27.Final/jar
* Repositorio dependencia JPA-Hibernate: https://mvnrepository.com/artifact/org.hibernate.javax.persistence/hibernate-jpa-2.1-api/1.0.2.Final
* Repositorio dependencia Javax Annotation API: https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api/1.3.2
* Repositorio dependencia API JSF: https://mvnrepository.com/artifact/com.sun.faces/jsf-api/2.2.13
* Repositorio dependencia Implementación JSF: https://mvnrepository.com/artifact/com.sun.faces/jsf-impl/2.2.20

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

## `Documentación y Guía del Proyecto `
#### (Esta Documentación que Desarrollé es para la Creación, Configuración, Posibles Errores, Manejo de Maven, JSF, Jpa, Mysql, dependencias con Maven, servidor de despliegue y otros usos de este Proyecto. Recomiendo Leerla y Realizar todo paso a paso como se indica en la misma).

## Indice
- [Creación y Configuraciones de un Proyecto Web con Maven en Eclipse.](#creación-de-un-proyecto-web-con-maven-en-eclipse-y-configuraciónes-iniciales)
- [Configuración del Servidor de Despliegue (Wildfly).](#configuración-del-servidor-de-despliegue-wildfly)
- [Dependencias del Proyecto.](#dependencias-del-proyecto)
- [Configuraciones Opcionales en Maven.](#configuraciones-opcionales-en-maven)
- [Configuración del SGDB Mysql.](#configuraciones-del-sgdb-mysql)
- [Configuración de JPA-HIBERNATE para la Persistencia de datos.](#configuración-de-jpa-hibernate-para-la-persistencia-de-datos)
- [Herramienta Cygwin para el uso de Git.](#uso-de-cygwin)


</br>

## Creación de un Proyecto Web con Maven en Eclipse y Configuraciónes Iniciales.
#### (Primeramente deberás configurar tu espacio de trabajo, en donde se alojará la aplicación. Cada vez que muevas el Proyecto de Directorio, recomiendo crear o setear nuevamente el Espacio de Trabajo junto con el Servidor).


#### 1) File 
* --> New 
* --> Proyect Maven(Si no aparece buscar en Other)

#### 2) Por defecto dejar marcado Use default Workspace location 
* --> Next

#### 3) Esperar a que carguen los Group id y en Filter escribir org.apache.maven.archetypes
* --> Seleccionar el ultimo(maven-archetype-webapp), este pertenece al Group id org.apache.maven.archetypes.
* --> Next

#### 4) Configurar el Group Id (PAQUETE DEL PROYECTO) a gusto, en mi caso com.crud_jsf_jpa_maven

#### 5) En Artifact Id (NOMBRE DEL PROYECTO) a gusto, en mi caso CRUD_JSF_JPA_HIBERNATE_MAVEN_MYSQL

#### 6) Seguidamente Finish.

#### 7) Si cerraste alguna ventana/utilidad de Eclipse.
* --> Window
* --> Perspective
* --> Reset perspective

</br>

## Configuración del Servidor de Despliegue Wildfly.
#### (Las Configuraciones de los Servidores de despliegue son casi los mismos pasos para todos, Tomcat, Jboss, Wildfly, etc. En mi caso opté por Wildfly ya que no requiere tanta configuración que el resto y además es más estable, menos restrictivo para algunas cosas, etc. No hay una única configuración, ni tampoco es algo que se configura una única vez, en caso de algún error, eliminar el Servidor creado, volverlo a configurar y paciencia que levantarlo a primera es LERDO. Si tarda en ejecutar el proyecto, parar la ejecución y ejecutar de nuevo.


#### 1) Utilizaré Wildfly, buscar por internet, descargar, descromprimir, colocar en el directorio del proyecto u otro seguro.


#### 2.1) Seleccionar el Proyecto y Click der sobre el mismo.
* --> Properties
* --> Buscar Proyect Facets
* --> Pestaña Runtimes(a la derecha de todo, al lado de Details)
* --> Seleccionar el Server WildFly 23.0 Runtime (En mi caso), SI NO APARECE UNO CREARLO, SEGUIR LOS SIG. PASOS
* --> En caso de que no aparezca tocamos New
* --> Se abrirá una interfaz llamada New Server Runtime Environment
* --> Seleccionamos la Version del Server, si descargaste Wildfly 13, selecciona el 13, si es 23, 23,etc para mantener compatibilidad
* --> Ahora Aparece una Interfaz llamada JBoss Runtime
* --> Dentro de la misma en Name colocar el nombre a gusto del server a usar
* --> En Home Directory tocar Browse... y buscamos la ruta del server descargado
* --> Finish
* --> Ahora debería aparecer el server en la pestaña Runtimes, lo seleccionamos
* --> Apply and Close



#### 2.2) Otra forma de realizar esto es desde la pestaña Servers, en las pestañas de abajo de eclipse(a mi me trajo algunos problemas, uso la anterior).


#### 3) Fijarse que se elimina el cartel rojo sobre el proyecto, indicando que faltaba configurar el servidor de despliegue.


#### 4) Probamos la app 
 * --> Click Der 
 * --> Run As 
 * --> Run on Server 
 * --> Seleccionas Wildfly 
 * --> Next 
 * --> ATENTI, si usaste otro proyecto en Maven, el mismo quedó configurado en la pestaña Configured junto con el nuevo, seleccionar el viejo y tocar el boton Remove, nos quedamos con el Nuevo(en mi caso nombre del proyecto).
 * --> Lo seleccionas y Finish.


#### 5) Fijarse el Log en Console(todo el registro de despliegue del Server), tarda unos segundos. Si tarda en ejecutar el proyecto, parar la ejecución y ejecutar de nuevo.

#### 6) Si se abre un localhost con Hello World! todo está correcto. Si aparece un mensaje de página no encontrada, borrar el index.jsp dentro de webapp y volver a crear el index.jsp, luego actualizar proyecto, actualizar Maven y correr Nuevamente en el Server.

#### 7) Si no funciona lo anterior, siempre recomiendo cerrar y volver a abrir Eclipse.


</br>

## Dependencias del Proyecto
#### (Las siguientes dependencias del Proyecto se deberán agregar al pom.xml para el correcto funcionamiento del Proyecto).

#### 1) Dependencia para los servlets (JSF trabaja con Servlets).
* --> En Internet Buscar Maven Repository (https://mvnrepository.com/)
* --> Buscamos Java Servlet Api (https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api)
* --> La última fue actualizada el 2018, 4.0.1 (https://mvnrepository.com/artifact/javax.servlet/javax.servlet-api/4.0.1)
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

* --> control+s guardas y actualizamos el proyecto
* --> Click Der sobre el proyecto, Maven
* --> Update Proyect
* --> Fijate que el Proyecto este seleccionado y Boton ok

</br>

#### 2) Dependencia para el conector de Mysql.
* --> Buscamos Mysql Connector (https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.21)
* --> Copias la dependencia y la incluis en el pom del proyecto

```xml
<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>8.0.21</version>
</dependency>

```

* --> Ctrl + s Guardas 
* --> Click Der sobre el proyecto
* --> Maven y update Maven o Alt + F5
* --> Fijarse dentro de Maven Dependencies si Maven descargo la misma


</br>

#### 3) Dependencias para JPA-Hibernate (persistencia de Datos).
* --> La Primera será el core de Hibernate, hibernate-core la 5.4... Final (https://search.maven.org/artifact/org.hibernate/hibernate-core/5.4.27.Final/jar).

```xml
<dependency>
  <groupId>org.hibernate</groupId>
  <artifactId>hibernate-core</artifactId>
  <version>5.4.27.Final</version>
</dependency>
```

* --> La segunda será JPA para Hibernate, la más importante, ya que nos desacoplamos de depender de Hibernate en un futuro, y nos centramos en trabajar con JPA, la dependencia es JPA-Hibernate 2.1 (https://mvnrepository.com/artifact/org.hibernate.javax.persistence/hibernate-jpa-2.1-api/1.0.2.Final).

```xml
<!-- https://mvnrepository.com/artifact/org.hibernate.javax.persistence/hibernate-jpa-2.1-api -->
<dependency>
    <groupId>org.hibernate.javax.persistence</groupId>
    <artifactId>hibernate-jpa-2.1-api</artifactId>
    <version>1.0.2.Final</version>
</dependency>

```

* --> La Tercera dependencia será para las Lecturas de las Anotaciones para JPA-Hibernate, Javax Annotation API (https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api/1.3.2)

```xml
<!-- https://mvnrepository.com/artifact/javax.annotation/javax.annotation-api -->
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.2</version>
</dependency>
```

* --> Una vez incluidas, Ctrl+s guardamos,  F5 actualizamos y Alt+F5 para que Maven Actualice.
* --> Asegurate que Maven haya descargado las 3 dependencias mencionadas y colocadas en el pom.


</br>

#### 4) Dependencias para JSF (Desarrollo de Interfaces Web).
* --> La Primera será para la API de JSF
* --> Buscamos la API de JSF (https://mvnrepository.com/artifact/com.sun.faces/jsf-api/2.2.13)
* --> Copias la dependencia y la incluis en el pom del proyecto

```xml
<!-- https://mvnrepository.com/artifact/com.sun.faces/jsf-api -->
<dependency>
    <groupId>com.sun.faces</groupId>
    <artifactId>jsf-api</artifactId>
    <version>2.2.13</version>
</dependency>


```

* --> La Segunda será para la Implementación de JSF.
* --> Buscamos la dependencia (https://mvnrepository.com/artifact/com.sun.faces/jsf-impl/2.2.20)
* --> Copias la dependencia y la incluis en el pom del proyecto

```xml
<!-- https://mvnrepository.com/artifact/com.sun.faces/jsf-impl -->
<dependency>
    <groupId>com.sun.faces</groupId>
    <artifactId>jsf-impl</artifactId>
    <version>2.2.20</version>
</dependency>
```



* --> Ctrl + s Guardas 
* --> Click Der sobre el proyecto
* --> Maven y update Maven o Alt + F5
* --> Fijarse dentro de Maven Dependencies si Maven descargo la misma






</br>

## Configuraciones Opcionales en Maven.

</br>

### Actualización del proyecto

#### 1) Click Der sobre el proyecto y actualizar o F5

</br>

### Actualización de Java-1.7 a 1.8

#### 1) Vamos al pom.xml, el archivo al final de todo

#### 2) Dentro de el tag properties donde dice UTF-8 cambiar la version del compiler a 1.8, ctrl+s para guardar

#### 3) Click Der sobre el Proyecto
* --> Maven
* --> Update Proyect
* --> Fijate que el Proyecto este seleccionado y Boton ok

#### 4) Si cambio JavaSE-1.7 a JavaSE-1.8 se efectuo el cambio

</br>

### Paquetes Maven (Java Resources).

#### 1) Por Defecto Viene deshabilitada la opción de paquetes Maven, en donde vamos a guardar nuestros paquetes y clases
* --> Para habilitar las mismas, click Der sobre el Proyecto.
* --> Properties.
* --> Buscamos la sección Java Build Path
* --> Seleccionamos la casilla Maven Dependencies.
* --> Apply and Close.
* --> F5 y deberían aparecer (src/main/java y src/test/java)


</br>

## Configuraciones del SGDB Mysql.

#### 1) Hasta acá deberías tener incluido el conector para Mysql en el pom para que se descargue la dependencia (Fijasrse parte dependencias).

#### 2) Abrimos la Herramienta XAMPP ( Buscate un microtutorial para usarla ), o la que se tenga, levantamos los Servicios de Mysql y Creamos una Nueva Base de Datos.
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

## Configuración de JPA-HIBERNATE para la Persistencia de datos.
#### (JPA-HIBERNATE nos va a ahorrar tiempo de desarrollo de las clases en java para cada entidad mapeando atributos y completando el código para persistir los datos en una db con el SGDB Mysql).

#### 1) Dependencias JPA-HIBERNATE
* --> Hasta ese punto deberías haber incluido las dependencias descritas en la sección dependencias del Proyecto(Core de  Hibernate, JPA para hibernate y Javax Annotation API).
* --> Seguidamente vamos a Crear el fichero persistence.xml

#### 2) Archivo de Configuración XML de JPA-Hibernate (persistence.xml).
* --> Vamos a crear el Archivo de configuración persistence.xml dentro de la carpeta WEB-INF
* --> La Ruta al mismo es src/main/webapp/WEB-INF.
* --> Sobre la carpeta WEB-INF Click Der
* --> New
* --> Other
* --> Filtramos escribiendo xml, seleccinamos xml file
* --> Asegurarse que la ruta sea la indicada anteriormente, FormularioMaven/src/main/webapp/WEB-INF
* --> En el file Name escribimos persistence.xml
* --> Next, Next
* --> Todo por defecto y Finish
* --> En eclipse tenes varias vistas para ciertos tipos de archivos, fijate debajo de este que tenes Design y Source, toca en Source
* --> Tendriamos solamente una linea de codigo ( <?xml version="1.0" encoding="UTF-8"?> )

#### 3) Configurando el Archivo persistence.xml para JPA-Hibernate
* --> Dentro del archivo persistence.xml vamos a configurar la conexión con mysql y Nuestro Mapeo ORM de JPA-Hibernate.
* --> Copiar el siguiente código y pegarlo dentro del persistence.xml

```xml
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence" 
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
             http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd"
  version="2.1">

  <persistence-unit name="PERSISTENCE">
    <description>Hibernate JPA</description>
    <provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>

    <properties>
     
      <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver" />
      <property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/test-jpa-jsf" />
      <property name="javax.persistence.jdbc.user" value="root" />
      <property name="javax.persistence.jdbc.password" value="root" />
      <property name="hibernate.show_sql" value="true" />
      <property name="hibernate.hbm2ddl.auto" value="update" />        
    </properties>
  </persistence-unit>

</persistence>

```

* --> ATENTI: Las propiedades de este Archivo se pueden modificar en base a lo que se requiera, por ejemplo, si se desea cambiar el nombre raíz de la URL del proyecto("jdbc:mysql://localhost:3306/test-jpa-jsf"), quitar /test-jpa-jsf y reemplazar a gusto, lo mismo para el password, nombre de usuario, etc.




</br>


## CRUD (Create, Read, Update, Delete).

#### 1) Creación de Nuestra Clase Entidad-Modelo Cliente para la Persistencia de Datos.
* --> Dentro de src/main/java vamos a crear nuestro paquete para la Clase Modelo-Entidad Cliente.
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

#### 2) Creación de la Clase JPA Util para la Persistencia de los datos a la db.
##### (En esta Clase se crea el objeto que nos permite realizar la persistencia de los datos en la db).

* --> Primeramento vamos a crear el paquete que alojará la Clase dentro de la ruta ya usada (src/main/java).
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

