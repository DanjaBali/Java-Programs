/** **********************************************
 ***********     JAVA CALCULATOR    **************
 ********         BY Danja Bali       ************
 ************************************************ */

/**
 *
 * @author user
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
import javax.swing.JPanel;

public class GUICalcTest extends JPanel {
// Addition method  with public modifier, int return-type, and two parameter-list

    public int Addition(int num1, int num2) {
        return num1 + num2;      //Body of the method 
    }
//  Substraction method  with public modifier, int return-type, and two parameter-list

    public int Substraction(int num1, int num2) {
        return num1 - num2;
    }
//  Multipication method with public modifier, int return-type, and two parameter-list

    public int Multipication(int num1, int num2) {
        return num1 * num2;
    }
//  Division method with public modifier, int return-type, and two parameter-list

    public int Division(int num1, int num2) {
        return num1 / num2;
    }
//Power method with public modifier, int return-type, and two parameter-list

    public int power(int base, int exponent) {
        int result;
        result = (int) Math.pow(base, exponent);
        return result;
    }
//Sin method with public modifier, double return-type, and one parameter-list

    public double sin(double num1) {
        return Math.toRadians(num1);
    }
//Cos method with public modifier, double return-type, and one parameter-list

    public double cos(double num1) {
        return Math.toRadians(num1);
    }
//Logb method with public modifier, double return-type, and two parameter-list

    public double logb(double base, double num1) {
        return Math.log(base) / Math.log(num1);
    }
}
