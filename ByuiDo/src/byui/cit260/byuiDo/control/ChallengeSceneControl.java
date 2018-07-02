/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.byuiDo.control;

/**
 *
 * @author Jake
 */
public class ChallengeSceneControl {

    public static double calculateInterest(double borrowed, double interestRate, long years) {
        if (borrowed <= 0) {
            return -1;
        }
        if (interestRate <= 0) {
            return -2;
        }
        if (years <= 0) {
            return -3;
        }
        double interest = borrowed * (interestRate/100) * years;
        return interest;
    }
}
