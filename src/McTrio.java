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
public class McTrio extends Burger {

   @Override
    List<String> getElementsToBeGrilled() {
        List<String> elements = new ArrayList<>();
        elements.add("Steak");
        elements.add("Steak");
        return elements;
    }

    @Override
    void add() {
        this.ingredients.add("Bottom bread");
        this.ingredients.add("Upper bread");
        this.ingredients.add("Steak");
         this.ingredients.add("Steak"); 
         this.ingredients.add("Middle bread");
    }
    
    @Override
    List<Integer> assemble(){
        List<Integer> order = new ArrayList<>();
        order.add(0);
        order.add(3);
        order.add(4);
        order.add(2);
        order.add(1);
        return order;
    }
    
}
