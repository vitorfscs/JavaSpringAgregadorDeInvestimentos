🚀 Agregador de Investimentos 📈💰

📝 Descrição

Este projeto é um Agregador de Investimentos, desenvolvido utilizando Spring Framework no modelo MVC. O sistema permite que clientes gerenciem seus investimentos de forma centralizada, fornecendo uma interface para consulta, cadastro e administração de suas carteiras de investimento.

🛠 Tecnologias Utilizadas

🟡 Java 21

🌱 Spring Boot

🎯 Spring MVC

🗄 Spring Data JPA

🔐 Spring Security (se aplicável)

🗃 Banco de Dados PostgreSQL

🐳 Docker (para containerização da aplicação)

🏗 Arquitetura do Projeto

O projeto segue a arquitetura em camadas, separando as responsabilidades conforme o padrão MVC (Model-View-Controller):

📌 1. DTO (Data Transfer Object)


⚙️ 2. Service


🗃 3. Repository

🎮 4. Controller


📦 Docker

Dockerfile

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/agregador-investimentos.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

docker-compose.yml

services:
  mysql:
    image: 'mysql:latest'
    environment:
      - 'MYSQL_DATABASE=mydatabase'
      - 'MYSQL_PASSWORD=secret'
      - 'MYSQL_ROOT_PASSWORD=verysecret'
      - 'MYSQL_USER=myuser'
    ports:
      - '3306:3306'
    volumes:
      - mysql_data:/var/lib/mysql
volumes:
  mysql_data:

▶️ Como Executar o Projeto

🔧 1. Configuração Local (Sem Docker)

✅ Requisitos:

☕ Java 21

🔧 Maven

🗄 Mysql

📌 Passos:

1️⃣ Clone o repositório:

git clone [https://github.com/seu-usuario/agregador-investimentos.git](https://github.com/vitorfscs/JavaSpringAgregadorDeInvestimentos)
cd agregador-investimentos

2️⃣ Configure o application.properties:

spring.application.name=agregadorinvestimentos
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=myuser
spring.datasource.password=secret
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql: true
3️⃣ Execute a aplicação:

mvn spring-boot:run

🐳 2. Executando com Docker

✅ Requisitos:

🐳 Docker instalado e configurado.

📌 Passos:

1️⃣ Construa e inicie os contêineres:

docker-compose up --build

2️⃣ Acesse a aplicação no navegador:

http://localhost:8080

📡 Endpoints da API

A aplicação expõe alguns endpoints REST para interação com os investimentos:

🔍 GET /investimentos - Retorna todos os investimentos cadastrados

➕ POST /investimentos - Cria um novo investimento

🔎 GET /investimentos/{id} - Retorna um investimento específico

✏️ PUT /investimentos/{id} - Atualiza um investimento

❌ DELETE /investimentos/{id} - Remove um investimento

🤝 Contribuição

Se deseja contribuir para este projeto, siga os seguintes passos:
1️⃣ Faça um fork do repositório
2️⃣ Crie uma nova branch (git checkout -b feature-nova)
3️⃣ Faça suas alterações e commit (git commit -m 'Adiciona nova funcionalidade')
4️⃣ Envie para o repositório remoto (git push origin feature-nova)
5️⃣ Abra um Pull Request 🚀


🧑‍💻 Desenvolvido por Vitorfscs 🚀

