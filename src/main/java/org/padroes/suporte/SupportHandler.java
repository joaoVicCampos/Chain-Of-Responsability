package org.padroes.suporte;

public abstract class SupportHandler {

    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(SupportRequest request) {
        if (canHandle(request)) {
            process(request);
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println("❌ Nenhum handler conseguiu resolver: " + request.getDescription());
        }
    }

    protected abstract boolean canHandle(SupportRequest request);

    protected abstract void process(SupportRequest request);
}

