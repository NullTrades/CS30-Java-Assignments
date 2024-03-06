/*

    Title:
    Author: Osy Okocha
    Date: March 5, 2024

*/

package Demos;

import java.util.Objects;
import java.util.Scanner;

public class Ex4Game {

    public static void sop(Object obj) {
        System.out.println(obj);

    }

    private Ex3Player player1 = new Ex3Player();
    private Ex3Player player2 = new Ex3Player();
    private Scanner sc = new Scanner(System.in);

    public void setup() {
        System.out.println("Welcome to Farkle");
        //testing if the sop method works
        sop("This feature worked " + 2 + " times");
        /**
         * Further implementations could include
         * Get player names
         * Get points required for victory
         * etc.
         */
    }

    public void run() {
        int turn;
        int points;
        while (this.player1.getScore() < 10000 && this.player2.getScore() < 10000) {
            System.out.println("Player 1 Turn!");
            turn = 0;
            while (turn < 3 && this.player1.getDiceSize() > 0) {
                this.player1.rollDice();
                this.player1.holdDie();
                turn++;
            }
            System.out.println("Player 1 Points: ");
            points = sc.nextInt();
            this.player1.addScore(points);
            this.player1.resetDice();

            // Turn goes to player 2

            System.out.println("Player 2 Turn!");
            turn = 0;
            while (turn < 3 && this.player2.getDiceSize() > 0) {
                this.player2.rollDice();
                this.player2.holdDie();
                turn++;
            }
            System.out.println("Player 2 Points: ");
            points = sc.nextInt();
            this.player2.addScore(points);
            this.player2.resetDice();
        }

        if (this.player1.getScore() > this.player2.getScore()) {
            System.out.println("Player 1 Wins");
        } else {
            System.out.println("Player 2 Wins");
        }
    }

    public static void main(String[] args) {
        Ex4Game game = new Ex4Game();
        game.setup();
        game.run();


    }

}
