package org.padroes.suporte;

public class LevelTwoSupportHandler extends SupportHandler {

    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getPriority() == SupportRequest.Priority.MEDIUM;
    }

    @Override
    protected String process(SupportRequest request) {
        return "Técnico de Suporte";
    }
}
