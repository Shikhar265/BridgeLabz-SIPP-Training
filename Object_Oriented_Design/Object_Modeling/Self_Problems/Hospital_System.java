import java.util.*;

// Class representing a Patient
class Patient {
    String name;
    int age;

    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Patient: " + name + ", Age: " + age);
    }
}

// Class representing a Doctor
class Doctor {
    String name;
    String specialization;
    ArrayList<Patient> patients;

    Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Method to add a patient to the doctor's list
    void addPatient(Patient p) {
        patients.add(p);
    }

    // Method showing communication (consultation)
    void consult(Patient p) {
        System.out.println("Doctor " + name + " (Specialist in " + specialization + ") is consulting patient " + p.name);
    }

    void showPatients() {
        System.out.println("Doctor: " + name + " - Patients:");
        for (Patient p : patients) {
            System.out.println("- " + p.name);
        }
    }
}

// Class representing the Hospital
class Hospital {
    String hospitalName;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
    }

    void addPatient(Patient p) {
        patients.add(p);
    }

    void displayAll() {
        System.out.println("Hospital: " + hospitalName);
        for (Doctor d : doctors) {
            d.showPatients();
            System.out.println();
        }
    }
}

// Main class
public class Hospital_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital("CityCare Hospital");

        System.out.print("Enter number of doctors: ");
        int docCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < docCount; i++) {
            System.out.print("Enter doctor name: ");
            String dName = sc.nextLine();
            System.out.print("Enter specialization: ");
            String spec = sc.nextLine();
            Doctor doc = new Doctor(dName, spec);
            hospital.addDoctor(doc);
        }

        System.out.print("Enter number of patients: ");
        int patCount = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < patCount; i++) {
            System.out.print("Enter patient name: ");
            String pName = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();
            Patient pat = new Patient(pName, age);
            hospital.addPatient(pat);
        }

        // Assign consultations
        for (Doctor doc : hospital.doctors) {
            System.out.println("\nAssigning patients to Doctor " + doc.name);
            for (int i = 0; i < hospital.patients.size(); i++) {
                System.out.println((i + 1) + ". " + hospital.patients.get(i).name);
            }
            System.out.print("Enter patient numbers for consultation with Dr. " + doc.name + " (comma separated): ");
            String[] indices = sc.nextLine().split(",");
            for (String idx : indices) {
                int patIndex = Integer.parseInt(idx.trim()) - 1;
                Patient p = hospital.patients.get(patIndex);
                doc.addPatient(p);
                doc.consult(p);
            }
        }

        System.out.println("\n=== All Consultations in " + hospital.hospitalName + " ===");
        hospital.displayAll();
    }
}
