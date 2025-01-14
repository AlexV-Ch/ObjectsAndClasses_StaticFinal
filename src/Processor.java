public class Processor {
    private final ProcessorManufacturer type;
    private final String megaHz;
    private final int cores;
    private final int weight;

    public Processor(ProcessorManufacturer type, String megaHz, int cores, int weight) {
        this.type = type;
        this.megaHz = megaHz;
        this.cores = cores;
        this.weight = weight;
    }

    public ProcessorManufacturer getType() {
        return type;
    }

    public String getMegaHz() {
        return megaHz;
    }

    public int getCores() {
        return cores;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "type=" + type +
                ", megaHz='" + megaHz +
                ", cores=" + cores +
                ", weight=" + weight +
                '}';
    }
}

