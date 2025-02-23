package com.hemmersonrosa;

public class PagamentoBoleto extends Pagamento {
    @Override
    protected void validarPagamento() {
        System.out.println("Gerando boleto...");
    }

    @Override
    protected void processarTransacao() {
        System.out.println("Aguardando pagamento do boleto...");
    }
}
