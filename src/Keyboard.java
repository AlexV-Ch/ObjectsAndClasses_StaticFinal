public class Keyboard {
    private final KeyboardType keyboardType;
    private final KeyboardBacklight keyboardBacklight;
    private final int weight;

    public Keyboard(KeyboardType keyboardType, KeyboardBacklight keyboardBacklight, int weight) {
        this.keyboardType = keyboardType;
        this.keyboardBacklight = keyboardBacklight;
        this.weight = weight;
    }

    public KeyboardType getKeyboardType() {
        return keyboardType;
    }

    public KeyboardBacklight getKeyboardBacklight() {
        return keyboardBacklight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "keyboardType=" + keyboardType +
                ", keyboardBacklight=" + keyboardBacklight +
                ", weight=" + weight +
                '}';
    }
}
