/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Profesor
 */
public abstract class Burger {

    Strategy strategy;
    Delivery deliveryMethod;

    protected List<String> ingredients = new ArrayList<>();
    private boolean paralelism = true;

    public Burger() {
       // this.strategy = new ToEatHere();
        this.deliveryMethod = new ToEatHere();
    }

    public Burger(Strategy strategy, Delivery deliveryMethod) {
        this.strategy = strategy;
        this.deliveryMethod = deliveryMethod;
    }

    public void setDeliveryMethod(Delivery deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void prepare()
    {
        this.strategy.cook(getElementsToBeGrilled(), getSausage(),getVeggies());
    }

    public void deliver(){
        this.deliveryMethod.deliver();
    }


   // impl of all burgers

//   public void cook(){
//       add();
//       List<String> elements = getElementsToBeGrilled();
//       for (int i =0; i< elements.size(); i++){
//           System.out.print("grilling " + elements.get(i));
//
//           this.ingredients.set(i,elements.get(i) + "COOKED");
//       }
//       List<Integer> indexes = assemble();
//       List<String> newIngredients = new ArrayList<>();
//
//       for (Integer index : indexes){
//          newIngredients.add(ingredients.get(index));
//       }
//
//       ingredients=newIngredients;
//   }

//   public void deliver(){
//       System.out.println("Your burger");
//       for(String element: this.ingredients){
//       System.out.println(element);
//
//       }
   

  
   abstract List<String> getElementsToBeGrilled();
   abstract List<String> getVeggies();
   abstract List<String> getSausage();
   abstract void add();
   abstract List<Integer> assemble();
   
}
