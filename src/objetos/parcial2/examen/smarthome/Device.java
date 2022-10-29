package objetos.parcial2.examen.smarthome;

public abstract class Device {
    private String name;

    protected Device(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}
