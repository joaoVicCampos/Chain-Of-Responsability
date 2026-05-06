package org.padroes.suporte;

public abstract class SupportHandler {

    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public String handle(SupportRequest request) {
        if (canHandle(request)) {
            return process(request);
        } else if (nextHandler != null) {
            return nextHandler.handle(request);
        } else {
            return "Sem atendimento";
        }
    }

    protected abstract boolean canHandle(SupportRequest request);

    protected abstract String process(SupportRequest request);
}

