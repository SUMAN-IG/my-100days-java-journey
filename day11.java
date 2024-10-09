import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class day11 {
    public static void main(String[] args) {
        int i = 23;
        int x = ++i*5;                    //increment operator
        
        System.out.println(x);
        char ch = 'S';
        System.out.println(++ch);         ////increment operator
        

                   int x1 = 45;
                   int x2 = 56;
                   float fl = 4.56f;
                   System.out.println(--x1*--x2);            //decrement operator
             


                   Scanner sc  = new Scanner(System.in);
                     System.out.println("enter the first subject marks");
                     int sc2 = sc.nextInt();
                     System.out.println("enter the second subject marks");
                     int sc3 = sc.nextInt();
                     System.out.println("enter the third subject marks");
                     int sc4 = sc.nextInt();
                            int sum = (sc2+sc3+sc4)/3*100;
                            System.out.println(" the percentage of 3 subject is  "   + sum);

                        
                }
}
