
/**
 * Class for a Bear
 */

public class Beer {
    private String name;
    private Biersorte sort;


    public Beer(String name, Biersorte sort) {
        this.name = name;
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Biersorte getSort() {
        return sort;
    }

    public void setSort(Biersorte sort) {
        this.sort = sort;
    }

}


