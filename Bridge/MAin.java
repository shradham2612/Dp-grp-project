package Bridge;

public class MAin {
    
public static void main(String[] args) {
    Vehicle v1= new Car(new Produce(), new Assemble());
    v1.manufacture();
    Vehicle v2= new Car(new Produce(), new Produce());
    v2.manufacture();


}

}
