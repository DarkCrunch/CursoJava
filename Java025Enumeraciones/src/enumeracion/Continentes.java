package enumeracion;

public enum Continentes {
    AFRICA(53, "1.2 billones"),
    EUROPA(46, "1.3 billones"),
    ASIA(44, "1.3 billones"),
    AMERICA(34, "1.4 billones"),
    OCEANIA(14, "1.5 billones");

    private final int paises;
    private final String habitantes;

    Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises() {
        return paises;
    }

    public String getHabitantes() {
        return habitantes;
    }
}
