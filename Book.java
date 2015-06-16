/**
 * Created by panasyuk on 15.06.2015.
 */
public class Book {
    private String name;
    private String author;
    private  Ganre ganre;
    private int flag;
public Book(){

}
public Book (String author, String name, Ganre ganre) {
    this.name = name;
    this.author = author;
    this.ganre = ganre;
    this.flag = 0;

}

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public Ganre getGanre() {
        return ganre;
    }

    public void setGanre(Ganre ganre) {
        this.ganre = ganre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
