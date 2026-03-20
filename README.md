# 🐾 Petshop - Sistema de Gerenciamento de Serviços

Sistema de gerenciamento de serviços para petshop desenvolvido em Java, com simulação de atendimento via terminal (estilo robô de WhatsApp).

---

## 📋 Descrição

O sistema permite cadastrar três tipos de serviços oferecidos pelo petshop — **Banho**, **Hotelzinho** e **Tosa** — e ao final do dia emite um relatório com todos os serviços realizados e o total arrecadado.

---

## 🏗️ Estrutura do Projeto

```
src/
├── TamanhoAnimal.java     # ENUM: PEQUENO, MEDIO, GRANDE
├── TamanhoPelo.java       # ENUM: CURTO, MEDIO, LONGO
├── Servico.java           # Interface com calcularPreco() e getCodigo()
├── ServicoBase.java       # Classe abstrata com atributos comuns
├── Banho.java             # Subclasse: serviço de banho
├── Hotelzinho.java        # Subclasse: serviço de hotelzinho
├── Tosa.java              # Subclasse: serviço de tosa
├── Inventario.java        # Lista de serviços + emissão de relatório
└── Main.java              # Menu interativo via terminal
```

---

## 💡 Conceitos de POO Utilizados

- **Interface** → `Servico` define o contrato que todos os serviços devem seguir
- **Classe Abstrata** → `ServicoBase` compartilha atributos e comportamentos comuns
- **Herança** → `Banho`, `Hotelzinho` e `Tosa` estendem `ServicoBase`
- **Polimorfismo** → todos os serviços são tratados como `Servico` no inventário
- **ENUM** → `TamanhoAnimal` e `TamanhoPelo` garantem valores fixos e seguros

---

## 💰 Tabela de Preços

### Banho
| Tamanho do Animal | Pelo Curto | Pelo Médio | Pelo Longo |
|-------------------|------------|------------|------------|
| Pequeno           | R$ 50,00   | R$ 65,00   | R$ 75,00   |
| Médio             | R$ 60,00   | R$ 75,00   | R$ 85,00   |
| Grande            | R$ 70,00   | R$ 85,00   | R$ 95,00   |

### Hotelzinho (por hora)
| Tamanho do Animal | Preço/hora |
|-------------------|------------|
| Pequeno           | R$ 12,00   |
| Médio             | R$ 18,00   |
| Grande            | R$ 25,00   |

### Tosa
| Tamanho do Animal | Preço     |
|-------------------|-----------|
| Pequeno           | R$ 30,00  |
| Médio             | R$ 40,00  |
| Grande            | R$ 50,00  |

---

## ▶️ Como Executar

1. Compile todos os arquivos `.java`
2. Execute a classe `Main`
3. Siga o menu interativo no terminal:

```
Bem vindo ao Petshop!
1 - Banho
2 - Hotelzinho
3 - Tosa
0 - Fechar loja
```

4. Ao digitar `0`, o sistema fecha a loja e exibe o relatório do dia.

---

## 📊 Exemplo de Relatório

```
=== Relatório do Dia ===
Codigo: S1  Preco: R$ 75.0
Codigo: S2  Preco: R$ 54.0
Codigo: S3  Preco: R$ 40.0
Total: R$ 169.0
```

---

## 🛠️ Tecnologias

- Java 25
- Nenhuma dependência externa
