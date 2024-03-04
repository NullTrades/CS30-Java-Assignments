// Title: A simple Dice Class
// Author: Osy OKocha
// Date: March 4th, 2024




package Demos.boardGame;
import java.util.Scanner;
import java.util.Random;

public class A_Die {

    private int DIE_MAX = 6;
    private int DIE_NUM;

    Random rand = new Random();


    public A_Die() {

        this.rollDie();

    }

    public A_Die(int SIZE) {
        this.DIE_MAX = SIZE;
        this.rollDie();

    }

    public void rollDie() {
        this.DIE_NUM = rand.nextInt(this.DIE_MAX) + 1;
    }

    public class A_DIE {

        public static void main(String[] args) {
            A_Die die1 = new A_Die();
            A_Die die2 = new A_Die(20);

            System.out.println(die1.DIE_NUM);
            System.out.println(die2.DIE_NUM);
            die1.rollDie();
            System.out.println(die1.DIE_NUM);

        }

    }

}
