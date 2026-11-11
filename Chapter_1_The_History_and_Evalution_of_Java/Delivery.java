public class Delivery {
    public static void main (String [] args) {
        int bill = 450;

        int delivery;
        if (bill > 500) {
            delivery = 0;
        } else {
            delivery = 40;
        }
        System.out.println("Bill: "+bill+", Delivery: "+delivery+", Total: "+(bill+delivery));
    }
}
