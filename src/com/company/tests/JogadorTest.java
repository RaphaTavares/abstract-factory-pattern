package com.company.tests;

import com.company.FabricaAbstrata;
import com.company.FabricaProfissional;
import com.company.FabricaSub18;
import com.company.Jogador;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JogadorTest {

    @Test
    void deveEmitirContratoPatrocinioSub18(){
        FabricaAbstrata fabrica = new FabricaSub18();
        Jogador jogador = new Jogador(fabrica);
        assertEquals("Jogador contratado para a categoria sub 18", jogador.emitirContrato());
        assertEquals("Jogador recebeu patrocínio equivalente a copa sub 18", jogador.emitirPatrocinio());
    }

    @Test
    void deveEmitirContratoPatrocinioProfissional(){
        FabricaAbstrata fabrica = new FabricaProfissional();
        Jogador jogador = new Jogador(fabrica);
        assertEquals("Jogador contratado para a liga profissional", jogador.emitirContrato());
        assertEquals("Jogador recebeu patrocínio equivalente a liga profissional", jogador.emitirPatrocinio());
    }
}
