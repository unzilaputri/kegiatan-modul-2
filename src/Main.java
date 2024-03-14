import java.util.Scanner;

public class LibrarySystem {
    private static Scanner scan = new Scanner(System.in);
    private static boolean MahasiswaLogin = false;
    private static boolean AdminLogin = false;
    private static final String studentNIM[] = {"202310370311129"};

    public static void main(String[] args) {
        while (true) {
            System.out.println("===== Library System =====");
            System.out.println("1. Login as Student");
            System.out.println("2. Login as Admin");
            System.out.println("3. Exit");

            System.out.print("Choose option (1-3): ");
            int choice = scan.nextInt();

            if (choice == 1) {
                Student student = new Student();
                student.menuStudent();
            } else if (choice == 2) {
                Admin admin = new Admin();
                admin.menuAdmin();
            } else if (choice == 3) {
                System.out.println("adios");
                break;
            } else {
                System.out.println("Invalid option. Please choose again.");
            }

            System.out.println();
        }

        scan.close();
    }
}

class Student {
    private static Scanner scan = new Scanner(System.in);

    void displayBooks() {
        // Implement displayBooks method here
        System.out.println("Displaying available books...");
    }

    void logout() {
        // Implement logout method here
        System.out.println("Logging out...");
    }

    void menuStudent() {
        displayBooks(); // Show available books
        logout(); // Option to logout
    }
}

class Admin {
    private static Scanner scan = new Scanner(System.in);

    void addStudent() {
        // Implement addStudent method here
        System.out.println("Adding a new student...");
    }

    void displayStudent() {
        // Implement displayStudent method here
        System.out.println("Displaying list of students...");
    }

    void menuAdmin() {
        // Implement menuAdmin method here
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        int choice = scan.nextInt();
        if (choice == 1) {
            addStudent();
        } else if (choice == 2) {
            displayStudent();
        } else {
            System.out.println("Invalid option. Please choose again.");
        }
    }
}