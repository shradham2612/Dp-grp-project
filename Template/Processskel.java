package Template;

abstract class Processskel {

    public abstract void select();
    public abstract void getdiscount();
    public abstract void payment();

    public final void flow()
    {
        select();
        getdiscount();
        payment();
    }

    
}
