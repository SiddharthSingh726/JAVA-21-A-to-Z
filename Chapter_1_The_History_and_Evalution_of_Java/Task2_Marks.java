/*write your own program. Create Marks.java from scratch. Store three marks in three int variables: 
Maths 78, Science 85 and English 92. Calculate the total in a fourth variable. */
public class Task2_Marks {
    public static void main (String[] args){
        int Maths = 78;
        int Science = 85;
        int English = 92;
        int total = Maths + Science + English; // calculate the total in a fourth variable
        System.out.println("Maths: " + Maths + ", Science: " + Science + ", English: " + English); // Print the first line with three statements, one per subject.
        System.out.println("Total: " + total);
    }
}
