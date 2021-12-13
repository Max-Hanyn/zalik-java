package zav2;

import java.util.Collections;
import java.util.List;

public class Game {

    private List<Material> materials;
    private List<Author> authors;

    public Game(List<Material> materials, List<Author> authors) {
        this.materials = materials;
        this.authors = authors;
    }

    public float calculateSum(){

        int materialSum = this.materials.stream().mapToInt(value -> value.getPrice()).sum();

        float commission = (float) (materialSum * 0.2);

        float authorCommission = 0;
        int authorsCount = authors.size();

        if (authorsCount > 10){
            authorCommission = 10;
        } else {
            authorCommission = authorsCount;
        }

        float authorsSumCommission = materialSum * (authorCommission/100);

        return materialSum + commission + authorsSumCommission;
    }

    private static int matterialsSum(Material a, Material b){

        return a.getPrice() + b.getPrice();
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Game{" +
                "materials=" + materials +
                ", authors=" + authors +
                '}';
    }


}
