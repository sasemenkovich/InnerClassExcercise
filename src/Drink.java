/**
 * Created by Соня on 17.10.2014.
 */
public abstract class Drink {
    private int sugarContent = 0;
    private int serialNo;
    private String description;

    public Drink(int serialNo, String description){
        this.description = description;
        this.serialNo = serialNo;
    }

    public String toString() {
        String res = serialNo + " " + description + " " + sugarContent;
        System.out.println(res);
        return res;
    }

    public void increaseSugarContent(int x){
        this.sugarContent+=x;
    }

    abstract String getIngredients();

}
