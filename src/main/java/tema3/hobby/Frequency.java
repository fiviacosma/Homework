package tema3.hobby;

public enum Frequency {
    ONCE(1),
    TWICE(2),
    THREE_TIMES(3),
    FOUR_TIMES(4),
    FIVE_TIMES(5);

    private final int frequencyValue;

    Frequency(int frequencyValue) {
        this.frequencyValue = frequencyValue;

    }

    public int getFrequencyValue() {
        return frequencyValue;

    }
}
