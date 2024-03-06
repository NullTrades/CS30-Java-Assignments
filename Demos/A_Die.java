// Title: A simple Dice Class
// Author: Osy Okocha
// Date: March 4th, 2024




package Demos;

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
        this.DIE_NUM = rand.nextInt(this.DIE_MAX) +1;
    }

    public boolean getEven() {
        if(this.DIE_NUM%2 == 0) {
            return true;

        } else {
            return false;
        }
    }

    public void display() {
        System.out.println(this.DIE_NUM);
    }

    public int getDieNum() {
        return this.DIE_NUM;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        A_Die die1 = new A_Die();
        A_Die die2 = new A_Die(20);

        //System.out.println(die1.DIE_NUM);
        //System.out.println(die2.DIE_NUM);

        System.out.println("""
                Welcome to Dice Roll! 
                Get points by correctly choosing both odd, both even, or odd and even. 
                You will lose points if you guess incorrectly.""");

        while(true) {
            System.out.println("""
                    1. Guess dice will be odd
                    2. Guess dice will be even
                    3. Gues one die will be odd and one will be even""");

            int choice = scanner.nextInt();

            die1.rollDie();
            die2.rollDie();

            int result;
            if(die1.getEven() && die2.getEven()) {
                result = 2;
            } else if (!die1.getEven() && !die2.getEven()) {
                result = 1;
            } else {
                result = 3;
            }

            System.out.println(die1.DIE_NUM);
            System.out.println(die2.DIE_NUM);

            if (choice == result) {
                score += 10;
                System.out.println("Right on!");
            } else {
                score -= 5;
                System.out.println("Better luck next time...");
            }

            System.out.println("Score: " + score);

            }
        }
    }

