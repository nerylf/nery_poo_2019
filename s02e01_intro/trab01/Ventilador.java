package trab01;

class Ventilador {
    boolean isOn;
    int speed;
    boolean isSpin;

    void showStatus(){
        System.out.println("on: " + isOn + 
                           ", speed: " + speed +
                           ", spinning: " + isSpin);
    }

    void powerOn(){
        if(isOn){
            System.out.println("Ja esta ligado!!");
        }

        System.out.println("LIGADNO!!!");
        isOn = true;
    }

    void powerOff(){
        if(!isOn){
            System.out.println("Ja esta desligado!!");
        }
        System.out.println("DESLIGANDO!!!");
        isOn = false;
    }

    void spin(){

    }

    void stopSpin(){

    }

    void speedUp(){

    }

    void speedDown(){

    }
}