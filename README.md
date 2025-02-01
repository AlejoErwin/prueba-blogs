
# Banco Bisa


# Framework

## Spring boot

- String boot es una herramienta que facilita la creación de servicios y utiliza un conjunto de herramientas que a su vez facilita el uso del lenguaje Java.

# Tecnología

## Java 21

Java 21 es la última versión de Java SE (Standard Edition), lanzada en septiembre de 2023 como una versión LTS (Long-Term Support).
**que se decidió utilizar Java 21 por razones de considerar que java constantemente va creciendo**

# Dependencias

### Spring-boot-starter-web
#### ¿Para qué sirve?
- Permite desarrollar aplicaciones web y APIs REST.
- Soporta controladores con anotaciones como @RestController y @RequestMapping.

### Spring-boot-starter-test
#### ¿Qué hace?
- Proporciona herramientas para pruebas en Spring Boot.
- Incluye JUnit 5 (framework de pruebas unitarias), Mockito (para mocks) y AssertJ (aserciones avanzadas).
- **En este pequeño proyecto no se utilizó por razones que era una simple prueba**

### spring-boot-starter-validation
#### ¿Para qué sirve?
- Sirve para validar valores declarados en los objetos.
- Se utilizó para validar varios campos.


### Springdoc-openapi-starter-webmvc-ui
#### ¿Qué hace?
- Genera documentación automática de la API con OpenAPI 3.
- Incluye Swagger UI, permitiendo probar los endpoints desde el navegador.
- **EN ESTE PROYECTO SE UTILIZO SOLO PARA VISUALIZAR EL SWAGGER, PERO ES MEJOR UTILIZAR CON SEGURIDAD OAUTH2**

4️⃣ **springdoc-openapi-starter-webmvc-ui** → Documentación con Swagger UI  
📌 Ejemplo: Agregar OpenAPI a la API REST.

**El proyecto actual tiene SWAGGER** → Para acceder al  `SWAGGER` es:
```ini
http://localhost:8080/swagger-ui/index.html
```
> [!NOTE]
> - Por defecto, el proyecto corre en el puerto 8080.
> - se puede cambiar el puerto en `application.yml`


# Estrategia

## Que herramienta se utilizó

- Se utilizo Visual Studio Code.
- Docker
- Maven

## Que patron de arquitectura se uso
- El patron en capas

## Excepciones
- Se modificó algunas excepciones para controlar las salidas de datos y los mensajes en las validaciones que se pedían
- 
## Como se realizo el guardado de datos
- Se implemento un interfaz simulando una base de datos (Similar a un JPA), considerando que solo se puede guardar datos en el Cacha cuando corra el proyecto
- Ademas se puede mejorar utilizando una base de datos momentanea como el h2



# Compilación 

## por Visual o por Intellij
- Se debe simplemente ejecutar el proyecto con el boton RUN

## por terminal

- Primero, se debe correr el comando
```ini
mvn clean install 
```
- Segundo, hacer correr el comando
```ini
mvn spring-boot:run 
```
> [!IMPORTANT]
> Es importante tener el maven instalado en la PC.
> - [Instalador de maven](https://maven.apache.org/install.html)

## por Docker


- Primero es necesario que se tenga Docker instalado en la PC
- Segundo es hacer correr el 
```ini
docker-compose up --build -d
```
- Si se requiere dar de baja al proyecto es:
```ini
docker-compose down    
```

