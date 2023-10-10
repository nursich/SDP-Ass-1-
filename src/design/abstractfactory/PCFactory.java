package design.abstractfactory;

import design.model.Computer;
import design.model.PC;

public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;

    /**
     * Constructor
     *
     * @param ram - Size of PC RAM.
     * @param hdd - Capacity of PC HDD.
     * @param cpu - Frequency of PC CPU.
     */
    public PCFactory(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    /**
     * Creates and returns a `PC` object with the specified RAM, HDD, and CPU configurations.
     *
     * @return A `PC` object representing a personal computer with the provided specifications.
     */
    @Override
    public Computer createComputer() {
        return new PC(ram, hdd, cpu);
    }
}