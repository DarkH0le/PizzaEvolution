import com.darkh0le.burger.CheesBurger;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        System.out.println("Select a Pizza:" + "\n" +
                "1.- Chees \n" +
                "2.- Ranch");
        Scanner sc = new Scanner(System.in);
        Integer pizza = sc.nextInt();
        switch (pizza) {
            case 1:
                CheesBurger cheesBurger = new CheesBurger();
                System.out.println("Total:" + cheesBurger.delirver() + " You order a:" + cheesBurger.toString());
                break;
            case 2:
                //Peppreoni pepperoni = new Pepperoni();
                //System.out.println(pepperoni.toString());
                break;
            default:
                System.out.println("No such burger");
                break;
        }

    }
}
