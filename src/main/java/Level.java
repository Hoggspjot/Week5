public enum Level {
    low(1),
    middle(2),
    high(3),
    critical(4);

    private int level;

    Level(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

}
