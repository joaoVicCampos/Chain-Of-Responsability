package org.padroes.suporte;

public class LevelThreeSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getPriority() == SupportRequest.Priority.HIGH;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("✅ [NÍVEL 3 - Engenheiro de Suporte]");
        System.out.println("   Processando: " + request);
        System.out.println("   Ação: Ativando equipe de infraestrutura...");
        System.out.println("   Status: Iniciando diagnóstico em tempo real");
        System.out.println();
    }
}
