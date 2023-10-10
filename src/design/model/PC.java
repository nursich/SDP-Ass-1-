package design.model;

public class PC extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    /**
     * Constructor to initialize PC specifications.
     * @param ram - size of PC RAM
     * @param hdd - capacity of PC HDD
     * @param cpu - frequency of PC CPU
     */
    public PC(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Overrides the abstract methods to provide PC specifications
    @Override
    public String getRAM() { return this.ram; }
    @Override
    public String getHDD() { return this.hdd; }
    @Override
    public String getCPU() { return this.cpu; }
}