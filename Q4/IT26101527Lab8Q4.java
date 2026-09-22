import java.util.Scanner;

public class IT26101527Lab8Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

        
        for (int i = 0; i < 8; i++) {

            int studentID;

            do {
                System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
                studentID = input.nextInt();

                if (studentID <= 0) {
                    System.out.println("Error: Please Enter ONLY Positive Numbers");
                }

            } while (studentID <= 0);

            studentsArray[i] = studentID;
        }

        
        System.out.println();

        
        System.out.print("Enter a Student ID to Search: ");
        int searchID = input.nextInt();

        boolean found = false;

        for (int i = 0; i < 8; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }

        
        System.out.println();

        // Display search result
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }

        input.close();
    }
}