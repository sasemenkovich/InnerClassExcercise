/**
 * Created by Соня on 17.10.2014.
 */
public class Popsi extends Drink {

    public String getIngredients()
    {
        return "Sugar and caffeine";
    }

    public Popsi()
    {
        super(10,"Great carbonated soda");
    }

    public void finalize() throws Throwable {
        super.finalize();
        System.out.println("Deleted");
    }
}
