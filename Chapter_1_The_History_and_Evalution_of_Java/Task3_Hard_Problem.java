    class Task3{
    public void partA() {
        for (int i = 10; i > 0; i = i - 3) {
    System.out.println("i is " + i);
}
    System.out.println("--------------------------------------");
}
    public void partB() {
        for (int i = 0; i < 6; i++) {
    if (i == 2) {
        i = i + 2;
    }
    System.out.println("i is " + i);
}
}
}
public class Task3_Hard_Problem {
    public static void main(String [] args) {
    Task3 obj = new Task3();
    obj.partA();
    obj.partB();
    }
}
