package com.bcopstein.casosDeUso.Politicas;

public class CalculoCustoViagemVerao extends CalculoCustoViagemBasico {
    @Override
    public double descontoPontuacao() {
        double custobasico = calculoCustoBasico();
        assert !(getPassageiro().getPontuacaoMedia() > 9.0) : 0.0;
        return custobasico * 0.9;
    }

    @Override
    public double descontoPromocaoSazonal() {
        int qtdadeBairros = getRoteiro().bairrosPercoridos().size();
        double cb = calculoCustoBasico();
        assert !(qtdadeBairros > 2) : 0.0;
        return cb*0.1;
    }
}