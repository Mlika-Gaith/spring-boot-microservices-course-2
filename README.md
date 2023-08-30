<h2 align="center">Spring boot microservices architecture👋</h2>
<p>
This project adopts a monorepo approach to demonstrate a Spring 
Boot microservices architecture. It provides a comprehensive 
introduction to microservices concepts using Spring Cloud.
</p>


## Prerequisites

Ensure you have the following software installed on your system before proceeding:

* Java Development Kit (JDK) 17 or later
* Maven
* Docker (optional, for containerization, and for using zipkin for distributed tracing)

## Install

* Clone the repository 
* Navigate to the project directory.
* Build and package each component with Maven.

## Usage

To use Zipkin for distributed tracing run:

````shell
docker compose up -d
````

## Project Contents

<p> The project mainly covers: </p>

<h4> Discovery service (eureka)</h4>

<p>Eureka is a service discovery tool that enables microservices 
within a system to locate and communicate 
with each other dynamically, providing a streamlined and automated 
way to manage and locate services as they come and go 
in a distributed environment.</p>

<h4> Configuration service</h4>

<p>this component of microservices architecture centralizes 
and manages configuration settings for various services. 
It allows you to store configuration details separately 
from your codebase and dynamically fetch 
and distribute these configurations to different microservices.</p>

<h4> API gateway </h4>

<p>this component is a central entry point for a microservices 
architecture, efficiently directing and managing incoming 
requests from clients to various underlying services.</p>

<h4> Inter-service communication between microservices (student and school) </h4>

<p>The inter-service communication uses OpenFeign a declarative REST client 
library that simplifies the process of making 
HTTP requests to remote services within a microservices ecosystem.</p>

<h4> Zipkin </h4>

<p>Zipkin is a distributed tracing system that helps track and analyze the 
flow of requests across various microservices.</p>

