package com.company;

public class FabricaProfissional implements FabricaAbstrata{
    @Override
    public Contrato createContrato(){
        return new ContratoProfissional();
    }

    @Override
    public Patrocinio createPatrocinio(){
        return new PatrocinioProfissional();
    }
}
