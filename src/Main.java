public class Main {
    public static void main(String[] args) {
        Processor intel = new Processor(ProcessorManufacturer.Intel,"3200Mg", 16);
        Processor amd = new Processor(ProcessorManufacturer.AMD,"1200Mg", 8);
        Computer computer1 = new Computer();
        computer1.setProcessor(intel);

        Computer computer2 = new Computer();
        computer2.setProcessor(amd);

        System.out.println(computer1.toString());
    }
}
