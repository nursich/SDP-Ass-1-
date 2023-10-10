package design.model;

public class Server extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    /**
     * Constructor to initialize Server specifications.
     * @param ram - size of server RAM
     * @param hdd - capacity of server HDD
     * @param cpu - frequency of server CPU
     */
    public Server(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    // Overrides the abstract methods to provide Server specifications
    @Override
    public String getRAM() { return this.ram; }
    @Override
    public String getHDD() { return this.hdd; }
    @Override
    public String getCPU() { return this.cpu; }
}