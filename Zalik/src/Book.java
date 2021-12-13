import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {

    private String title;

    private List<Student> bookOwners;

    public Book(String title) {
        this.title = title;
        this.bookOwners = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public List<Student> getBookOwners() {
        return bookOwners;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBookOwners(List<Student> bookOwners) {
        this.bookOwners = bookOwners;
    }

    public void addBookOwner(Student student) {
        this.bookOwners.add(student);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", bookOwners=" + bookOwners +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(bookOwners, book.bookOwners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, bookOwners);
    }


}
