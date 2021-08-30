package com.company;

public class Jogador {

    public Contrato contrato;
    public Patrocinio patrocinio;

    public Jogador(FabricaAbstrata fabrica) {
        this.contrato = fabrica.createContrato();
        this.patrocinio = fabrica.createPatrocinio();
    }

    public String emitirContrato(){
        return this.contrato.emitir();
    }

    public String emitirPatrocinio(){
        return this.patrocinio.emitir();
    }
}
