package com.company;

public class FabricaSub18 implements FabricaAbstrata{
    @Override
    public Contrato createContrato(){
        return new ContratoSub18();
    }

    @Override
    public Patrocinio createPatrocinio(){
        return new PatrocinioSub18();
    }
}
