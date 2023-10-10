package design.abstractfactory;

import design.model.Computer;

public interface ComputerAbstractFactory {
    /**
     * Creates and returns a `Computer` object.
     *
     * @return A `Computer` object created by the factory.
     */
    Computer createComputer();
}