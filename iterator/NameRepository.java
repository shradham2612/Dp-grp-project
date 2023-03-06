package iterator;

public class NameRepository implements Container{

    public String names[]={"flower","pushpa","fool","lol"};
   
    public Iterator getIterator() {
       return new NameIterator();
    }

    private class NameIterator implements Iterator
    {

        int index=0;
        @Override
        public boolean hasNext() {
           if (index<names.length)
           {
            return true;
           }
           return false;
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return false;
        }
        
    }
    
}
