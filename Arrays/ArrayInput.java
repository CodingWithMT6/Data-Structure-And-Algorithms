import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

        System.out.println("Let see how we can provide the input to array");

        // We will consider an example on how to store the student marks in an array

        // We will initialise a scanner class to get the input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students in class:");

        // We will get the number of students input from the user
        int numberOfStudents = scanner.nextInt();

        // studentMarks - array we will store the marks of each student
        int[] studentMarks = new int[numberOfStudents];

        // We will use a for loop to get the user value and store in array
        for (int i = 0; i < numberOfStudents; i++) {
            int mark = scanner.nextInt();
            studentMarks[i] = mark;
        }

        // Now we have stored student marks in studentMarks array
        // Now we will loop and display the student marks
        for (int i=0;i<numberOfStudents;i++){
            System.out.println("Mark of student "+ (i+1) +" : "+studentMarks[i]);
        }

    }
}
