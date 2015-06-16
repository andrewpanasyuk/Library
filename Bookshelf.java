/**
 * Created by panasyuk on 15.06.2015.
 */
public class Bookshelf {
    private int sizeShelf = 20;
    private String alfabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private Book[][] authorBase;
    private Book[][] nameBase;
    private Book[][] genreBase;

    Bookshelf() {
        sizeShelf = 20;
        this.authorBase = Utils.baseMake(alfabet.length(), sizeShelf);
        this.nameBase = Utils.baseMake(alfabet.length(), sizeShelf);
        this.genreBase = Utils.baseMake(alfabet.length(), sizeShelf);
    }

    public void newBookInShelf(String author, String name, Ganre genre) {
        Book book = new Book(author, name, genre);
        int litAutor = Utils.namberLitters(book.getAuthor(), alfabet);
        for (int i = 0; i < sizeShelf; i++) {
            if (authorBase[litAutor][i].getAuthor() == null && authorBase[litAutor][i].getName() == null) {
                this.authorBase[litAutor][i] = book;
                break;
            }
        }
        int litName = Utils.namberLitters(book.getName(), alfabet);
        for (int a = 0; a < sizeShelf; a++) {
            if (nameBase[litName][a].getName() == null && nameBase[litName][a].getAuthor() == null) {
                nameBase[litName][a] = book;
                break;
            }
        }
        int idGanre = book.getGanre().getId();
        for (int a = 0; a < sizeShelf; a++) {
            if (genreBase[idGanre][a].getName() == null && genreBase[idGanre][a].getAuthor() == null) {
                genreBase[idGanre][a] = book;
                break;
            }
        }
    }

    public void searchAutor(String autorName) {
        int numberCatalog = Utils.namberLitters(autorName, alfabet);
        int i = 0;
        while (i < 20) {
            if (authorBase[numberCatalog][i].getAuthor() != null) {
                if (authorBase[numberCatalog][i].getAuthor().equals(autorName)) {
                    System.out.println("You autor: " + authorBase[numberCatalog][i].getAuthor() + "; " + authorBase[numberCatalog][i].getName() + "; " + authorBase[numberCatalog][i].getGanre());
                }
            }
            i++;
        }

    }

    public void searchName(String bookName) {
        int numberCatalog = Utils.namberLitters(bookName, alfabet);
        int i = 0;
        while (i < 20) {
            if (nameBase[numberCatalog][i].getName() != null) {
                if (nameBase[numberCatalog][i].getName().equals(bookName)) {
                    System.out.println("You book: " + nameBase[numberCatalog][i].getName() + "; " + nameBase[numberCatalog][i].getAuthor() + "; " + nameBase[numberCatalog][i].getGanre());
                }
            }
            i++;
        }
    }

    public void searchGenre(Ganre ganre) {
        int i = 0;
        System.out.println("Books in you Ganre:");
        int count = 0;
        while (i < 20) {
            if (count < 3) {
            if (genreBase[ganre.getId()][i].getGanre() == ganre && genreBase[ganre.getId()][i].getFlag() == 0) {
                    System.out.println(genreBase[ganre.getId()][i].getAuthor() + ", " + genreBase[ganre.getId()][i].getName());
                    this.genreBase[ganre.getId()][i].setFlag(1);
                count++;
                }
            }
            i++;

        }
    }

    public Book[][] getAuthorBase() {
        return authorBase;
    }

    public void setAuthorBase(Book[][] authorBase) {
        this.authorBase = authorBase;
    }

    public Book[][] getGenreBase() {
        return genreBase;
    }

    public void setGenreBase(Book[][] genreBase) {
        this.genreBase = genreBase;
    }

    public Book[][] getNameBase() {
        return nameBase;
    }

    public void setNameBase(Book[][] nameBase) {
        this.nameBase = nameBase;
    }

    public int getSizeShelf() {
        return sizeShelf;
    }

    public void setSizeShelf(int sizeShelf) {
        this.sizeShelf = sizeShelf;
    }
}
