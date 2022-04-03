package edu.bloomu.Bladen.Homework2;

/**
 * @author Nathaniel Bladen
 */
public class EldenRingMaxLevel {
    public static void main(String[] args) {
        double level = 13;
        double fistHalfOfEquation = Math.pow((0.02* level), 3);
        double secondHalfOfEquation = Math.pow((3.06 * level), 2);
        double thirdHalfOfEquation = (105.6 * level) - 895;

        double total = fistHalfOfEquation + secondHalfOfEquation + thirdHalfOfEquation;
        System.out.println(total);
    }
}
