public class Computer {
    private Processor processor;
    private Memory memory;
    private MemoryDevice memoryDevice;
    private Screen screen;
    private Keyboard keyboard;
    private final String  vendor;
    private final String  name;

    public Computer(String vendor, String name) {
        this.vendor = vendor;
        this.name = name;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public MemoryDevice getMemoryDevice() {
        return memoryDevice;
    }

    public void setMemoryDevice(MemoryDevice memoryDevice) {
        this.memoryDevice = memoryDevice;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public int allWeight() {
        return processor.getWeight() +
                memory.getWeight() +
                memoryDevice.getWeight() +
                screen.getWeight() +
                keyboard.getWeight();
    }

    public int allWeight1() {
        return getProcessor().getWeight() +
                getMemory().getWeight() +
                getMemoryDevice().getWeight() +
                getScreen().getWeight() +
                getKeyboard().getWeight();
    }


    @Override
    public String toString() {
        return "Компьютер - " + name + '\n' +
                "Производитель: " + vendor + '\n' +
                "Процессор: " + processor + '\n' +
                "Оперативная память: " + memory + '\n' +
                "Накопитель информации: " + memoryDevice + '\n' +
                "Экран: " + screen + '\n' +
                "Клавиатура: " + keyboard + '\n' +
                "Общий вес компьютера составляет " + allWeight() + " гр." + '\n' +
                "Общий вес компьютера составляет " + allWeight1() + " гр." + '\n';
    }
}

