package org.padroes.suporte;

public class SupportRequest {

    public enum Priority {
        LOW,
        MEDIUM,
        HIGH,
        CRITICAL
    }

    private String id;
    private String description;
    private Priority priority;
    private String requester;

    public SupportRequest(String id, String description, Priority priority, String requester) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.requester = requester;
    }

    public String getId() { return id; }
    public String getDescription() { return description; }
    public Priority getPriority() { return priority; }
    public String getRequester() { return requester; }

    @Override
    public String toString() {
        return String.format("[%s] %s (Prioridade: %s, Solicitante: %s)",
            id, description, priority, requester);
    }
}

