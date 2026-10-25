public class Basket {
    public static void main(String[] args) {
        int apples;                  // make a box named apples
        apples = 5;                  // put 5 in the box
        System.out.println("Apples: " + apples);

        apples = apples + 3;
        System.out.println("Apples: " + apples);

        int oranges = apples;        // make a second box
        apples = 0;
        System.out.print("Apples: " + apples);
        System.out.println(", Oranges: " + oranges);
    }
}