<p align="center">
Universidad Autonoma de Ciudad Juarez</br>
División Multidisciplinaria de Ciudad Universitaria</br>
Departamento de Ingeniería Electricidad y Computación</br>
</p>
<br>
<p align="center">
<img width="270" height="270" 
  src="http://www.uacj.mx/comunicacion/PublishingImages/Escudo%20UACJ%202015/Escudo%20uacj%202015-color-sin%20fondo.png">
</p>
<br>
<p align="right">
Development of software requirements</br>
</br>
</br>
Accounting documents administration</br>
</br>
</br>
George Iván Rodríguez Gómez 160000</br>
</br>
</br>
Bachelor's in Software Engineer
</br>
</br>
Abril 2019
</p>

# Table of contents
1. [Introduction](#Introduction)
    - [Purpose](#Purpose)
    - [Scope](#Scope)
    - [Definitions acronyms and abbreviations](#definitions-acronyms-and-abbreviations)
    - [References](#References)
    - [Overview](#Overview)
2. [Overrall description](#Overrall-description)
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
    - [Assumptions and dependencies](#Assumptions-and-dependencies)
    - [Apportioning of requirements](#Apportioning-of-requirements)
    - [External interfaces](#External-interfaces)
    - [Functions](#Functions)
    - [Performance requirements]

3. [Specific requirements](#Specific-requirements) 
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

The document objective is describing a software solution to organize business accounting. This solution will give ease and ease up to organize and find a lot of quantities of information. The project will allow to reduce time search, keep accessible the administrator business information and recover data in documents for later use. Create a database for localize documents effective and available to any person in business.

The document address broadly the next topics:
It will be analyzed the requirement of business collaborators, so it will describe an action plan to construction of software. It will develop the software to reduce efforts to find documents in their offices, then it offers a solution according to available infrastructure. Finally, it will do proof and fix errors.

## Scope
La finalidad de este producto es contribuir en el proceso que conlleva la extracción de la información y que además pueda ser utilizada con un considerable grado de sencillez por todos los posibles usuarios. En concreto este proyecto afecta directamente a todas las personas involucradas que requieran la información de los clientes de la empresa.

Otro aspecto para lograr es la amplia compresión en el uso del software por parte del personal involucrado en cada proceso, esto permitirá que el aprovechamiento de la herramienta proporcionada y con ello alcanzar las metas propuestas. De esta manera aumentar la productividad y mejorar el desempeño en la colaboración dentro de la organización.

Debe poder desplegarse en distintos sistemas operativos sin necesidad de una adaptación previa, en concreto debe ser capaz de ejecutarse al menos en los siguientes sistemas operativos:

- Windows 7
- Windows 8
- Windows 10
- Mac OS


## Definitions, acronyms, and abbreviations

Concept         | Definition   
--------------|-----------
**Internal Employee**      | People can access to all parts of fiscal accounting others internal business process 
**External Employee**      | Collaborator who helps with some customers and special works
**Customer**             | They are people in need of fiscal and administration accounting
**Sistema de administración tributaría (SAT)**| Goverment organization manager of paperwork related to collect taxes.
**JDK**|Java development kit, is a development enviroment for building applications, applets, and components using the java programming language.


## References
Oracle, corp., web page. Consulted 5/04/2019. 
https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html
Reséndiz, G. (22 de 01 de 2019). Información sobre empresa. (P. Jurado, Interviewer)
## Overview
# Overrall description
## Product perspective
The business has with a system files with administrative information, this information during time in paper in folders, but this number of documents isn’t handled adequately in along time this can become a big problem. It will be hard to find a necessary hard copy of any document in different places of business infrastructure, and possibilities of losing and damage it.
### System interfaces

### User interfaces
 Document Search, when the user insert name and last name of customer, the system lookin for all data related with the people related. If a document found have a digital version, then it show a hiperlink with its reference in selected enviroment. In case, the sofware find a phisical location, the answer will indicate the exact position. Finally, if the user don't find a available ducuments, the system indicate this situation.

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Consultas.png" alt="consultas" width="400" />   <img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Consultas1Resp.png" alt="consultas con una respuesta" width="400" />
<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Consultas3Resultados.png" alt="consultas con tres resultados" width="400" /><img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/ConsultasSinRespuesta.png" alt="consultas con tres resultados" width="400" />

Movimientos, un solo cliente puede tener varios documentos, por lo que se puede anexar una cantidad indefinida de locaciones en documentos. Cada documento contará con un encabezado, el formato del documento, el nombre de la ubicación y la referencia de ésta. Si alguna referencia es obsoleta, se puede eliminar.
<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos.png" width="400" /><img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos2Resultados.png" width="400" />
<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos2ResultadosSinEleccion.png" width="400" /><img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos3Resultados.png" width="400" />
<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos4Borrar.png" width="400" /><img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/Movimientos4BorrarMensaje.png" width="400" />

Agregar nuevos elementos, la pestaña “Nuevos clientes” nos permitirá ingresar los datos de nuevos clientes a la base de datos, los clientes anteriores no se removerán de la base de datos dado que en cualquier momento pueden volver a ser activos.

<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/MovimientosResultadoAgregar.png" width="400" /><img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/NuevosClientes.png" width="400" />
<img src="https://github.com/RequirementEngineering/ch-re-al160000GeorgeRodriguez/blob/master/SRS/images/NuevosClientesSuccess.png" width="400" />

### Hardware interfaces
### Software interfaces
### Communications interfaces
SQL
### Memory
500MB en RAM
### Operations
### Site adaptation requirements
## Product 

## User characteristics

Only internal and externals employees can access to data:

Actor         | Role   
--------------|-----------
Internal Employee      | people can access to all parts of fiscal accounting others internal business process 
External Employee      | collaborator who help with some customers and special works
Customer               | They are people in need of fiscal and administration accounting
### Educational level, experience y technical expertise
De acuerdo con la entrevista realizada a Reséndiz(2019) no es relevante el nivel de estudios, ya que quienes realizan las actividades contables implicitamente tienen la capacidad de manejar las partes básicas de los sistemas operativos. En caso de requerir soporte técnico cuentan con personal que puedan resolver problemas relacionados con los ordenadores. La capacitación inicial para aprender a mandejar el programa será dado por el representante de la empresa.
## Constrains
The system is limited to run in equipment support and had installed JDK 8.0 
El sistema está limitado a ejecutarse en equipos de escritorio que soporten y tengan instalado java JDK 8.0 o superior.
El equipo mediante el cual se accederá deberá contar con conexión a internet.
### Regulatory policies
### Hardware limitations
500MB en RAM
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
# Specific requirements
## External interfaces

Software Engieener        | Customer   
--------------------------|-----------
Where will be computers with software?| In central office, and external employees will use in own laptops out of offices.
There is some place in where the employees save documents?|Digital documents save in central pc, in dropbox service. And the externals employees will be connected to same repository.

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
### Diagram class

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