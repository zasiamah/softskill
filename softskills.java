package homework;

import java.util.Scanner;

public class softskills {
    public static void main(String[] args) {

        // functional


        Scanner age = new Scanner(System.in);
        System.out.println("are you old enough to ride an elevator by yourself?");
        String age1 = age.nextLine();

        String age2 = age1.equalsIgnoreCase("yes") ? "okay great! ": "im sorry, please for your guardian";
        System.out.println(age2);




        Scanner input = new Scanner(System.in);
        System.out.println("type g to start the elevator");
        String answer = input.nextLine();

        String print = answer.equalsIgnoreCase("g") ? "going up": "you've fail";
        System.out.println(print);


        Scanner floor = new Scanner(System.in);
        System.out.println("please go on floor A");
        String answer1 = floor.nextLine();

        String answer21 = answer1.equalsIgnoreCase("A") ? "going to floor A ": "you've fail";
        System.out.println(answer21);


        Scanner h1 = new Scanner(System.in);
        System.out.println("We are at floor A, a doctors office is this where you want to go?");
        String g1 = h1.nextLine();

        String g2 = g1.equalsIgnoreCase("no") ? " no problem, going up to floor B": "invalid answer";
        System.out.println(g2);


        Scanner a1 = new Scanner(System.in);
        System.out.println("We are at floor B, a gym is this where you want to go?");
        String b1 = a1.nextLine();

        String b2 = b1.equalsIgnoreCase("no") ? " no problem, going up to floor c": "invalid answer";
        System.out.println(b2);


        Scanner c1 = new Scanner(System.in);
        System.out.println("We are at floor C, a school is this where you want to go?");
        String d1 = c1.nextLine();

        String e1 = d1.equalsIgnoreCase("yes") ? " yay! you may leave the elevator": "invalid answer";
        System.out.println(e1);























    }
}
