/**
 * Created by panasyuk on 15.06.2015.
 */
public enum Ganre {
    FANTASY(0), fOOD(1), COMPUTERS(2), FICTION(3), HISTORY(4);

    private int id;

    private Ganre(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
