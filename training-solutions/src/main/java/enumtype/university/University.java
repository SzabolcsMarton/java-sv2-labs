package enumtype.university;

public enum University {

    BME("Budapesti Muszaki Egyetem"), SOTE("Semelweis Orvostudomanyi Egyetem"),
    ELTE("Eotvos Lorand Tudomanyegyetem");

    private String name;

    University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
