package Chainresp;

public class LeaveSystem {

    public static void main(String[] args) {
        
Approver teamLead=new Teamleader();
Approver manager=new Manager();
Approver accounthead=new AccountHead();

teamLead.setNext(manager);
manager.setNext(accounthead);

teamLead.approvereq(new LeaveR(4));
teamLead.approvereq(new LeaveR(90));
teamLead.approvereq(new LeaveR(19));

    }

}
