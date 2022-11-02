package templateMethod;

public abstract class TaskExecutor {
    private AuditTrail auditTrail;

    public TaskExecutor() {
        this.auditTrail = new AuditTrail();
    }

    public TaskExecutor(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        doExecute();
    }

    protected abstract void doExecute();
}
