package tema1.library;

import tema1.model.ArtAlbum;
import tema1.model.Book;
import tema1.model.Novel;

public class LibraryCatalog {
    public static void main(String... args){



        Book firstBook = new Book(100, "nimic");
        Novel firstNovel = new Novel("Sf", 32, "HarryPotter");
        firstBook.addBook(firstNovel);
        ArtAlbum firstArtAlbum = new ArtAlbum("good", 236, "InteriorDesign");
        firstBook.addBook(firstArtAlbum);
        Novel secondNovel = new Novel("mistery", 450, "Anna Karenina");
        firstBook.addBook(secondNovel);
        firstBook.deleteBook(secondNovel);
        firstBook.listBooks();

    }
}
