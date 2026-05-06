package org.padroes.suporte;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupportRequestTest {

    SupportHandler levelOne;
    SupportHandler levelTwo;
    SupportHandler levelThree;
    SupportHandler critical;

    @BeforeEach
    void setUp() {
        levelOne = new LevelOneSupportHandler();
        levelTwo = new LevelTwoSupportHandler();
        levelThree = new LevelThreeSupportHandler();
        critical = new CriticalSupportHandler();

        levelOne.setNextHandler(levelTwo);
        levelTwo.setNextHandler(levelThree);
        levelThree.setNextHandler(critical);
    }

    @Test
    void deveRetornarAssistenteParaAssinaturaBaixa() {
        assertEquals("Assistente de Suporte", levelOne.handle(new SupportRequest("REQ001", "Como resetar minha senha?", SupportRequest.Priority.LOW, "João")));
    }

    @Test
    void deveRetornarTecnicoParaAssinaturamedia() {
        assertEquals("Técnico de Suporte", levelOne.handle(new SupportRequest("REQ002", "Botão não funciona", SupportRequest.Priority.MEDIUM, "Maria")));
    }

    @Test
    void deveRetornarEngenheiroParaAssinaturaAlta() {
        assertEquals("Engenheiro de Suporte", levelOne.handle(new SupportRequest("REQ003", "Servidor offline", SupportRequest.Priority.HIGH, "Pedro")));
    }

    @Test
    void deveRetornarGerenteParaAssinaturaCritica() {
        assertEquals("Gerente de Operações", levelOne.handle(new SupportRequest("REQ004", "Vazamento de dados", SupportRequest.Priority.CRITICAL, "Carlos")));
    }

}

