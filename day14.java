import java.util.Scanner;
import java.time.Year;


public class day14 {
public static void main(String[] args) {
//       System.out.println("enter the students name");
//     Scanner sc = new Scanner(System.in);
//       String name = sc.nextLine();
//     System.out.println("enter the students USN numebers");
//     float usn = sc.nextFloat();
//     System.out.println("NOW LETS CALCULATE THE TOTAL MARKS OF THE STUDENTS ");
//        System.out.println("enter the 1st subject marks");
//        float sub1 =sc.nextFloat();
//        System.out.println("enter the 2nd subject marks");
//        float sub2 = sc.nextFloat();
//        System.out.println("enter the 3rd subject marks");
//          float sub3 = sc.nextFloat();
//     float percentage = (sub1+sub2+sub3)*100/100;
//     System.out.println("percentage of the students is");
//     System.out.println(percentage);



//     // lets solve a program that is find the greatest no

//  System.out.println("enter the largest number");
//  System.out.println("enter the two numbers");
//  Scanner sc1 = new Scanner(System.in);
//  System.out.println("entet the 1st number");
//  int x = sc1.nextInt();
//  System.out.println("enter the 2nd numbers");
// int y = sc1.nextInt();
// if (x>y) {
//     System.out.println("x is largest");
// } else {
    
// }
//     System.out.println("y is largest");
      
      
        
// program to read a name and year of birth of a person .also display wheate the person is a senior citizen or not
Scanner sc3 = new Scanner(System.in);
System.out.println("enter the student name");
 String name = sc3.nextLine();
System.out.println("enter the year of birth");
int age = sc3.nextInt();


 int currentyear =Year.now().getValue();
 int age1 = currentyear-age;
   if (age>=60) {
     System.out.println("your a senior citizen");
   } else {
    System.out.println("your not a senior citizen");
   }






}}

