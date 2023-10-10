package design.abstractfactory;

import design.model.Computer;
import design.model.Server;

public class ServerFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    /**
     * Constructor
     *
     * @param ram - Size of server RAM.
     * @param hdd - Capacity of server HDD.
     * @param cpu - Frequency of server CPU.
     */
    public ServerFactory(String ram,String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    /**
     * Creates and returns a `Server` object with the specified RAM, HDD, and CPU configurations.
     *
     * @return A `Server` object representing a server computer with the provided specifications.
     */
    @Override
    public Computer createComputer() {
        return new Server(ram, hdd, cpu);
    }
}