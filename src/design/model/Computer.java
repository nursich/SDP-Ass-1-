package design.model;

public abstract class Computer {

    // Abstract methods for retrieving specifications
    public abstract String getRAM();
    public abstract String getHDD();
    public abstract String getCPU();

    // Overrides the toString() method to display computer specifications
    @Override
    public String toString(){
        return "RAM= " + this.getRAM() +
                ", HDD=" + this.getHDD() +
                ", CPU=" + this.getCPU();
    }
}