package ec.OOP.interfaces.printing.model;

public enum Genre {
    FICTION("Fiction"),
    NON_FICTION("Non fiction"),
    FANTASY("Fantasy"),
    MYSTERY("Mystery"),
    ROMANCE("Romance"),
    PROGRAMMING("Programming"),;

    private final  String gender ;

    Genre(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
