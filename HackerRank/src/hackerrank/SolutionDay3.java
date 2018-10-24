/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank;

import java.util.Scanner;

/**
 *
 * @author chaudhari.k
 */
public class SolutionDay3 {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2 != 0 ){
            System.out.println("Weird");
        }
        else if(N % 2 == 0 && (N>1 && N<6)){
            System.out.println("Not Weird");
        }
        else if(N % 2 == 0 && (N>5 && N<21)){
            System.out.println("Weird");
        }
        else if(N % 2 == 0 && (N>20)){
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
