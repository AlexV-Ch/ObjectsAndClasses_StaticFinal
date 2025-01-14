public class Main {
    public static void main(String[] args) {
    Processor intel3 = new Processor(ProcessorManufacturer.Intel, "2500Mhz", 2, 10);
    Processor intel5 = new Processor(ProcessorManufacturer.Intel, "3500Mhz", 4, 10);
    Processor amd = new Processor(ProcessorManufacturer.AMD, "3000Mhz", 2, 15);
    Memory ddr_1 = new Memory(MemoryType.DDR4, "8Gb", 12);
    MemoryDevice ssd_1 = new MemoryDevice(MemoryDeviceType.SDD, "512Gb", 30);
    Screen acer1 = new Screen(24, ScreenType.IPS, 1500);
    Keyboard key1 = new Keyboard(KeyboardType.Membrane, KeyboardBacklight.YES, 300);

    Computer computer1 = new Computer("Локалов", "Эконом");
    computer1.setProcessor(intel3);
    computer1.setMemory(ddr_1);
    computer1.setMemoryDevice(ssd_1);
    computer1.setScreen(acer1);
    computer1.setKeyboard(key1);
        System.out.println(computer1.toString());
    computer1.setProcessor(intel5);
        System.out.println(computer1.toString());


        //Processor intel = new Processor(ProcessorManufacturer.Intel,"3200Mg", 16);
        //Processor amd = new Processor(ProcessorManufacturer.AMD,"1200Mg", 8);
        //Computer computer1 = new Computer();
        //computer1.setProcessor(intel);
        //Computer computer2 = new Computer();
        //computer2.setProcessor(amd);

    }
}
