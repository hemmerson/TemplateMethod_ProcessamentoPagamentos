package com.hemmersonrosa;

public class PagamentoCartaoCredito extends Pagamento {
    @Override
    protected void validarPagamento() {
        System.out.println("Validando cartão de credito...");
    }

    @Override
    protected void processarTransacao() {
        System.out.println("Processando pagamento via cartão de credito...");
    }
}
