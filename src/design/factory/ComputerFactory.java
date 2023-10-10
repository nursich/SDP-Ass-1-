package design.factory;

import design.model.Computer;
import design.model.PC;
import design.model.Server;

public class ComputerFactory {

    /**
     * Creates and returns a `Computer` object based on the specified type and specifications.
     *
     * @param type The type of computer to create, e.g., "PC" or "Server".
     * @param ram  The RAM specification for the computer.
     * @param hdd  The HDD specification for the computer.
     * @param cpu  The CPU specification for the computer.
     * @return A `Computer` object created with the specified type and specifications.
     */
    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}