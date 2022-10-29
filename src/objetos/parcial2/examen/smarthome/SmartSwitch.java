package objetos.parcial2.examen.smarthome;

public class SmartSwitch extends Device{
    public SmartSwitch(String name){
        super(name);

    }

    @Override
    public void turnOn() {
        System.out.println(getName() +": " + "Encendiendo switch");
    }

    @Override
    public void turnOff() {
        System.out.println(getName() +": " + "Apagando switch");
    }

}
