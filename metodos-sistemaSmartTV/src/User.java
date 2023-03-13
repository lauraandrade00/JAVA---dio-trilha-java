public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.turnDownVolume();
        smartTv.turnDownVolume();
        smartTv.turnDownVolume();
        smartTv.turnUpVolume();
        
        System.out.println("Current channel : " + smartTv.channel);

        smartTv.changeChannel(13);
        System.out.println("Current channel : " + smartTv.channel);

        System.out.println("Current volume : " + smartTv.volume);

        System.out.println("Tv is on ?" + smartTv.on);
        System.out.println("Current volume : " + smartTv.volume);

        smartTv.turnOn();
        System.out.println("New status -> Tv is on ?" + smartTv.on);

        smartTv.turnOff();
        System.out.println("New status -> Tv is on ?" + smartTv.on);
    }
}
