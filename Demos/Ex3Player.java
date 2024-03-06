/*

    Title:
    Author: Osy Okocha
    Date: March 5, 2024

*/

package Demos;
import java.util.Scanner;
import java.util.ArrayList;
public class Ex3Player {

    private ArrayList<A_Die> dice = new ArrayList<A_Die>();
    private ArrayList<A_Die> held = new ArrayList<A_Die>();
    private int score = 0;
    private Scanner sc = new Scanner(System.in);

    public Ex3Player() {
        for (int i = 0; i < 6; i ++) {
            dice.add(new A_Die());
        }
    }

    public void rollDice() {
        for (A_Die die: this.dice) {
            die.rollDie();
        }
    }

    public void getDice() {
        for (A_Die die: this.dice) {
            die.display();
        }
    }

    public void getHeld() {
        for (A_Die die: this.held) {
            die.display();
        }
    }

    public void holdDie() {
        System.out.println("Select a die to hold");
        for (int i = 0; i < this.dice.size(); i++) {
            System.out.println(i+1 + ". " + this.dice.get(i).getDieNum());
        }
        int die = sc.nextInt() -1;

        this.held.add(this.dice.get(die));
        this.dice.remove(die);
        System.out.println("Dice remaining: ");
        this.getDice();
        System.out.println("Dice held: ");
        this.getHeld();

        System.out.println("Would you like to hold more? (y/N)");
        String again = sc.next();
        if(again.toUpperCase().equals("Y")) {
            this.holdDie();
        }
    }

    public void resetDice() {
        this.dice.addAll(held);
        this.held.clear();
    }

    public void addScore(int points) {
        this.score += points;
    }

    public int getScore() {
        return this.score;
    }

    public int getDiceSize() {
        return this.dice.size();
    }
    public void printScore() {
        System.out.println("Score: " + this.score);
    }
    public static void main(String[] args) {
        Ex3Player Osy = new Ex3Player();
        Osy.getDice();
        Osy.holdDie();

        Osy.resetDice();
        System.out.println(" Common Dice Pool");
        Osy.getDice();
        System.out.println("\nHeld Dice");
        Osy.getHeld();

        Osy.addScore(10000);
        Osy.addScore(450);
        Osy.printScore();

    }

}
