import java.util.*;
import java.util.Scanner;

abstract class OrderTemplate {

  public abstract void Order();

  public abstract void Cooking();

  public abstract void Serving();

  public abstract void Payment();

  public void StartProcess() {
    Order();
    Cooking();
    Serving();
    Payment();
  }
}

class Netorder extends OrderTemplate {

  Dish mydish;
  //   String Mydecoration;
  ArrayList<String> Mydecoration = new ArrayList<>();

  @Override
  public void Order() {
    System.out.println(
      "\nWelcome To Our Restaurant\nEnter Number to place your order"
    );
    // Printing of arraylist menucard
    // Calling abstract factory method

    ArrayList<String> menu = new ArrayList<String>();
    menu.add("1--Pizza");
    menu.add("2--Milkshake");
    menu.add("3--Pasta");
    menu.add("4--Dosa");
    menu.add("5--Panipuri");

    for (String i : menu) {
      System.out.println(i);
    }

    Scanner myObj = new Scanner(System.in);
    System.out.println("\n\nEnter one of the above option : ");

    int option = myObj.nextInt();

    AbstractFoodFactory Myfood = new FoodFactory();
    Dish d = Myfood.GetDish(option);
    mydish = d;
    d.cook();
  }

  Dish Getorder() {
    return mydish;
  }

  @Override
  public void Cooking() {
    while (true) {
      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out.println(
        "\nWould you like to have some more additions for your dish ?\n"
      );
      System.out.println("Enter --(Yes/No)\n");
      Scanner cnfrm = new Scanner(System.in); // Create a Scanner object
      String ans = cnfrm.nextLine();
	 
      if (ans.equalsIgnoreCase("yes")) {
        System.out.println("\n\n\nSelect Additions for the dish :");

        ArrayList<String> decoration = new ArrayList<String>();
        decoration.add("1--Toppings");
        decoration.add("2--Spices");
        decoration.add("3--Garnishing");
        decoration.add("4--Softdrink");

        for (String i : decoration) {
          System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter one of the above option : ");

        int option = sc.nextInt();
        System.out.println("Option selected is : " + option);
        Dish dcr;
        if (option == 1) {
          dcr = new addToppings(mydish);
          Mydecoration.add("Toppings");
          dcr.cook();
        } else if (option == 2) {
          dcr = new addSpices(mydish);
          Mydecoration.add("Spices");
          dcr.cook();
        } else if (option == 3) {
          dcr = new addGarnishing(mydish);
          Mydecoration.add("Garnishing");
          dcr.cook();
        } else if (option == 4) {
          dcr = new add_drinks(mydish);
          Mydecoration.add("Drinks");
          dcr.cook();
        }
      } else {
        break;
      }
    }
  }

  @Override
  public void Serving() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("\n\n\nYou will be served ");
    System.out.println("\t"+mydish.toString() + "\nIn addition with :");
    for (String i : Mydecoration) {
      System.out.println("\t"+i);
    }
  }

  @Override
  public void Payment() {
   
    System.out.println(
      "\n\n\nHave a happy meal\n\nYour Payment is Processing.....\n\tPayment Successfull !"
    );
  }
}
