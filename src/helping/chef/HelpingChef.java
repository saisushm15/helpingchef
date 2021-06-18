/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helping.chef;

import java.util.Scanner;

/**
 *
 * @author konda babu
 */
public class HelpingChef {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        while(t>0)
        {
           int N=input.nextInt();
           if(N<10)
           {
               System.out.println("Thanks for helping Chef!");
           }
           else
           {
               System.out.println("-1");
           }
        }
        t--;
        
    }
    
}
