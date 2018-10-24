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
public class SolutionDay6 {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        
        for(int i=0; i<n; i++){
            String s = scanner.nextLine();
            char[] charArray= s.toCharArray();
            
            for(int j=0; j<charArray.length; j++){
                if(j % 2 == 0){
                    System.out.print(charArray[j]);
                }
            }
            
            System.out.print(" ");
            for(int j=0; j<charArray.length; j++){
            if(j % 2 != 0 ){
             System.out.print(charArray[j]);

            }

            }   
            System.out.println();
            }
        
            scanner.close();

    }
}


