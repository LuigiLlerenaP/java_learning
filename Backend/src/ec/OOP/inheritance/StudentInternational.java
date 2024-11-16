package ec.OOP.inheritance;

public class StudentInternational extends Student{
    private  String country;
    private  String period;
    private String visaStatus;
    private String languageLevel;
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {

        this.period = period;
    }

    public String getLanguageLevel() {
        return languageLevel;
    }

    public void setLanguageLevel(String languageLevel) {
        this.languageLevel = languageLevel;
    }
}
