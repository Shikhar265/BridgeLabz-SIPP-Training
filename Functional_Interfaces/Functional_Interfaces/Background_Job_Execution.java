// Background_Job_Execution.java

public class Background_Job_Execution {
    public static void main(String[] args) {
        // 🔹 Define background task using lambda (Runnable)
        Runnable job = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Background job running... step " + i);
                try {
                    Thread.sleep(1000); // simulate time-consuming task
                } catch (InterruptedException e) {
                    System.out.println("Job interrupted!");
                }
            }
            System.out.println("✅ Background job completed!");
        };

        // 🔹 Start the background task in a separate thread
        Thread worker = new Thread(job);
        worker.start();

        // 🔹 Main thread continues other work
        System.out.println("➡️ Main program keeps running while job executes...");
    }
}
