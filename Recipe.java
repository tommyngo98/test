import java.util.ArrayList;

public class Recipe {
    private String name;
    private String desc;

    public Recipe(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Name des Rezepts: " + this.name + ", Beschreibung: " + this.desc;
    }

    public static void main(String[] args) {
        var recipes = new ArrayList<Recipe>();
        recipes.add(new Recipe("Bolo", "Nudeln mit Tomatensauce"));
        recipes.add(new Recipe("Pizza", "Lecker Pizza"));

        for (Recipe r: recipes) {
            System.out.println(r);
        }
    }
}
