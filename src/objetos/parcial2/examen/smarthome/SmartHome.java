package objetos.parcial2.examen.smarthome;

import java.util.LinkedList;
import java.util.List;

class DeviceWithCommand{
    Device device;
    String voiceCommand;
    String standardCommand;

    public DeviceWithCommand(Device device, String voiceCommand, String standardCommand) {
        this.device = device;
        this.voiceCommand = voiceCommand;
        this.standardCommand = standardCommand;
    }
}



public class SmartHome {

    private List<Device> devices = new LinkedList<>();
    private List<DeviceWithCommand> deviceWithCommands = new LinkedList<>();

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void configure(String deviceName, String voiceCommand, String standardCommand) {
        Device device = findDeviceByName(deviceName);
        if (device != null) {
            DeviceWithCommand deviceWithCommand = new DeviceWithCommand(device, voiceCommand, standardCommand);
            deviceWithCommands.add(deviceWithCommand);
        }
    }

    private Device findDeviceByName(String deviceName) {
        for (Device device : devices)
            if (device.getName().equals(deviceName))
                return device;

        return null;
    }

    public void processCommand(String command) {
        DeviceWithCommand device = findDeviceByVoiceCommand(command);

        if(device == null)
            System.out.println("Lo siento no reconozco el comando");
        else
            if (device.standardCommand.equals("turnOn"))
                device.device.turnOn();
            else
                device.device.turnOff();

    }

    private DeviceWithCommand findDeviceByVoiceCommand(String voiceCommand) {
        for (DeviceWithCommand deviceWithCommand : deviceWithCommands) {
            if (deviceWithCommand.voiceCommand.equals(voiceCommand))
                return deviceWithCommand;
        }
        return null;
    }
}
