/**
 * Created by panasyuk on 15.06.2015.
 */
public class Launcher {

    public static void main(String[] args)  {
        Bookshelf bs = new Bookshelf();
        bs.newBookInShelf("Petrov", "Aaa", Ganre.COMPUTERS);
        bs.newBookInShelf("Petrov", "Sss", Ganre.FANTASY);
        bs.newBookInShelf("Detrov", "Aa1", Ganre.COMPUTERS);
        bs.newBookInShelf("Wetrov", "Aa2", Ganre.COMPUTERS);
        bs.newBookInShelf("Retrov", "Aa3", Ganre.COMPUTERS);
        bs.newBookInShelf("Letrov", "Aa4", Ganre.COMPUTERS);
        bs.newBookInShelf("Trov", "Aa5", Ganre.COMPUTERS);

        bs.searchAutor("Petrov");
        bs.searchName("Aaa");
        bs.searchGenre(Ganre.COMPUTERS);
        bs.searchGenre(Ganre.COMPUTERS);

    }
}
