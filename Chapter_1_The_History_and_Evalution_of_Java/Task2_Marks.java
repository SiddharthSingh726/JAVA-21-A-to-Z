/*write your own program. Create Marks.java from scratch. Store three marks in three int variables: 
Maths 78, Science 85 and English 92. Calculate the total in a fourth variable. */
public class Task2_Marks {
    public static void main (String[] args){
        int maths = 78;
        int science = 85;
        int english = 92;
        int total = maths + science + english; // calculate the total in a fourth variable
        System.out.print("Maths: " + maths); // Print the first line, one per subject.
        System.out.print(" Science: " + science); // Print the second line, one per subject.
        System.out.println(" English: " + english); // Print the third line, one per subject.
        System.out.println("Total: " + total); // print the total
        maths = 90; // change the value of Maths to 90
        total = maths + science + english; // recalculate the total
        System.out.println("Total: " + total); // print the new total
    }
}
