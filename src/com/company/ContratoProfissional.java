package com.company;

public class ContratoProfissional implements Contrato{


    @Override
    public String emitir() {
        return "Jogador contratado para a liga profissional";
    }
}
