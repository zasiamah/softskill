package homework;

import java.util.Scanner;

public class softskills1 {
    public static void main(String[] args) {
        // non functional


        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a floor number between 1 and 4");
        int number = scanner.nextInt();

        switch (number) {

            case 1:
                System.out.println("you are on the first floor ");
                break;
            case 2:
                System.out.println("you are on the second floor");
                break;
            case 3:
                System.out.println("you are on the third floor");
                break;
            case 4:
                System.out.println("you are on the furth floor ");
                break;


        }
    }
}
