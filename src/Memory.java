public class Memory {
    private final MemoryType type;
    private final String volume;
    private final int weight;

    public Memory(MemoryType type, String volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public MemoryType getType() {
        return type;
    }

    public String getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Memory{" +
                "type=" + type +
                ", volume='" + volume + '\'' +
                ", weight=" + weight +
                '}';
    }
}
