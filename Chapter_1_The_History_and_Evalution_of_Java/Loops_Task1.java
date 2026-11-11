public class Loops_Task1 {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            total = total + i;
            System.out.println("i is " + i + ", total is " + total);
        }

        System.out.println("Done. Total: " + total);
    }
}