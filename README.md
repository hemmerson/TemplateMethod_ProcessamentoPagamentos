# 💳 Template Method - Processamento de Pagamentos

Este repositório contém uma implementação do **padrão de projeto Template Method** aplicada a um sistema de pagamentos. O objetivo é garantir um fluxo de pagamento estruturado e flexível, onde diferentes métodos de pagamento possam ser adicionados sem modificar a lógica central do processo.

---

## 📌 **Descrição do Problema**

O sistema precisa processar diferentes formas de pagamento, cada uma com regras específicas:

- **Cartão de Crédito**: Valida o cartão, verifica saldo e processa a transação.
- **PayPal**: Verifica saldo na conta PayPal e processa a transação.
- **Boleto Bancário**: Gera um boleto e aguarda o pagamento.

Apesar das diferenças, todas as formas de pagamento seguem um fluxo fixo:

1. **Validar o pagamento** (específico para cada método);
2. **Processar a transação** (específico para cada método);
3. **Confirmar o pagamento** (comum para todos os métodos).

---

## 🔨 **Padrão Utilizado: Template Method**

O padrão **Template Method** permite definir um algoritmo base com passos fixos, delegando a implementação de partes específicas para subclasses.

### **Diagrama UML da Solução**

```
Pagamento (abstract class)
│
├──> PagamentoCartaoCredito (subclass)
├──> PagamentoPayPal (subclass)
└──> PagamentoBoleto (subclass)
```

- `Pagamento` (classe abstrata) contém o método **processarPagamento()**, que define o fluxo fixo do pagamento.
- Cada subclasse (`PagamentoCartaoCredito`, `PagamentoPayPal`, `PagamentoBoleto`) implementa suas próprias versões dos métodos abstratos.

---

## 🚀 **Tecnologias Utilizadas**

- **Java**
- **Paradigma Orientado a Objetos (POO)**
- **Padrões de Projeto (Template Method)**

---

## 📂 **Estrutura do Código**

```
📦 src
 ┣ 📜 Pagamento.java (Classe abstrata - Template Method)
 ┣ 📜 PagamentoCartaoCredito.java (Implementação específica)
 ┣ 📜 PagamentoPayPal.java (Implementação específica)
 ┣ 📜 PagamentoBoleto.java (Implementação específica)
 ┗ 📜 Main.java (Classe de teste)
```

---

## 🛠 **Como Executar**

1. Clone este repositório:
   ```sh
   git clone https://github.com/seu-usuario/template-method-pagamento.git
   ```
2. Compile o código:
   ```sh
   javac src/*.java
   ```
3. Execute o programa:
   ```sh
   java src.Main
   ```

---

## 📌 **Saída Esperada**

```sh
=== Pagamento com Cartão de Crédito ===
Validando cartão de crédito...
Processando pagamento via cartão de crédito.
Pagamento confirmado!

=== Pagamento com PayPal ===
Verificando saldo no PayPal...
Processando pagamento via PayPal.
Pagamento confirmado!

=== Pagamento com Boleto ===
Gerando boleto...
Aguardando pagamento do boleto.
Pagamento confirmado!
```

---

## 🎯 **Benefícios do Template Method nesta solução**

✅ Evita duplicação de código, mantendo o fluxo de pagamento padronizado.\
✅ Facilita a adição de novos métodos de pagamento sem modificar o código existente.\
✅ Segue o **princípio do aberto/fechado (OCP)** do SOLID, permitindo extensão sem modificação.

---

## 📌 **Autor**

✍️ Desenvolvido por Hemmerson Luis Barros da Rosa(https://github.com/hemmerson).

Sinta-se à vontade para contribuir ou sugerir melhorias! 🚀

