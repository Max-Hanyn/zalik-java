package zav2;


import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(final String[] args) {

        Author author1 = new Author("Max1");
        Author author2 = new Author("Max2");
        Author author3 = new Author("Max3");
        Author author4 = new Author("Max4");

        Material material1 = new Material("wood", 1500);
        Material material2 = new Material("plastic", 150);
        Material material3 = new Material("cotton", 300);

        List<Material> materialsList = new ArrayList();

        materialsList.add(material1);
        materialsList.add(material2);
        materialsList.add(material3);

        List<Author> authorList = new ArrayList<>();

        authorList.add(author1);
        authorList.add(author2);
        authorList.add(author3);
        authorList.add(author4);

        Game game = new Game(materialsList, authorList);


        System.out.print(game.calculateSum());

    }
}