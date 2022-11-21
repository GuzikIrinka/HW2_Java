/*Напишите программу, чтобы проверить,
содержит ли данная строка только цифры. */

import java.util.*;
import java.lang.*;

public class ex1 {
    public static void main(String[] args) {
        char c1 = 'W';
        char c2 = '2';

        System.out.println(c1 + " is a number: " + Character.isDigit(c1));
        System.out.println(c2 + " is a number: " + Character.isDigit(c2));

    }
}
