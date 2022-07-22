
/**
 *
 * @author ranmerc
 */
public class Book {

    private String title;
    private int pages;
    private int publicationYear;

    public Book(String initialName, int initialPages, int initialPublicationYear) {
        this.title = initialName;
        this.pages = initialPages;
        this.publicationYear = initialPublicationYear;
    }
    
    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title + ", " + this.pages + " pages, " + this.publicationYear;
    }
}
