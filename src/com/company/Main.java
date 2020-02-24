package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean gameIsPlaying = true;

        while(gameIsPlaying) {
            System.out.println("Give me a number between 1 and 100:" );

            int rand = (int)(Math.random() * (100-1) + 1);
            int guess = input.nextInt();

            System.out.println(rand);

            if (guess == rand) {
                System.out.println("You guessed correctly!");
            } else if (guess >= rand - 5 && guess <= rand + 5) {
                System.out.println("Sooo close!");
                String answer = input.nextLine();
            } else if (guess > rand) {
                System.out.println("Too high!");
            } else if (guess < rand) {
                System.out.println("Too low");
            }
            System.out.println("Do you wish to play again? Y/N");
//            Scanner playAgain = new Scanner(System.in);
            String answer = input.next();
            if(answer.equals("Y")) {
                gameIsPlaying = true;
            } else {
                gameIsPlaying = false;
            }
        }


    }
}
