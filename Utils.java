/**
 * Created by panasyuk on 15.06.2015.
 */
public class Utils {
    public static Book [][] baseMake (int alf, int sizeShelf) {
        Book[][] books = new Book [alf][sizeShelf];
        for (int i = 0; i<alf ; i++) {
            for (int n = 0; n < sizeShelf; n++) {
                books[i][n] = new Book();
            }
        }
        return books;
    }

    public static int namberLitters(String parametr, String alfabet){
      String a = parametr.substring(0, 1);
        int n = alfabet.indexOf(a);
        return n;
    }

}
