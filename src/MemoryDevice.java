import ENUM.MemoryDeviceType;

public class MemoryDevice {
    private final MemoryDeviceType type;
    private final String volume;
    private final int weight;

    public MemoryDevice(MemoryDeviceType type, String volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public MemoryDeviceType getType() {
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
        return "тип - " + type +
                ", объем - " + volume +
                ", вес - " + weight;
    }
}
