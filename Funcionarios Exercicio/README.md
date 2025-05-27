# Sistema de Funcionários

Este projeto é um sistema simples de gerenciamento de usuários com herança em Java.
Solicitado durante o bootcamp de Java da Dio

## Estrutura

- `funcionarios/` → Contém as classes `Gerente`, `Vendedor` e `Atendente`
- `sistema/` → Contém o `Main.java`

## Funcionalidades

- Login e logoff
- Alteração de dados
- Ações específicas para cada tipo de funcionário

## Como compilar e executar

```bash
javac -d bin src/funcionarios/*.java src/sistema/Main.java
java -cp bin sistema.Main
