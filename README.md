# Factory Design Pattern in Java

## Project Outline
This Java project is dedicated to testing and demonstrating the Factory Design Pattern, a creational design pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. In this project, we'll explore its application in the context of computer manufacturing.

## Project Structure
The project structure is organized as follows:


src<br>
├── design<br>
│&nbsp;&nbsp;&nbsp;&nbsp;├── abstractfactory<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── Computer.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── ComputerAbstractFactory.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── ComputerFactory.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;├── PCFactory.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;└── ServerFactory.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;├── factory<br>
│&nbsp;&nbsp;&nbsp;&nbsp;│&nbsp;&nbsp;&nbsp;&nbsp;└── ComputerFactory.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;└── model<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── Computer.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── PC.java<br>
│&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── Server.java<br>
└──── test<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;├── TestDesignPatterns.java<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;└── TestFactory.java<br>



## How the Factory Design Pattern is Used
In this project, the Factory Design Pattern is applied to create different types of computers, including PCs and Servers. The pattern provides an abstract factory interface (ComputerAbstractFactory) and concrete factory implementations (PCFactory and ServerFactory) to produce instances of these computers. The ComputerFactory class is responsible for creating the computer objects.

## Project Files

### design/abstractfactory/Computer.java

#### Class Description
- This class, `Computer`, is the abstract base class for different computer models in the Factory Design Pattern implementation.
- It defines a basic computer structure with abstract methods to retrieve information about RAM, HDD, and CPU.
- Additionally, it provides a `toString()` method to display the computer's specifications.

#### Methods
- `public abstract String getRAM()`: An abstract method to get the RAM specification of the computer.
- `public abstract String getHDD()`: An abstract method to get the HDD specification of the computer.
- `public abstract String getCPU()`: An abstract method to get the CPU specification of the computer.
- `@Override public String toString()`: Overrides the `toString()` method to return a string representation of the computer's specifications, including RAM, HDD, and CPU.

### design/abstractfactory/ComputerAbstractFactory.java

#### Interface Description
- The `ComputerAbstractFactory` interface is a part of the Factory Design Pattern implementation in this project.
- It defines a contract for creating instances of `Computer` objects.
- The purpose of this interface is to allow concrete factories to produce computer objects with specific configurations while adhering to a common factory pattern.

#### Methods
- `Computer createComputer()`: This method is responsible for creating and returning a `Computer` object. Concrete classes implementing this interface will provide their own implementation of this method, producing different types of computers, such as PCs or Servers.

### design/abstractfactory/ComputerFactory.java

#### Class Description
- The `ComputerFactory` class is a key component in the Factory Design Pattern implementation of this project.
- It acts as a client and provides a method for creating `Computer` objects through the use of a `ComputerAbstractFactory`.
- This class promotes the decoupling of the client code from the specific details of creating different computer models.

#### Methods
- `public static Computer getComputer(ComputerAbstractFactory factory)`: This static method takes a `ComputerAbstractFactory` as a parameter and uses it to create a `Computer` object. It delegates the creation of the computer to the provided factory, adhering to the Factory Design Pattern.

### design/abstractfactory/PCFactory.java

#### Class Description
- The `PCFactory` class is a concrete factory implementation of the `ComputerAbstractFactory` interface.
- It is responsible for creating instances of the `PC` class, which is a specific computer model.

#### Constructor
- `public PCFactory(String ram, String hdd, String cpu)`: This constructor takes the specifications for RAM, HDD, and CPU as parameters and initializes the instance variables within the factory.

#### Methods
- `@Override public Computer createComputer()`: This method overrides the `createComputer()` method defined in the `ComputerAbstractFactory` interface. It creates and returns a new `PC` object with the specifications provided during construction.

### design/abstractfactory/ServerFactory.java

#### Class Description
- The `ServerFactory` class is another concrete factory implementation of the `ComputerAbstractFactory` interface.
- It is responsible for creating instances of the `Server` class, a specific computer model tailored for server environments.

#### Constructor
- `public ServerFactory(String ram, String hdd, String cpu)`: This constructor takes the specifications for RAM, HDD, and CPU as parameters and initializes the instance variables within the factory.

#### Methods
- `@Override public Computer createComputer()`: This method overrides the `createComputer()` method defined in the `ComputerAbstractFactory` interface. It creates and returns a new `Server` object with the specifications provided during construction.

