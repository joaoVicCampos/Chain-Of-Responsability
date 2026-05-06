package org.padroes.suporte;

public class LevelTwoSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getPriority() == SupportRequest.Priority.MEDIUM;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("✅ [NÍVEL 2 - Técnico de Suporte]");
        System.out.println("   Processando: " + request);
        System.out.println("   Ação: Analisando logs e reproduzindo erro...");
        System.out.println("   Status: Ticket aberto para investigação");
        System.out.println();
    }
}
