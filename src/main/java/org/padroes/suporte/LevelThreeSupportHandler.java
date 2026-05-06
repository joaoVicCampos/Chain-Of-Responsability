package org.padroes.suporte;

public class LevelThreeSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getPriority() == SupportRequest.Priority.HIGH;
    }

    @Override
    protected String process(SupportRequest request) {
        return "Engenheiro de Suporte";
    }
}
