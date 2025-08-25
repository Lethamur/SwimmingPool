public class main {
    public static void main(String[] args) {

        int volume = 1200; //litres
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute
        int currentVolume = 0; //litres
        int sec = 0;


        while(currentVolume < volume) {
            currentVolume = currentVolume + fillingSpeed - devastationSpeed;
            sec = sec + 1;
            System.out.println(sec);
        }
    }
}
