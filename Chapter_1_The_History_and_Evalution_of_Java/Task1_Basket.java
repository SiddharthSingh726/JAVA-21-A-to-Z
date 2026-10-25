// Task 1: change the program. Make the Total line print Total: 8. Find two different ways to do it.
public class Task1_Basket {
    public static void main (String[] args) {
        int apples;                  // make a box named apples
        apples = 5;                  // put 5 in the box
        apples = apples + 3;
        System.out.println("Total: " + apples);
        int oranges = apples;        // make a second box
        System.out.println("Total: " + oranges);
    }
    
}
