package ec.OOP.inheritance;

public enum LanguageLevel {
    VERY_POOR(1),
    POOR(2),
    AVERAGE(3),
    GOOD(4),
    EXCELLENT(5);

    private final int level;

    LanguageLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
