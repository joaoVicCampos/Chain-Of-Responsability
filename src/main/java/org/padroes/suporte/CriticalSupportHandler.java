package org.padroes.suporte;

public class CriticalSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getPriority() == SupportRequest.Priority.CRITICAL;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("⚠️  [NÍVEL CRÍTICO - Gerente de Operações]");
        System.out.println("   Processando: " + request);
        System.out.println("   Ação: ATIVANDO PROTOCOLO DE EMERGÊNCIA!");
        System.out.println("   Status: Equipe executiva notificada - Investigação imediata");
        System.out.println();
    }
}

