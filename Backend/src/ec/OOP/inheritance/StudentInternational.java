package ec.OOP.inheritance;

public class StudentInternational extends Student {
    private String country;
    private String period;

    private LanguageLevel languageLevel;


    /**
     * Default constructor.
     * Invokes the parent class constructor.
     */
    public StudentInternational() {
        super();
        System.out.println("----Inside StudentInternational constructor (no args)----");
    }

    /**
     * Constructor with firstName and lastName.
     */
    public StudentInternational(String firstName, String lastName) {
        super(firstName, lastName);
    }

    /**
     * Constructor with all attributes.
     */
    public StudentInternational(String firstName, String lastName, String country, String period, LanguageLevel languageLevel) {
        this(firstName, lastName);
        this.country = country;
        this.period = period;
        this.languageLevel = languageLevel;
    }

    // Getters and setters with basic validation
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null || country.isEmpty()) {
            throw new IllegalArgumentException("Country cannot be null or empty.");
        }
        this.country = country;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        if (period == null || period.isEmpty()) {
            throw new IllegalArgumentException("Period cannot be null or empty.");
        }
        this.period = period;
    }

    public LanguageLevel getLanguageLevel() {
        return languageLevel;
    }

    public void setLanguageLevel(LanguageLevel languageLevel) {
        if (languageLevel == null ) {
            throw new IllegalArgumentException("Language level cannot be null or empty.");
        }
        this.languageLevel = languageLevel;
    }

    /**
     * Overrides toString to provide a detailed representation of the international student.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n")
                .append("StudentInternational Details:\n")
                .append("  - Country: ").append(country).append("\n")
                .append("  - Period: ").append(period).append("\n")
                .append("  - Language Level: ").append(languageLevel).append("\n");

        return sb.toString();
    }

    @Override
    public String greats() {
        return super.greats()+"I am "+ getCountry() + "and I am "+ getFullName() +" And my language is "+ getLanguageLevel();
    }

    @Override
    public double averageScores() {
        System.out.println("averageScores"+StudentInternational.class.getCanonicalName());
        double baseAverage = super.averageScores();
        if (languageLevel == null) {
            throw new IllegalStateException("Language level is not set.");
        }
     return  ((baseAverage + languageLevel.getLevel()) / 2);
    }
}
