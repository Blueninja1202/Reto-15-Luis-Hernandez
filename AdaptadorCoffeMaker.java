public class AdaptadorCoffeMaker implements Connectable{

    CoffeMaker coffemaker = new CoffeMaker();

    @Override
    public void turnOn(){
        coffemaker.on();
    }
    @Override
    public void turnOff(){
        coffemaker.off();
    }
    @Override
    public boolean isOn(){
        return !coffemaker.isoff();
    }
}
