**JWT (JSON Web Tokens)**

**Components:**
   - JWTs consist of three parts: Header, Payload, and Signature.
     - **Header:** Contains information about the type of token and the signing algorithm used.
     - **Payload:** Contains claims (statements about an entity) such as user information.
     - **Signature:** Used to verify that the sender of the JWT is who it says it is and to ensure that the message wasn't changed along the way.

**Working Process:**
   - A user logs in to an application, and upon successful authentication, the server generates a JWT.
   - The server sends the JWT to the client, which stores it securely.
   - For each subsequent request, the client sends the JWT in the request header.
   - The server validates the JWT's signature and the claims to ensure the user's authenticity and access rights.

**Benefits:**
   - **Scalability:** JWTs are self-contained, meaning the server doesn't need to store session data, making it scalable.
   - **Compact:** JWTs are small in size, suitable for transmission in URLs, headers, and cookies.
   - **Decentralized:** JWTs can be used across different domains and services, making them versatile.

**Use Cases:**
   - **Authentication:** JWTs are widely used for user authentication, ensuring that a user is who they claim to be.
   - **Information Exchange:** JWTs can carry information between parties, making them useful for secure data sharing.
   - **SSO USAGE**: JWTs enable seamless authentication across multiple services with a single login.


**Spring Framework**

   - **Spring Beans:** Components in a Spring application are managed as Spring beans, which are defined in the Spring configuration file.

**Modules:**
   - **Spring Core Container:** Includes modules like Bean, Core, Context, and Expression Language.
   - **Spring Data Access/Integration:** Provides JDBC, ORM, JMS, and more for data access and integration.
   - **Spring Web:** Includes modules for building web applications, such as Web, Web-Servlet, Web-Websocket, and Web-Websocket-Client.
   - **Spring Security:** Offers security features for authentication and authorization.

**Benefits:**
   - **Simplified Development:** Spring reduces the complexity of application development through features like IoC and AOP.
   - **Wide Range:** Spring integrates with various technologies, databases, and frameworks, expanding its capabilities.

**Use Cases:**
   - **Web Applications:** Spring is commonly used to develop web applications due to its comprehensive support for web-related components.
   - **Microservices:** Spring Boot, an extension of the Spring Framework, is popular for building microservices due to its simplicity and embedded containers.
   - **Enterprise Applications:** Spring is widely used in enterprise-level applications for its scalability and robustness.



**HOW CAN I USE THIS FOR CSCANVAS, THE PASSION PROJECT?**

JWT and Spring are going to be very useful for the project. For the login page in specific, JSON Web Tokens are going to be essential to make sure that the teacher and user can safely login and access their respective pages. Spring is also the primary backend framework, so understanding it deeply and playing around with its files will be essential to making the full-stack feature work.