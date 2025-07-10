import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Chapter12 {
    // Chapter 11: Chronometer
    public static void run() {
        Console.info("=== Chapter 12: Enhanced Chronometer ===");

        // Configuration parameters
        Random random = new Random();
        final int startTime = random.nextInt(30) + 1; // Random start time between 1 and 30 seconds
        final int warningThreshold = 5;
        final int initialDelay = 3000;
        final int tickInterval = 1000;

        Timer chrono = new Timer();
        chrono.schedule(new TimerTask() {
            int time = startTime;
            boolean warningShown = false;

            @Override
            public void run() {
                if (time > 0) {
                    // Format time as mm:ss
                    String formattedTime = String.format("%02d:%02d", time / 60, time % 60);
                    Console.info("Time remaining: " + formattedTime);

                    // Show warning when we reach threshold
                    if (time <= warningThreshold && !warningShown) {
                        Console.warn("Only " + time + " seconds left!");
                        warningShown = true;
                    }

                    time--;
                } else {
                    Console.success("Chronometer finished!");
                    chrono.cancel();
                }
            }
        }, initialDelay, tickInterval);

        Console.info("Chronometer started! It will tick every second after " +
                (initialDelay / 1000) + " seconds.");
    }
}
