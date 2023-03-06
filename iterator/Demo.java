package iterator;

public class Demo {
    public static void main(String[] args) {
        NameRepository namerep=new NameRepository();
        for(Iterator itr=namerep.getIterator();itr.hasNext();)
        {
            String name =(String)itr.next();
            System.out.println("Name :" +name );
        }
    }
    
}
