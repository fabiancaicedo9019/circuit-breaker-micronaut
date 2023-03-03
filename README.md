
# Prueba de Concepto - Patrón Circuit Breaker

Este proyecto es una prueba de concepto del patrón de arquitectura Circuit Breaker. Está dirigido a las personas que desarrollan APIs en java con el Framework Micronaut.io. Este es una plataforma que ofrece un conjunto de herramientas y funcionalidades para desarrollar aplicaciones de forma modular, escalable y fácil de mantener.

## Contenido

- [Introduccion](#introduccion)
- [Objetivos](#objetivos)
- [Pasos](#pasos)
- [Tecnologias](#tecnologias)
- [Resultados](#resultados)
- [Conclusiones](#conclusiones)
- [Instalacion](#instalacion)
- [Uso](#uso)
- [Creditos](#creditos)

## Introduccion

Antes de iniciar a desarrollar el patrón Circuit Breaker se realizará una explicación para generar un contexto introductorio al patrón y se explicará a groso modo la prueba concepto.
El patrón de Circuit Breaker es un patrón de diseño de software que se utiliza para mejorar la resiliencia y la capacidad de respuesta de una aplicación mediante la interrupción temporal del acceso a un servicio en caso de falla.
Tenga presente que el patrón se puede ver como una máquina de estados donde hay 3 en los que viaja la petición del cliente para controlar la respuesta. Los estados son:
- Cerrado: el Circuit Breaker permite que las solicitudes se procesen normalmente.
- Abierto: el Circuit Breaker interrumpe el acceso al servicio después de una falla, devolviendo una respuesta alternativa.
- Medio abierto: el Circuit Breaker permite algunas solicitudes para verificar si el servicio se ha recuperado, de lo contrario, volverá al estado abierto.

A continuación, muestro una imagen explicando los estados:

| ![Alternate image text](https://www.oscarblancarteblog.com/wp-content/uploads/2018/12/circuit-breaker-lifecycle-1024x597.png) |
|:--:|
| *Imagen tomada del libro: Introducción a la arquitectura de software, Oscar Blancarte, Primera edición* |

## Objetivos

El objetivo del proyecto es simular los estados del patron Circuit Breaker, para esto se pretende consumir el API de Pokemon que permite por medio del nombre consultar toda la información como si fuera una Pokedex. El proyecto implementa un cliente con el servicio de Pokemon que se muestra a continuación:

https://pokeapi.co/api/v2/pokemon/{nombre_pokemon}

## Pasos

Para la simulación del ejercicio se tiene un .sh dentro de la carpeta resources/scripts que permite la ejecución de un número de peticiones que las recibe como parámetro:
```
./runner.sh {numero_de_peticiones}
```

Los pasos para iniciar el proyecto son:
1.	Ejecuta la línea de comando:
```
./mvnw mn:run
```
2.	Espera a que termine de compilar y desplegar el proyecto
3.	Luego ingresa a la URL: http://localhost:8080/
4.	Presiona el botón “*Go to definition*”, esto te llevara al Swagger del proyecto y podras encontrar el servicio como ejecutarlo.

## Tecnologias

La aplicación usa las siguientes tecnologías:

- [Micronaut.io](https://micronaut.io/) versión 3.8.5
- [thymeleaf](https://micronaut-projects.github.io/micronaut-views/latest/guide/index.html#thymeleaf)
- [OpenAPI](https://micronaut-projects.github.io/micronaut-openapi/latest/guide/index.html)
- [Java 17](https://www.oracle.com/co/news/announcement/oracle-releases-java-17-2021-09-14/)
- [Swagger](https://swagger.io/tools/swagger-ui/)

## Resultados

A continuación, comparto algunos resultados de la prueba de concepto:
1.	Mayor resiliencia: es posible evidenciar que la aplicación es capaz de manejar mejor las fallas en los servicios que utilizando, en este caso el servicio de Pokemon
2.	Mejor capacidad de recuperación: es fácil identificar que el patrón permite a la aplicación recuperarse más rápidamente de las fallas en los servicios.
3.	Mejora en la experiencia del usuario: esto permite la reducción de errores que el usuario final experimenta al interactuar con la aplicación.



## Conclusiones
Algunas conclusiones a tener en cuenta:

1.	Se mejora la resiliencia y la capacidad de respuesta de una aplicación al interrumpir temporalmente el acceso a un servicio en caso de falla.
2.	Se debe tener en cuenta o presente que es importante ajustar adecuadamente sus parámetros como el tiempo de espera y monitorear su estado.
3.	Es un patrón muy útil en aplicaciones distribuidas.
4.	Mejorar la experiencia del usuario y aumentar la disponibilidad y la capacidad de recuperación de la aplicación.

## Instalacion

Para utilizar el proyecto usted debe instalación en su máquina lo siguiente:
- [Java SE 17 Archive Downloads](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

## Uso

A continuación, se muestran algunas imágenes sobre el uso del proyecto, para que sea más fácil seguir el paso a paso que se presenta anteriormente.

![Imagen de uso](src/main/resources/assets/images/uso.gif)
![alt text](assets/ images/screenshot.png)

## Creditos

Se uso como referencia la documentación de [Micronaut.io](https://micronaut.io/).

