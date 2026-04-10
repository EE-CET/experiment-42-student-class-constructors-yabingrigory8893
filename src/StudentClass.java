import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Name: " + name + " Roll: " + rollNo);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) return;
            String name1 = sc.nextLine();
            if (!sc.hasNextInt()) return;
            int roll1 = sc.nextInt();
            sc.nextLine(); // consume newline

            if (!sc.hasNextLine()) return;
            String name2 = sc.nextLine();
            if (!sc.hasNextInt()) return;
            int roll2 = sc.nextInt();

            Student s1 = new Student(name1, roll1);
            Student s2 = new Student(name2, roll2);

            s1.display();
            s2.display();
        }
    }
}
