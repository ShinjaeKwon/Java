public class PatternDot extends Dot {
    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "PatternDot{" +
                "loc=" + loc +
                ", size=" + size +
                ", pattern='" + pattern + '\'' +
                '}';
    }
}
