Este repositorio contiene las pruebas automatizadas para el portal SauceDemo, desarrolladas bajo el estándar de NTT DATA, utilizando Serenity BDD, Cucumber y el patrón de diseño Screenplay.

Tecnologías y Requisitos
Lenguaje: Java 17 o superior.

Framework de automatización: Serenity BDD.

Gestor de dependencias: Maven.

Navegador: Google Chrome (actualizado).

Instrucciones de Ejecución
Para ejecutar las pruebas correctamente y generar los reportes detallados, siga estos pasos en su terminal o IDE:

1. Limpiar el proyecto:

Bash
mvn clean

2. Ejecutar los escenarios de prueba:
(Esto abrirá el navegador y ejecutará los casos de login definidos en los archivos .feature).

Bash
mvn verify
3. Generar el reporte agregado:

Bash
mvn serenity:aggregate

***Ubicación de los Reportes
Una vez finalizada la ejecución exitosa (BUILD SUCCESS), puede encontrar el reporte visual detallado con capturas de pantalla en la siguiente ruta:

target/site/serenity/index.html

***Estructura del Proyecto
Siguiendo los lineamientos del ejemplo proporcionado:

src/test/java: Contiene los Runners, Step Definitions, Tasks y User Interfaces.

src/test/resources/features: Archivos Gherkin con los escenarios de negocio.

src/test/resources/serenity.conf: Configuración del WebDriver y ambientes.

pom.xml: Archivo de configuración de Maven con todas las dependencias necesarias.
