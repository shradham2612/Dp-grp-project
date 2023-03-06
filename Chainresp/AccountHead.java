package Chainresp;

public class AccountHead extends Approver{
    public void approvereq(LeaveR req)
    {
        if (req.getDays() > 15) {
            System.out.println("Approved for " + req.getDays() + "days");
        }else
        {
            super.approvereq(req);
        }

    }

   
    
}
