public class TurnOnDevice {
    public static void main(String[] args){

        turnondevice(new Lamp());
        turnondevice(new Computer());
        turnondevice(new AdaptadorCoffeMaker());

    }
    private static void turnondevice(Connectable device){

        device.turnOn();
        System.out.println(device.isOn());

    }
}