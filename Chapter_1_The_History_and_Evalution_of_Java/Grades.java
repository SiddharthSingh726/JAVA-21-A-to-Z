public class Grades {
    public static void main(String[] args) {
        int marks = 75;

        if (marks > 50) {
            System.out.println("Passed");
        }

        if (marks > 90) {
            System.out.println("Grade A");
        }

        marks = marks + 20;

        if (marks > 90) {
            System.out.println("Grade A now");
        }

        if (marks == 95) {
            System.out.println("Exactly " + marks);
        }
    }
}