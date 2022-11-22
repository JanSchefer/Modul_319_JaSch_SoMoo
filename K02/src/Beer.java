

/**
 * Class for a Bear
 */

public class Beer {
    private String name;
    private Sort sort;

    public Beer(String name, Sort sort) {
        this.name = name;
        this.sort = sort;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }
}

enum Sort {
    LAGER,
    AMBER,
    DARK,
    STOUT,
    ALE,
}
