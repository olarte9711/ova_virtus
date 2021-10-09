![logo ova](https://i.ibb.co/VxC5hxN/asda.jpg)

# Herramienta de Autor para la creación de OVAS
## Indice
1. [Información General](#Información-General)
2. [Spring](#Spring)
3. [MVC](#MVC)
4. [Base de Datos](#Base-de-Datos)
5. [GitFlow](#GitFlow) 
6. [Clonar el repositorio](#Clonar-el-repositorio)
7. [Consejos adicionales](#Consejos-adicionales)
8. [Documentación auxiliar](#Documentación-auxiliar)

## Información General

La herramienta de autor para la creación de OVAS tiene el objetivo de generar una plataforma práctica que facilite la creación de contenidos didácticos para el aprendizaje de los estudiantes de la Universidad Distrital. Dicho proyecto está desarrollado en Java, concretamente en el Framework Spring (mediante el MVC), usando una Base de Datos SQL y siguiendo la metodología de trabajo GitFlow.

## Spring

Spring es un framework para el desarrollo de aplicaciones y contenedor de inversión de control, de código abierto para la plataforma Java. Las características fundamentales de Spring Framework pueden ser usadas en cualquier aplicación desarrollada en Java, para este proyecto nos enfocamos en las funcionalidades de Spring Web.

Para ello, el proyecto fue desarrollado en Spring Initializr, una herramienta web que genero los elementos bases del proyecto (para más información, se puede ver el siguiente [link](https://start.spring.io/), sin embargo, no se requiere su uso debido a que la versión inicial ya se encuentra en este repositorio) 

## MVC

Modelo Vista Controlador (MVC) es un patrón de arquitectura de software, que divide la lógica de la aplicación en tres elementos interconectados, separando representaciones internas de la información de la aplicación.

- **Modelo:** Un modelo representa la información (datos) de la aplicación y las reglas para manipular estos datos. Los modelos se utilizan principalmente para gestionar las reglas de interacción con una tabla de base de datos correspondiente. En la mayoría de los casos, cada tabla de la base de datos corresponderá a un modelo en su aplicación. La mayor parte de la lógica de negocio de su aplicación se concentrará en los modelos.
- **Vista:** Las vistas representan la interfaz de usuario de su aplicación. Las vistas, son a menudo, archivos HTML con código PHP incrustado que realizan tareas relacionadas solamente con la presentación de datos. Las vistas llevan a cabo el trabajo de proveer datos al navegador web u otra herramienta que es usada para hacer solicitudes desde su aplicación.
- **Controlador:** Los controladores proporcional el flujo entre modelos y vistas. Los controladores son los responsables de procesar las peticiones entrantes desde el navegador web, solicitar datos a los modelos, y pasar esos datos a las vistas para su presentación.
![ejemplo mvc](https://i.ytimg.com/vi/z6WppAQ3LUg/maxresdefault.jpg)

### Aplicación MVC dentro del Proyecto

Para la elaboración de este proyecto, se trabaja a partir del MVC con varios ajustes, a continuación se muestra la estructura base de los paquetes (pueden ser cambiados por los investigadores en tránsito)

![carpetas proyecto](https://i.ibb.co/jZ42Dtx/imagen.png)

- *Config:* Paquete de configuraciones dentro del proyecto
- *Controller:* Paquete de controladores del proyecto, maneja las respuestas HTTP del mismo
- *DTO/Request:* Paquete de archivos DTO Respuesta (en formato JSON) para enviar datos según el paquete que los requiera.
- *Model:* Paquete de entidades del proyecto con base en el Modelo de la Base de Datos. (ver sección Base de Datos)
- *Repository:* Paquete de repositorios mediante JPA para el uso de la Base de Datos (ver sección Base de Datos)
- *Service:* Paquete de servicios del aplicativo, clases con las funcionalidades requeridas.

## Base de Datos

La base de datos del proyecto está generada mediante JPA, un framework del lenguaje de programación Java que maneja datos relacionales en aplicaciones usando la Plataforma Java en sus ediciones Standard (Java SE) y Enterprise (Java EE). Esta Base de Datos se ejecuta (debido a ser un proyecto sin host, ejecutado en manera local) directamente desde el IDE, mediante H2, un sistema administrador de bases de datos relacionales programado en Java.

Las configuraciones iniciales de la Base de Datos están previamente establecidas, así como el modelo, JPA genera automáticamente las correspondientes entidades ya diseñadas así como los repositorios donde toma los métodos.

Los métodos de los repositorios de JPA ofrecen métodos base para los servicios a desarrollar (más información de estos métodos en el [link](https://docs.spring.io/spring-data/jpa/docs/current/api/org/springframework/data/jpa/repository/JpaRepository.html)), sin embargo, si se requieren generar querys adicionales, se presenta la siguiente [guía para hacer querys en los repositorios JPA](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods)

## GitFlow

Git Flow son un conjunto de extensiones que nos ahorran bastante trabajo a la hora de ejecutar todos estos comandos, simplificando la gestión de las ramas de nuestro repositorio.

**Funcionamiento:**
GitFlow maneja el flujo de trabajo estándar de Git mediante una serie de ramas para mayor control entre los desarrolladores, dichas ramas se presentan a continuación:

![gitflow](https://cleventy.com/wp-content/uploads/2020/03/git-model-1.png)

A continuación, se presenta las diferentes ramas:

| Rama | Descripción |
| ------ | ------ |
| Master | La rama principal de proyecto, es la que se manda a producción y se aplica merge con la rama de develop una vez se ha terminado una versión. |
| Develop | Rama donde esta el codigo de la versión planificada del proyecto. |
| Feautures | Las ramas features son las diferentes funcionalidades que cada desarrollador van desarrollando, los investigadores deben crear una nueva rama con la funcionalidad a realizar, a estas ramas se les aplicas merge una vez se termina una funcionalidad con la rama develop. |


*NOTA: Existen más ramas para uso dentro del proyecto, sin embargo, no se ve necesario el uso de las demás debido a la complejidad del proyecto. Para mas información sobre GitFlow, consultar el siguiente [link](https://cleventy.com/wp-content/uploads/2020/03/git-model-1.png)*

**Pull Request:**
Un Pull Request (PR) es la solicitud de mergear (unir) los cambios entre 2 ramas, generalmente entre los cambios de un investigador (su rama feature) con la rama de desarrollo (develop). Siguiendo el uso de GitFlow es conveniente generar un nuevo PR desde Git, para ello, se accede a la función dentro de la interfaz de Github, se solicita la rama a la que se desea mergear y se realiza el PR. Otro investigador debe aprobar el PR si no ve inconvenientes dentro del proyecto.

*NOTA: Si bien al generar un PR, el mismo investigador puede "autoaprobarse", lo mejor es lo realice otro investigador para que revise el código y evitar algún conflicto*

## Clonar el repositorio

Para evitar inconvenientes con los investigadores salientes, se debe clonar este repo de forma local, posteriormente algún investigador entrante crea un nuevo repositorio remoto, añadiendo el repositorio clonado como un nuevo commit

**Comandos para clonar el repositorio**:
```sh
git clone -b develop https://github.com/olarte9711/ova_virtus.git
```

**Comandos para iniciar un nuevo repositorio (con el repositorio local creado en Github)**:
```sh
git checkout develop
git add .
git commit -m "Mensaje del commit"
git push origin develop
```

*NOTA: No olvide crear la rama develop dentro del repositorio local y remoto*

## Consejos adicionales
- Manejar correctamente Git, desarollando correctamente los commit con descripciones claras que indiquen los cambios realizados
- Es conveniente que al finalizar el proyecto, se borren todas las ramas secundarias (feature, hotfixes)
- Actualizar este README, borrando las partes incoherentes y añadiendo la documentación que consideren pertinente (pueden usar cualquier [editor de md online](https://dillinger.io/))
- Recuerde actualizar los cambios con base a develop, TODA NUEVA FUNCIONALIDAD DEBE DE ESTAR EN DEVELOP, para ello usando el comando git pull origin develop y luego uniendo esa rama con su rama feature en forma local.
- Trabajar todo (commits, servicios, controladores, nombres de variables) en español para mayor facilidad

## Documentación auxiliar
- [Git Documentation](https://git-scm.com/doc)
- [Spring Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/)
- [Spring JPA Documentation](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#reference)
