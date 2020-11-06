package tema1.model;

public class ArtAlbum extends Book {
    private String paperQuality;

    public ArtAlbum(String paperQuality, int numberOfPages, String nameOfBook) {
        super(numberOfPages, nameOfBook);
        this.paperQuality = paperQuality;
    }
}
