import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        System.out.println("Welcome to Array Basics");

        // Manual initialising values to the array
        // This should be used in the case where when the values are default or when the values are known at the beginning itself
        // Ex. We know that there are only 4 grades, so we can declare directly
        int[] grades = {'A', 'B', 'C', 'D'};
        System.out.println("Size of the grades array - " + grades.length);

        // Initialising with new keyword
        // This should be used in the case where we know the number of values but not sure about the value
        // Ex. We know that 50 students are there but not sure about their marks
        int[] marks = new int[50];
        System.out.println("Size of the grades array - " + marks.length);

        // Dynamic Initialization
        // This should be used in the case where we are not sure about the number of values and the value
        // Ex. When different section of the same class has different number of students, so based on that section
        // we will provide the input of number of students
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students in class:");
        int numberOfStudent = scanner.nextInt();
        int[] studentMarks = new int[numberOfStudent];
        System.out.println("Size of the dynamic grades array - " + studentMarks.length);
    }
}