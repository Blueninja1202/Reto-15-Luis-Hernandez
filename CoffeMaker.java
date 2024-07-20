
public class CoffeMaker {

    private boolean isoff;

    public void on(){
        isoff = false;
        System.out.println("Prendiendo Cafetera");
    }

    public void off(){
        isoff = true;
        System.out.println("Apagando Cafetera");
    }

    public boolean isoff(){
        return isoff;
    }


};