### design/factory/ComputerFactory.java

#### Class Description
- The `ComputerFactory` class is another component in the Factory Design Pattern implementation of this project.
- It provides a static method for creating instances of specific `Computer` models, such as `PC` and `Server`, based on the given type and specifications.

#### Methods
- `public static Computer getComputer(String type, String ram, String hdd, String cpu)`: This static method is responsible for creating and returning a `Computer` object. It takes a `type` parameter to determine the specific type of computer to create (e.g., "PC" or "Server") and also accepts specifications for RAM, HDD, and CPU. Based on the `type`, it creates and returns an instance of the corresponding computer model.

### design/model/Computer.java

#### Class Description
- The `Computer` class represents an abstract base class for all computer models in the project.
- It defines the common structure for computer models, with abstract methods to retrieve information about RAM, HDD, and CPU specifications.

#### Methods
- `public abstract String getRAM()`: An abstract method to get the RAM specification of the computer.
- `public abstract String getHDD()`: An abstract method to get the HDD specification of the computer.
- `public abstract String getCPU()`: An abstract method to get the CPU specification of the computer.
- `@Override public String toString()`: Overrides the `toString()` method to return a string representation of the computer's specifications, including RAM, HDD, and CPU.

### design/model/PC.java

#### Class Description
- The `PC` class is a concrete implementation of the `Computer` abstract class, representing a specific computer model, a personal computer.
- It provides information about the PC's RAM, HDD, and CPU specifications.

#### Constructor
- `public PC(String ram, String hdd, String cpu)`: This constructor initializes the PC's specifications, including RAM size, HDD capacity, and CPU frequency.

#### Methods
- `@Override public String getRAM()`: Overrides the `getRAM()` method from the abstract `Computer` class to provide the RAM specification of the PC.
- `@Override public String getHDD()`: Overrides the `getHDD()` method to provide information about the HDD capacity of the PC.
- `@Override public String getCPU()`: Overrides the `getCPU()` method to return the CPU frequency of the PC.
- `@Override public String toString()`: Overrides the `toString()` method to display the PC's specifications, including RAM, HDD, and CPU.

### design/model/Server.java

#### Class Description
- The `Server` class is another concrete implementation of the `Computer` abstract class, representing a specific computer model, a server.
- It provides information about the server's RAM, HDD, and CPU specifications.

#### Constructor
- `public Server(String ram, String hdd, String cpu)`: This constructor initializes the server's specifications, including RAM size, HDD capacity, and CPU frequency.

#### Methods
- `@Override public String getRAM()`: Overrides the `getRAM()` method from the abstract `Computer` class to provide the RAM specification of the server.
- `@Override public String getHDD()`: Overrides the `getHDD()` method to provide information about the HDD capacity of the server.
- `@Override public String getCPU()`: Overrides the `getCPU()` method to return the CPU frequency of the server.
- `@Override public String toString()`: Overrides the `toString()` method to display the server's specifications, including RAM, HDD, and CPU.

### design/test/TestDesignPatterns.java

#### Class Description
- The `TestDesignPatterns` class serves as the main entry point for testing the Factory Design Pattern and Abstract Factory Pattern in this project.
- It includes a `main` method that invokes the `testAbstractFactory` method to demonstrate the creation of different computer models using the Abstract Factory pattern.

#### Methods
- `public static void main(String[] args)`: The main method that is called when the program is executed. It invokes the `testAbstractFactory` method.

- `private static void testAbstractFactory()`: A private method dedicated to demonstrating the Abstract Factory pattern. It creates instances of `PC` and `Server` models using the `ComputerFactory` class and specific factory implementations.

### design/test/TestFactory.java

#### Class Description
- The `TestFactory` class serves as the main entry point for testing the Factory Design Pattern in this project.
- It includes a `main` method that demonstrates the creation of different computer models using the Factory Method pattern.

#### Methods
- `public static void main(String[] args)`: The main method that is called when the program is executed. It creates instances of `PC` and `Server` models using the `ComputerFactory` class and the specified type and specifications.
  The `TestDesignPatterns` and `TestFactory` classes showcase the usage of the Abstract Factory pattern and Factory Method pattern, respectively, by creating specific computer models with varying specifications and printing the configurations of the created objects.



---

For more details on the project and specific information about each Java file, please refer to the respective file's documentation.
