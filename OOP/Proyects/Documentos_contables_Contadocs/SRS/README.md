# Table of contents
- [Introduction](#Introduction)
    - [Purpose](#Purpose)
    - [Scope](#Scope)
    - [Definitions acronyms and abbreviations](#definitions-acronyms-and-abbreviations)
    - [References](#References)
    - [Overview](#Overview)
- [Overrall description](#Overrall-description)
    - [Product perspective](#Product-perspective)
        - [System interfaces](#System-interfaces)
        - [User interfaces](#User-interfaces)
        - [Hardware interfaces](#Hardware-interfaces)
        - [Software interfaces](#Software-interfaces)
        - [Communications interfaces](#Communications-interfaces)
        - [Memory](#Memory)
        - [Operations](#Operations)
        - [Site adaptation requirements](#Site-adaptation-requirements)
- [Product](#Product)
    - [User characteristics](#User-characteristics)
        - [Educational level, experience y technical expertise](#Educational-level-experience-y-technical-expertise)
        - [Constrains](#Constrains)
        - [Regulatory policies](#Regulatory-policies)
        - [Hardware limitations](#Hardware-limitations)
        - [Interfaces to other applications](#Interfaces-to-other-applications)
        - [Parallel operations](#Parallel-operations)
        - [Audit functions](#Audit-functions)
        - [Control functions](#Control-functions)
        - [Higher-order language requeriments](#Higher-order-language-requeriments)
        - [Signal handshake protocols](#Signal-handshake-protocols)
        - [Reliability requirements](#Reliability-requirements)
        - [Criticality of the application](#Criticality-of-the-application)
        - [Safety and security consideration](#Safety-and-security-consideration)
    - [Assumptions-and-dependencies](#Assumptions and dependencies)
    - [Apportioning-of-requirements](#Apportioning-of-requirements)
    - [Specific](#Specific) 
    - [External interfaces](#External-interfaces)
    - [Functions](#Functions)
    - [Performance requirements](#Performance-requirements)
    - [Logical database requirements](#Logical-database-requirements)
    - [Design constraints](#Design-constraints)
        - [Standards compliance](#Standards-compliance)
    - [Software system attributes](#Software-system-attributes)
        - [Relibility](#Relibility)
        - [Availability](#Availability)
        - [Security](#Security)
        - [Maintainability](#Maintainability)
        - [Portability](#Portability)
    - [Organizing the specific requirements](#Organizing-the-specific-requirements)
        - [System mode](#System-mode)
        - [User class](#User-class)
        - [Objects](#Objects)
        - [Feature](#Feature)
        - [Stimulus](#Stimulus)
        - [Response](#Response)
        - [Functional hierarchy](#Functional-hierarchy)
    - [Additional comments](#Additional-comments)
- [Supporting information](#Supporting-information)
    - [Index](#Index)
    - [Appendixes](#Appendixes)

# Introduction
## Purpose
El objetivo de este documento es describir una solución basada en software para organizar la documentación de una empresa contable.
La solucion proporcionará mayor facilidad y agilidad al momento de filtrar y organizar grandes cantidades de información de los administradores. Con este proyecto será posible reducir el tiempo de búsqueda, mantener accesible información para los administradores de la empresa y recuperar los datos en documentos para su uso posterior. Crear una base de datos para localizar documentos de manera más efectiva y para que esté al alcance de más personas.

El documento ampliamente aborda los siguientes topicos: se análizarán detalladamente los requerimientos de los colaboradores de la empresa. Se describirá un plan de acción para la elaboración del programa. Se desarrollará el programa que reduzca las acciones realizadas por los administradores en la oficina, generando una interfaz acorde a los dispositivos comúnmente utilizados en la empresa considerando su infraestructura. Se establecerá una base de datos para que el programa filtre los datos que sean solicitados. Hacer pruebas al software y corregir errores.
## Scope
La finalidad de este producto es contribuir en el proceso que conlleva la extracción de la información y que además pueda ser utilizada con un considerable grado de sencillez por todos los posibles usuarios. En concreto este proyecto afecta directamente a todas las personas involucradas que requieran la información de los clientes de la empresa.

Otro aspecto para lograr es la amplia compresión en el uso del software por parte del personal involucrado en cada proceso, esto permitirá que el aprovechamiento de la herramienta proporcionada y con ello alcanzar las metas propuestas. De esta manera aumentar la productividad y mejorar el desempeño en la colaboración dentro de la organización.

Debe poder desplegarse en distintos sistemas operativos sin necesidad de una adaptación previa, en concreto debe ser capaz de ejecutarse al menos en los siguientes sistemas operativos:

- Windows 7
- Windows 8
- Windows 10
- Mac OS


## Definitions, acronyms, and abbreviations
**Cliente**, es la persona que requiere los servicios de contaduría.

**Colaboradores** internos, son las personas vinculadas directamente a la firma de contaduría.

**Colaboradores externos**, colaboran de manera complementaria con la firma de contaduría con fines legales.

**Sistema de administración tributaría (SAT)**, organización gubernamental encargada de tramites relacionados a la recolección de impuestos.

## References
Reséndiz, G. (22 de 01 de 2019). Información sobre empresa. (P. Jurado, Entrevistador)
## Overview
# Overrall description
## Product perspective
La empresa cliente, cuenta con un sistema de archivos a mano que contiene toda la información administrativa, como en muchos negocios este sistema hace que se acumule una cantidad bastante voluminosa de papel y archivos, y aunque se cuenta con archiveros para estos sigue siendo una cantidad bastante importante, por lo que al tener esta cantidad de archivos en forma física y guardada en diferentes archiveros complica la búsqueda de información, además de la posibilidad de pérdidas y daños a los mismo archivos.
### System interfaces

### User interfaces
Consulta de documentos, éste se lleva a cabo al ingresar con los nombres y apellidos de los clientes. Si el documento se encuentra en una versión digital se muestra la ubicación dentro del ámbito seleccionado. En el caso de que se encuentre en alguna locación física el programa lo indica. Finalmente, si el cliente no cuenta con documentos disponibles, se manda un mensaje exhibiendo dicha situación.
![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Consultas.png)

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Consultas1Resp.png)

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Consultas3Resultados.png)

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/ConsultasSinRespuesta.png)

Movimientos, un solo cliente puede tener varios documentos, por lo que se puede anexar una cantidad indefinida de locaciones en documentos. Cada documento contará con un encabezado, el formato del documento, el nombre de la ubicación y la referencia de ésta. Si alguna referencia es obsoleta, se puede eliminar.

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos.png)

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos2Resultados.png)

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos2ResultadosSinEleccion.png)

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos3Resultados.png)

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos4Borrar.png)

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos4BorrarMensaje.png)

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos4BorrarMensaje.png)

Agregar nuevos elementos, la pestaña “Nuevos clientes” nos permitirá ingresar los datos de nuevos clientes a la base de datos, los clientes anteriores no se removerán de la base de datos dado que en cualquier momento pueden volver a ser activos.

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/MovimientosResultadoAgregar.png)

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/NuevosClientes.png)

![Consultas](https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/NuevosClientesSuccess.png)

### Hardware interfaces
### Software interfaces
### Communications interfaces
### Memory
### Operations
### Site adaptation requirements
## Product 

## User characteristics
### Educational level, experience y technical expertise
De acuerdo con la entrevista realizada a Reséndiz(2019) no es relevante el nivel de estudios, ya que quienes realizan las actividades contables implicitamente tienen la capacidad de manejar las partes básicas de los sistemas operativos. En caso de requerir soporte técnico cuentan con personal que puedan resolver problemas relacionados con los ordenadores. La capacitación inicial para aprender a mandejar el programa será dado por el representante de la empresa.
## Constrains
### Regulatory policies
### Hardware limitations
### Interfaces to other applications
### Parallel operations
### Audit functions
### Control functions
### Higher-order language requeriments
### Signal handshake protocols
### Reliability requirements
### Criticality of the application
### Safety and security consideration
## Assumptions and dependencies
## Apportioning of requirements
# Specific 
## External interfaces
## Functions
## Performance requirements
## Logical database requirements
## Design constraints
### Standards compliance
## Software system attributes
### Relibility
### Availability
### Security
Por consideraciones del cliente, no será necesario auténticarse en la aplicación. Sin embargo, el acceso a la base de datos requerirá de usuario y contraseña. La base de datos estará en un servidor público, dado que el tráfico por día es mínimo las restricciones serán mínimas por parte del proveedor del sistema.
### Maintainability
### Portability
## Organizing the specific requirements
### System mode
### User class

### Objects

### Feature
### Stimulus
### Response
### Functional hierarchy
## Additional comments
# Supporting information
## Table of contents 
## Index
## Appendixes