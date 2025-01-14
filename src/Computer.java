public class Computer {
    private Processor processor;
    private Memory memory;
    private MemoryDevice memoryDevice;
    private Screen screen;
    private Keyboard keyboard;

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

    @Override
    public String toString() {
        return "Computer" + '\n' +
                "processor   = " + processor + '\n' +
                "memory      = " + memory + '\n' +
                "memoryDevice= " + memoryDevice + '\n' +
                "screen      = " + screen + '\n' +
                "keyboard    = " + keyboard + '\n';
    }
}

