/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasyntaxpro10l2;




/**
 *
 * @author David-pc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // class Solution1
        System.out.println("Десятичное число " + Solution1.decimalNumber + " равно восьмеричному числу " + Solution1.toOctal(Solution1.decimalNumber));
        System.out.println("Восьмеричное число " + Solution1.octalNumber + " равно десятичному числу " + Solution1.toDecimal(Solution1.octalNumber));
        
        // class Solution2
        System.out.println("Десятичное число " + Solution2.decimalNumber + " равно двоичному числу " + Solution2.toBinary(Solution2.decimalNumber));        
        System.out.println("Двоичное число " + Solution2.binaryNumber + " равно десятичному числу " + Solution2.toDecimal(Solution2.binaryNumber));
        
        // class Solution3
        System.out.println("Десятичное число " + Solution3.decimalNumber + " равно шестнадцатеричному числу " + Solution3.toHex(Solution3.decimalNumber));        
        System.out.println("Шестнадцатеричное число " + Solution3.hexNumber + " равно десятичному числу " + Solution3.toDecimal(Solution3.hexNumber));
        
        // class Solution4
        System.out.println("Двоичное число " + Solution4.binaryNumber + " равно шестнадцатеричному числу " + Solution4.toHex(Solution4.binaryNumber));        
        System.out.println("Шестнадцатеричное число " + Solution4.hexNumber + " равно двоичному числу " + Solution4.toBinary(Solution4.hexNumber));
    }
    
}
