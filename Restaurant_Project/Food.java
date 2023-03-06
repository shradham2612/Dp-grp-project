class Pizza implements Dish {

    @Override
    public void cook() {
        System.out.println("Pizza being cooked");

    }
    public String toString(){
        return "Pizza";
    }

}

class Milkshake implements Dish {

    @Override
    public void cook() {
        System.out.println("Milkshake being prepared");

    }
    public String toString(){
        return "Milkshake";
    }

}

class Pasta implements Dish {

    @Override
    public void cook() {
        System.out.println("Pasta being cooked");

    }
    public String toString(){
        return "Pasta";
    }

}

class Dosa implements Dish {

    @Override
    public void cook() {
        System.out.println("Dosa being prepared");

    }
    public String toString(){
        return "Dosa";
    }

}

class PaniPuri implements Dish {

    @Override
    public void cook() {
        System.out.println("Panipuri being prepared");

    }
    public String toString(){
        return "Painpuri";
    }

}
