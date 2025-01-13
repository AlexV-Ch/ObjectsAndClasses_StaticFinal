public class Computer {
    private Processor processor;



    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "Computer : \n" +
                 processor.toString() +
                "\n" +
                "  ";
    }
}
