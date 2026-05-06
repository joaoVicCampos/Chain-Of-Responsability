package org.padroes.suporte;

public class LevelOneSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getPriority() == SupportRequest.Priority.LOW;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("✅ [NÍVEL 1 - Assistente de Suporte]");
        System.out.println("   Processando: " + request);
        System.out.println("   Resposta: Consultando base de conhecimento...");
        System.out.println("   Status: Resolvido com FAQ ou tutorial");
        System.out.println();
    }
}

