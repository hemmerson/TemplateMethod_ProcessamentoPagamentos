package com.hemmersonrosa;

public class Main {
    public static void main(String[] args) {
        System.out.println("====== Pagamento com Cartão de crédito ======");
        Pagamento pagamento1 = new PagamentoCartaoCredito();
        pagamento1.processarPagamento();

        System.out.println("\n====== Pagamento com PayPal            ======");
        Pagamento pagamento2 = new PagamentoPayPal();
        pagamento2.processarPagamento();

        System.out.println("\n====== Pagamento com Boleto            ======");
        Pagamento pagamento3 = new PagamentoBoleto();
        pagamento3.processarPagamento();
    }
}