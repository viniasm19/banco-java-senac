# 🏦 Banco Java

## 📌 Contexto
Projeto pessoal de estudo, desenvolvido durante os estudos de Programação Orientada a Objetos (POO) em Java.

## 🎯 Objetivo
Praticar conceitos de POO — como encapsulamento, construtores e relacionamento entre classes — modelando um sistema bancário simples com clientes e contas.

## 🛠️ Tecnologias
- Java

## ✨ Funcionalidades / Características
- Cadastro de cliente (nome e CPF)
- Criação de conta vinculada a um cliente (número e agência)
- Depósito e saque, com verificação de saldo suficiente antes de sacar
- Transferência entre contas (saque de uma conta seguido de depósito em outra)
- Exibição formatada dos dados da conta (`infoConta`)
- Encapsulamento do saldo (`private`), evitando alteração direta de fora da classe
- Encadeamento de construtores na classe `Cliente`, com um construtor privado reaproveitado pelo construtor público

## 📁 Estrutura do projeto
```
src/
 └── br/
      └── senac/
           └── sp/
                └── banco/
                     ├── modelos/
                     │    ├── Cliente.java
                     │    └── Conta.java
                     └── principal/
                          └── UsaConta.java
```
> A estrutura de pastas segue o nome dos packages: `br.senac.sp` vira `br/senac/sp`, e `br.senac.sp.banco` vira `br/senac/sp/banco`.

## 🚀 Como executar
**Pré-requisitos:** ter o JDK (Java Development Kit) instalado — qualquer versão 8 ou superior funciona.

1. Clone o repositório:
```
git clone https://github.com/viniasm19/banco-java.git
```
2. Acesse a pasta do projeto:
```
cd banco-java
```
3. Compile os arquivos (a partir da raiz do projeto, indicando a pasta src):
```
javac -d out src/br/senac/sp/UsaConta.java src/br/senac/sp/banco/Cliente.java src/br/senac/sp/banco/Conta.java
```
4. Execute:
```
java -cp out br.senac.sp.UsaConta
```
5. O programa vai imprimir no terminal as informações das contas antes e depois da transferência.

## 📚 O que aprendi
- Como organizar classes em packages e fazer a estrutura de pastas corresponder a eles
- Diferença entre atributos `public` e `private`, e por que encapsular o saldo evita que ele seja alterado sem passar pelas regras de negócio (`sacar`/`depositar`)
- Encadeamento de construtores com `this(...)`, reaproveitando lógica entre construtores da mesma classe
- Construtores privados: quando faz sentido restringir a criação de um objeto só à própria classe
- Relacionamento entre classes (uma `Conta` tem um `Cliente`) e como isso se reflete no código
- Como um método de uma classe (`transferir`) pode coordenar chamadas a métodos de outro objeto do mesmo tipo (outra `Conta`)

## 👥 Autores
Feito por **Vini Melo** — [GitHub](https://github.com/viniasm19)

## 📄 Licença
Projeto acadêmico/pessoal, sem fins comerciais. Livre para estudo e consulta.
