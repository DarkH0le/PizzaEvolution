import java.util.ArrayList;
import java.util.List;

public class PlainBurger implements Strategy {

    @Override
    public void cook(List<String> elemToGrill, List<String> sausage, List<String> Veggies) {

        List<String> elements = elemToGrill;
        for (int i =0; i< elements.size(); i++){
            System.out.print("grilling " + elements.get(i));

            this.ingredients.set(i,elements.get(i) + "COOKED");
        }
        List<Integer> indexes = assemble();
        List<String> newIngredients = new ArrayList<>();

        for (Integer index : indexes){
            newIngredients.add(ingredients.get(index));
        }

        ingredients=newIngredients;
    }
}
