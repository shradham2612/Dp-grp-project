
public class FoodFactory extends AbstractFoodFactory {

    public Dish GetDish(int dishnumber) {
        System.out.println("heyyyyyy");
        if (dishnumber == 1) {
            System.out.println("1 selected");
            return new Pizza();
        } else if (dishnumber == 2) {
            return new Milkshake();
        } else if (dishnumber == 3) {
            return new Pasta();
        } else if (dishnumber == 4) {
            return new Dosa();
        } else if (dishnumber == 5) {
            return new PaniPuri();
        }

        return null;
    }

}