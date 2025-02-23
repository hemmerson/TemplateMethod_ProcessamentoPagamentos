package com.hemmersonrosa;

public class PagamentoPayPal extends Pagamento {
    @Override
    protected void validarPagamento() {
        System.out.println("Verificando saldo PayPal...");
    }

    @Override
    protected void processarTransacao() {
        System.out.println("Processando pagamento via PayPal...");
    }
}
