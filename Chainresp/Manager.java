package Chainresp;

public class Manager extends Approver{

    public void approvereq(LeaveR req)
    {
        if(req.getDays()<=15 && req.getDays()>5)
        {
             System.out.println("Approved for "+req.getDays()+"days");
        }
        else
        {
            super.approvereq(req);
        }
    }
    
}
