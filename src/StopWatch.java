import java.util.Scanner;

public class StopWatch {
    public long startTimer = 0;
    public long stopTimer = 0;
    public long totalTime = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StopWatch sw = new StopWatch();

        System.out.println("Press 1 to Start the Stopwatch.");
        int x = sc.nextInt();
        if(x == 1){
            sw.startStopWatch();
        }else{
            System.out.println("Enter Valid Input.");
        }

        System.out.println("Press 0 to Start the Stopwatch.");
        int y = sc.nextInt();
        if(y == 0){
            sw.stopStopWatch();
        }else {
            System.out.println("Enter Valid Input.");
        }
        sw.totalTimeElapsed();
    }

    public void startStopWatch(){
        startTimer = System.nanoTime();
        System.out.println("Stopwatch Started...");
    }

    public void stopStopWatch(){
        stopTimer = System.nanoTime();
        System.out.println("Stopwatch Stopped...");
    }

    public void totalTimeElapsed(){
        totalTime = stopTimer - startTimer;
        System.out.println("Total Time Elapsed Is: "
                + totalTime / 3600000000000L +" Hrs "
                + totalTime/ 60000000000L + " Mins "
                + totalTime / 1000000000 + " Secs "
                + totalTime / 1000000000 + " Milli Secs.");
    }
}
