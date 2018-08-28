/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Profesor
 */
public class PointOfSale {

    
    public static void main(String []args){

//    BurgerImpl burger = new BurgerImpl(new McTrio());
//    burger.prepare();
//    burger.deliver();
        String burgername = "algo";
        switch (burgername) {
            case "McTrio":
                Burger newBurger = new McTrio();
                break;
            default:
                break;
        }

    }
    
}
