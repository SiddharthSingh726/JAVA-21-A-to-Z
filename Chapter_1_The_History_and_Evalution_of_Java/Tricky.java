public class Tricky {
    public static void main(String[] args) {
        int coins = 11;

        if (coins > 10) {
            coins = coins + 5;
        }

        if (coins == 10)
            coins = coins * 2;
            coins = coins + 1;

        if (coins > 20) {
            System.out.println("Rich: " + coins);
        }

        if (coins < 21) {
            System.out.println("Not rich: " + coins);
        }
    }
}