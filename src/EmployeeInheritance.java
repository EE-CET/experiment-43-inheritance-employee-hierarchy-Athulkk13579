import java.util.Scanner;

class Employee {
    String name;
    int age;
    long phoneNumber;
    String address;
    double salary;

    void printSalary() {
        System.out.println(salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- Input for Officer ---
        Officer officer = new Officer();
        officer.name = scanner.nextLine();
        officer.age = scanner.nextInt();
        officer.phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Consume newline left by nextLong
        officer.address = scanner.nextLine();
        officer.salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left by nextDouble
        officer.specialization = scanner.nextLine();

        // --- Input for Manager ---
        Manager manager = new Manager();
        manager.name = scanner.nextLine();
        manager.age = scanner.nextInt();
        manager.phoneNumber = scanner.nextLong();
        scanner.nextLine(); // Consume newline left by nextLong
        manager.address = scanner.nextLine();
        manager.salary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline left by nextDouble
        manager.department = scanner.nextLine();

        // --- Output ---
        System.out.println("Officer:");
        System.out.println(officer.name);
        System.out.println(officer.age);
        System.out.println(officer.phoneNumber);
        System.out.println(officer.address);
        System.out.printf("%.0f%n", officer.salary); // formatted to match integer-like look in example if needed, or just println
        System.out.println(officer.specialization);

        System.out.println("Manager:");
        System.out.println(manager.name);
        System.out.println(manager.age);
        System.out.println(manager.phoneNumber);
        System.out.println(manager.address);
        System.out.printf("%.0f%n", manager.salary);
        System.out.println(manager.department);
        
        scanner.close();
    }
}
