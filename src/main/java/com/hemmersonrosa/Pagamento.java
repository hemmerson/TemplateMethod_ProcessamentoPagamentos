package com.hemmersonrosa;

abstract class Pagamento {
    public final void processarPagamento() {
        validarPagamento();
        processarTransacao();
        confirmarPagamento();
    }

    protected abstract void validarPagamento();
    protected abstract void processarTransacao();

    private void confirmarPagamento() {
        System.out.println("Pagamento confirmado");
    }
}
