package Workshop;

import java.util.*;

//Interface: Executable
interface Executable {
 void execute();
}

//Job 1: Data Sync Job
class DataSyncJob implements Executable {
 @Override
 public void execute() {
     System.out.println("[DataSyncJob] Synchronizing data with remote server...");
     // Simulated logic
     System.out.println("[DataSyncJob] Data sync complete.\n");
 }
}

//Job 2: Email Alert Job
class EmailAlertJob implements Executable {
 @Override
 public void execute() {
     System.out.println("[EmailAlertJob] Sending email alerts to users...");
     // Simulated logic
     System.out.println("[EmailAlertJob] Email alerts sent.\n");
 }
}

//Job 3: Cleanup Job
class CleanupJob implements Executable {
 @Override
 public void execute() {
     System.out.println("[CleanupJob] Cleaning up temporary files...");
     // Simulated logic
     System.out.println("[CleanupJob] Cleanup done.\n");
 }
}

//Job Queue Manager using LinkedList
class JobQueue {
 private LinkedList<Executable> jobs = new LinkedList<>();

 public void addJob(Executable job) {
     jobs.add(job);
     System.out.println("Job added to queue.");
 }

 public void runAllJobs() {
     System.out.println("\n=== Executing All Jobs ===");
     while (!jobs.isEmpty()) {
         Executable job = jobs.poll();  // Remove and get job
         job.execute();                 // Polymorphic call
     }
     System.out.println("All jobs executed.\n");
 }
}

//Main class with user-based input
public class Job_Execution_System {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     JobQueue queue = new JobQueue();

     while (true) {
         System.out.println("\n--- Job Execution System ---");
         System.out.println("1. Add Data Sync Job");
         System.out.println("2. Add Email Alert Job");
         System.out.println("3. Add Cleanup Job");
         System.out.println("4. Run All Jobs");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");

         int choice = sc.nextInt();

         switch (choice) {
             case 1 -> queue.addJob(new DataSyncJob());
             case 2 -> queue.addJob(new EmailAlertJob());
             case 3 -> queue.addJob(new CleanupJob());
             case 4 -> queue.runAllJobs();
             case 5 -> {
                 System.out.println("Exiting Job System.");
                 sc.close();
                 return;
             }
             default -> System.out.println("Invalid choice.");
         }
     }
 }
}
