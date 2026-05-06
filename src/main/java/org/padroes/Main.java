package org.padroes;

import org.padroes.suporte.*;

public class Main {
    public static void main(String[] args) {
        SupportHandler levelOne = new LevelOneSupportHandler();
        SupportHandler levelTwo = new LevelTwoSupportHandler();
        SupportHandler levelThree = new LevelThreeSupportHandler();
        SupportHandler critical = new CriticalSupportHandler();

        levelOne.setNextHandler(levelTwo);
        levelTwo.setNextHandler(levelThree);
        levelThree.setNextHandler(critical);

        SupportRequest[] requests = {
            new SupportRequest("REQ001", "Como resetar minha senha?",
                SupportRequest.Priority.LOW, "João Silva"),

            new SupportRequest("REQ002", "Botão de salvar não funciona",
                SupportRequest.Priority.MEDIUM, "Maria Santos"),

            new SupportRequest("REQ003", "Servidor de produção offline!",
                SupportRequest.Priority.HIGH, "Pedro Costa"),

            new SupportRequest("REQ004", "Vazamento de dados de clientes detectado",
                SupportRequest.Priority.CRITICAL, "Carlos Oliveira"),

            new SupportRequest("REQ005", "Consultar documentação da API",
                SupportRequest.Priority.LOW, "Ana Paula")
        };

        for (SupportRequest request : requests) {
            levelOne.handle(request);
        }
    }
}