public class Main {
    public static void main(String[] args) {
        Clock brlClock = new BRLClock();
        brlClock.setHour(13);
        brlClock.setMinute(0);
        brlClock.setSecond(0);

        System.out.println("Hora BRL original: " + brlClock.getTime());

        USClock usClock = new USClock(1, 0, 0, "PM");

        Clock brlConverted = brlClock.convert(usClock);
        System.out.println("Convertido de US para BRL: " + brlConverted.getTime());

        Clock usConverted = usClock.convert(brlClock);
        System.out.println("Convertido de BRL para US: " + usConverted.getTime());
    }
}
