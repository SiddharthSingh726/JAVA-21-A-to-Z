public class Dilivery {
    public static void main (String [] args) {
        int bill = 450;

        int dilivery;
        if (bill > 500) {
            dilivery = 0;
        } else {
            dilivery = 40;
        }
        System.out.println("Bill: "+bill+", Dilivery: "+dilivery+", Total: "+(bill+dilivery));
    }
}
