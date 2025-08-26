

import java.util.*;

// 🔹 Marker Interface
interface BackupMarker {
    // No methods → just a "tag"
}

// 🔹 Classes
class Employee implements BackupMarker {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee[ID=" + id + ", Name=" + name + "]";
    }
}

class Patient {
    String name;
    int recordNo;

    Patient(String name, int recordNo) {
        this.name = name;
        this.recordNo = recordNo;
    }

    @Override
    public String toString() {
        return "Patient[RecordNo=" + recordNo + ", Name=" + name + "]";
    }
}

// 🔹 Backup Utility
class BackupProcessor {
    public static void backup(Object obj) {
        if (obj instanceof BackupMarker) {
            System.out.println("✅ Backing up: " + obj);
        } else {
            System.out.println("❌ " + obj + " is NOT eligible for backup.");
        }
    }
}

// 🔹 Main Class
public class Data_Backup_System {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101);
        Patient pat1 = new Patient("Bob", 201);

        System.out.println("=== Backup Processing ===");
        BackupProcessor.backup(emp1);  // ✅ Allowed
        BackupProcessor.backup(pat1);  // ❌ Rejected
    }
}
