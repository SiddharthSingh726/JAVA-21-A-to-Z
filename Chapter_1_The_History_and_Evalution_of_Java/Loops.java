public class Loops {
    public static void main(String[] args) {
        int total = 0;

        for (int i = 0; i < 0; i++) 
            total = total + i;
            System.out.println("i is " + i + ", total is " + total);
        
    
        System.out.println("Done. Total: " + total);
    }
}