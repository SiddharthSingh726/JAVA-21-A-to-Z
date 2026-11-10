public class Dilivery {
    public static void main (String [] args) {
        int bill = 600;

        int dilevery;
        if (bill > 500) {
            dilevery = 0;
        } else {
            dilevery = 40;
        }
        System.out.println("Bill: "+bill+", Dilivery: "+dilevery+", Total: "+(bill+dilevery));
    }
}
