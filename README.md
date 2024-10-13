#Publicando API REST na Nuvem Usando Spring Boot, Java e Railway

## Diagrama de Classes

```mermaid
classDiagram
    class Paciente {
        +String especie
        +String nome
        +String sexo
        +Date data_nascimento
        +String raca
        +String cor
        +Vacina[] vacinas
        +Consulta[] consultas
    }

    class Vacina {
        +String nome
        +Date data
    }

    class Consulta {
        +String motivo
        +Date data
        +String prescricao
    }

    class Responsavel {
        +String nome
        +String telefone
        +String endereco
        +String bairro
        +String Cidade
        +String uf
        +Paciente[] paciente
    }

    Paciente "1" *-- "N" Vacina
    Paciente "1" *-- "N" Consulta
    Responsavel "1" *-- "N" Paciente
