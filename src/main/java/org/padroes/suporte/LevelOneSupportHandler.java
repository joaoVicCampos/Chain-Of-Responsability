package org.padroes.suporte;

public class LevelOneSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getPriority() == SupportRequest.Priority.LOW;
    }

    @Override
    protected String process(SupportRequest request) {
        return "Assistente de Suporte";
    }
}

