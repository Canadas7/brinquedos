# Projeto CRUD de Brinquedos

## Checkpoint 2 — Programação Spring Boot com Persistência

Este projeto foi desenvolvido para o Checkpoint 2 da disciplina de Programação Spring Boot.

A aplicação consiste em uma API REST para gerenciamento de brinquedos infantis, permitindo realizar operações de cadastro, consulta, atualização e exclusão de brinquedos utilizando Java, Spring Boot e banco de dados Oracle.

---

# Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Oracle Database
- Maven
- Postman

---

# Funcionalidades do Projeto

O sistema realiza as operações básicas de CRUD:

- Cadastrar brinquedos
- Listar brinquedos
- Buscar brinquedo por ID
- Atualizar brinquedos
- Excluir brinquedos

---

# Estrutura da Entidade

A entidade `Brinquedo` possui os seguintes atributos:

| Campo | Tipo |
|---|---|
| id | Long |
| nome | String |
| tipo | String |
| classificacao | String |
| tamanho | String |
| preco | Double |

---

# Endpoints da API

## Listar brinquedos

```http
GET /brinquedos
