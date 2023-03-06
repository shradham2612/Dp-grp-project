public class Dishdecorator implements Dish {

    protected Dish decoratedDish;

    public Dishdecorator(Dish decoratedDish) {
        this.decoratedDish = decoratedDish;
    }

    @Override
    public void cook() {
        decoratedDish.cook();

    }

}

class addToppings extends Dishdecorator {

    public addToppings(Dish decoratedDish) {
        super(decoratedDish);

    }

    public void cook() {
        // decoratedDish.cook();
        toppingsAdded(decoratedDish);

    }

    private void toppingsAdded(Dish decoratedDish) {

        System.out.println("Toppings added to " + decoratedDish.toString());
    }

}

class addSpices extends Dishdecorator {

    public addSpices(Dish decoratedDish) {
        super(decoratedDish);

    }

    public void cook() {
        // decoratedDish.cook();
        spicesAdded(decoratedDish);

    }

    private void spicesAdded(Dish decoratedDish) {

        System.out.println("Spices added to " + decoratedDish.toString());
    }

}

class addGarnishing extends Dishdecorator {

    public addGarnishing(Dish decoratedDish) {
        super(decoratedDish);

    }

    public void cook() {
        // decoratedDish.cook();
        garnishingAdded(decoratedDish);

    }

    private void garnishingAdded(Dish decoratedDish) {

        System.out.println("Garnishing done for " + decoratedDish.toString());
    }

}

class add_drinks extends Dishdecorator {

    public add_drinks(Dish decoratedDish) {
        super(decoratedDish);

    }

    public void cook() {
        // decoratedDish.cook();
        Roohafza(decoratedDish);

    }

    private void Roohafza(Dish decoratedDish) {

        System.out.println("Drinks are added to " + decoratedDish.toString());
    }

}
