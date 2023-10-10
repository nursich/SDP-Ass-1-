package design.abstractfactory;

/**
 * The `Computer` class is an abstract base class for different computer models in the Factory Design Pattern implementation.
 * It defines a basic computer structure with abstract methods to retrieve information about RAM, HDD, and CPU.
 */
public abstract class Computer {

    /**
     * Retrieves the RAM capacity.
     */
    public abstract String getRAM();

    /**
     * Retrieves the HDD specification of the computer.
     */
    public abstract String getHDD();

    /**
     * Retrieves the CPU specification of the computer.
     */
    public abstract String getCPU();

    /**
     * Overrides the `toString()` method to display the computer's specifications, including RAM, HDD, and CPU.
     */
    @Override
    public String toString(){
        return "RAM= "+this.getRAM()+
                ", HDD="+this.getHDD()+
                ", CPU="+this.getCPU();
    }
}
