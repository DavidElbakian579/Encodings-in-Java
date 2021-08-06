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
public class Solution1 {
    /* 1
    Восьмеричный конвертер
    Публичный статический метод toOctal(int) должен переводить целое число, 
    полученное в качестве входящего параметра, из десятичной системы счисления в восьмеричную. 
    А публичный статический метод toDecimal(int) наоборот — из восьмеричной в десятичную.
    Методы работают только с положительными числами. Если входящий параметр меньше или равен 0, методы возвращают 0.
    Твоя задача — реализовать эти методы.

    Один из алгоритмов перевода десятичного числа в восьмеричное следующий:
    i равно 0
    while(десятичное число не равно 0) {
        восьмеричное число = восьмеричное число + (остаток от деления десятичного числа на 8) * на 10 в степени i
        десятичное число = десятичное число / 8
        i увеличиваем на 1
    }

    Один из алгоритмов перевода восьмеричного числа в десятичное следующий:
    i равно 0
    while(восьмеричное число не равно 0) {
        десятичное число = десятичное число + (остаток от деления восьмеричного числа на 10) * на 8 в степени i
        восьмеричное число = восьмеричное число / 10
        i увеличиваем на 1
    }
    Метод main() не принимает участие в тестировании.
    Подсказка: чтобы возвести число в степень, можно использовать метод Math.pow(число, степень).
    */
    public static int decimalNumber = 21;
    public static int octalNumber = 25;
    
    public static int toOctal(int decimalNumber) {
        int octalNumber = 0;
        if (decimalNumber <= 0) {
            return octalNumber;
        }

        int i = 0;
        while (decimalNumber != 0) {
            octalNumber = (int) (octalNumber + (decimalNumber % 8) * Math.pow(10, i++));
            decimalNumber = decimalNumber / 8;
        }
        return octalNumber;
    }

    public static int toDecimal(int octalNumber) {
        int decimalNumber = 0;
        if (octalNumber <= 0) {
            return decimalNumber;
        }

        int i = 0;
        while (octalNumber != 0) {
            decimalNumber = (int) (decimalNumber + (octalNumber % 10) * Math.pow(8, i++));
            octalNumber = octalNumber / 10;
        }
        return decimalNumber;
    }
}
