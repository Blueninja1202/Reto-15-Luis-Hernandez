public class Lamp implements Connectable {
    
    private boolean isOn;

    @Override
    public void turnOn(){
        isOn = true;
        System.out.println("Lampara Prendida");
    }
    @Override
    public void turnOff(){
        isOn = false;
        System.out.println("Lampara Apagada");
    }
    @Override
    public boolean isOn(){
        return isOn;
    }

}
