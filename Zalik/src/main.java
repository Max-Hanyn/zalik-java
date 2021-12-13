import java.util.List;
import java.util.stream.Collectors;

public class main {

    public static List<Student> filterBookOwners(Book book) {

        return book.getBookOwners().stream().filter(student -> student.getName() == "Ярослав").collect(Collectors.toList());
    }

    public static void main(final String[] args) {

        Student user1 = new Student("Ярослав", "Karui");
        Student user2 = new Student("Max2", "Hanyn2");
        Student user3 = new Student("Ярослав", "Jjk");
        Student user4 = new Student("Max3", "Hanyn3");

        Book harryPotter = new Book("Harry");

        harryPotter.addBookOwner(user1);
        harryPotter.addBookOwner(user2);
        harryPotter.addBookOwner(user3);
        harryPotter.addBookOwner(user4);


        System.out.print(filterBookOwners(harryPotter));

    }
}