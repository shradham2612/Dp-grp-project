package Chainresp;

public abstract class Approver {

    protected Approver nextApprover;
    public void approvereq(LeaveR req)
    {
        nextApprover.approvereq(req);
    }

    public void setNext(Approver approver)
    {
        this.nextApprover=approver;
    }
    
}
