public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void changeChannel(int newChannel){
        channel = newChannel;
    }
    public void changeUpChannel(){
        channel++;
    }

    public void changeDownChannel(){
        channel--;
    }

    public void turnUpVolume(){
        volume++;
    }
    
    public void turnDownVolume(){
        volume--;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }
}
