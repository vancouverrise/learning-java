package Pack;

public abstract class Computer implements button{
    protected String PCName = "Core";
    protected String modelCpu;
    protected int performance;

    @Override
    public void turnOn() {
        System.out.println(PCName + "is working!");
    }

    @Override
    public void turnOff() {
        System.out.println(PCName + "It's shutting down :(");
    }
}

interface button{
    void turnOn();
    void turnOff();
}

