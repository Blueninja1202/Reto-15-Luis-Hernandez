public class Computer implements Connectable {
    
    private boolean isOn;

    @Override
    public void turnOn(){
        isOn = true;
        System.out.println("Computadora Prendida");
    }
    @Override
    public void turnOff(){
        isOn = false;
        System.out.println("Computadora Apagada");
    }
    @Override
    public boolean isOn(){
        return isOn;
    }

}