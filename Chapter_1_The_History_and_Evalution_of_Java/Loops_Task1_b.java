public class Loops_Task1_b {
    public static void main (String [] args) {
        int total = 0;

        for(int i = 5; i >= 0; i--) {
            total = total + i;
            System.out.println("i is " + i + ", total is " + total);
        }
    }
}
