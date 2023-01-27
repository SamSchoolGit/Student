/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

import java.util.*;
/**
 * hello there
 * @author sverdejo
 */
public class ReversedWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Word: ");
        String word = in.nextLine();
        
        char[] charArray = new char[word.length()];
        
//        for(int i = 0, j = word.length() - 1; i < word.length(); i++, j--) {
//            charArray[i] = word.charAt(j);
//        }
        for(int i = 0, j = word.length() - 1; i < word.length(); i++) {
            charArray[i] = word.charAt(j--);
        }
        
        System.out.print("Word Reversed: ");
        for(int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
        }
        
        System.out.println();

    }
}
