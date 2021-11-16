import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

    System.out.print("This program will take numerical grade and letter\n");
    double grade;
    Scanner myScanner = new Scanner(System.in);
    grade = myScanner.nextDouble();
    System.out.println(grade);

    if (grade >= 89.5) {
        System.out.println("That grade is A.\n");
    }
    else if (grade >= 79.5) {
        System.out.println("That grade is B\n");
    }
    else if (grade >= 69.5) {
        System.out.println("That grade is C\n");
    }
    else if (grade >= 59.5) {
        System.out.println("That grade is an D\n");
    }
    else{
        System.out.println("That grade is an F\n");
    }


    }
}