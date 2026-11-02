/*write your own program. Create Marks.java from scratch. Store three marks in three int variables: 
Maths 78, Science 85 and English 92. Calculate the total in a fourth variable. */
public class Task2_Marks {
    public static void main (String[] args){
        int Maths = 78;
        int Science = 85;
        int English = 92;
        int total = Maths + Science + English; // calculate the total in a fourth variable
        System.out.print("Maths: " + Maths); // Print the first line, one per subject.
        System.out.print(" Science: " + Science); // Print the second line, one per subject.
        System.out.println(" English: " + English); // Print the third line, one per subject.
        System.out.println("Total: " + total); // print the total
        Maths = 90; // change the value of Maths to 90
        total = Maths + Science + English; // recalculate the total
        System.out.println("Total: " + total); // print the new total
    }
}
