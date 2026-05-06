package org.padroes.suporte;

public class CriticalSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getPriority() == SupportRequest.Priority.CRITICAL;
    }

    @Override
    protected String process(SupportRequest request) {
        return "Gerente de Operações";
    }
}

