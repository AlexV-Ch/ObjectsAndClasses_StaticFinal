public class Processor {
    private final String megagerc;
    private final Integer count;
    private final ProcessorManufacturer type;

    public Processor(ProcessorManufacturer type ,String megagerc, Integer count) {
        this.type = type;
        this.megagerc = megagerc;
        this.count = count;
    }

    public ProcessorManufacturer getType() {
        return type;
    }

    public String getMegagerc() {
        return megagerc;
    }

    public Integer getCount() {
        return count;
    }



    @Override
    public String toString() {
        return "Processor: " +
                " тип   = " + type + "," +
                " megagerc = " + megagerc + "," +
                " count = " + count;
    }

}
