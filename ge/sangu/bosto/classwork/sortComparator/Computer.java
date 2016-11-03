package ge.sangu.bosto.classwork.sortComparator;

/**
 * Created by 201 on 11/3/2016.
 */
public class Computer {
    private String operatingSystem;
    private double compNumber;
    private CompType processorType;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getCompNumber() {
        return compNumber;
    }

    public void setCompNumber(double compNumber) {
        this.compNumber = compNumber;
    }

    public CompType getProcessorType() {
        return processorType;
    }

    public void setProcessorType(CompType processorType) {
        this.processorType = processorType;
    }

    public Computer(String name, double compNumber, CompType processor) {
        this.operatingSystem = name;
        this.compNumber = compNumber;
        this.processorType = processor;
    }

    public String toString() {
        return "\n"  + operatingSystem + ", " + compNumber + ", " + processorType ;
    }

}
