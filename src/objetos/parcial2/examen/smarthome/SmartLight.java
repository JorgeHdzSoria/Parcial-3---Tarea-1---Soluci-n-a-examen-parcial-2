package objetos.parcial2.examen.smarthome;

public class SmartLight extends Device {
    public SmartLight(String name){
        super(name);

    }

    @Override
    public void turnOn() {
        System.out.println(getName() +": " + "Encendiendo foco");
    }

    @Override
    public void turnOff() {
        System.out.println(getName() +": " + "Apagando foco");
    }
}
