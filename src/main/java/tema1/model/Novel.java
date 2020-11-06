package tema1.model;

public class Novel extends Book {
    private String type;

    public Novel(String type, int numberOfPages, String nameOfBook) {
        super(numberOfPages, nameOfBook);
        this.type = type;
    }
}
