import java.util.Scanner;
    public class day12 {
    public static void main(String[] args) {

   // 1. WRITE A PROGRAM TO ENCRYPT A GRADE BY ADDING 8 TO IT. DECRYPT IT OT SH0W THE CORRECT GRADE?

      
        char grade = 'B';
        grade = (char)(grade+8);             ///// type casting 
                                       // encrypting the grade = to hide origional information
System.out.println(grade);

grade = (char)(grade -8);    //type casting
System.out.println(grade);      // decrypting the grade = to show origional information
      


    //  2. USE COMPARISON OPERATORS TO FIND OUT WHEATHER A GIVEN NUMBER IS GREATER THAN THR USER ENTERED NUMBER OR NOT
  
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      System.out.println(a>9);

    float v = 2;
    float v1 =2;
    float u = 5;
    float u1 = 5;
    float a1 = 5;
    float s = 2;
    float sum = ((v*v1)-(u*u1))/(2*a1*s);
    System.out.println(sum);


   // 3. FIND THE VALUE OF OLLOWING EXPRESSION 

int x = 7;
int a2 = (7*49)/7+(35/7);
System.out.println(a2);


          //use of string


                int a6 = 3;
                float b = 3.56f;
        String a9 = ("suman");                               // %d-int                    %f-float                  %s-string
  //                                                            value                       value                     value
                System.out.printf("enter the value of     %d      and value of      %9.5f      and value of     %s   ",a,b,a9);


                                  
                                          //  NOW WE SEE FEW METHODS OF STRINGS


           
String name = "Suman";
int value =name.length();                       //   1.....length() string method
System.out.println(value);

                            String ustring = name.toLowerCase();           //  2....tolowercasee() string method 
                            System.out.println(ustring);          

                            String lString = name.toUpperCase();            // 3..... touppercase() string  method
                            System.out.println(lString);

String nontrimmed = "      SUman";
System.out.println(nontrimmed);                                      
System.out.println(nontrimmed.trim());                           // 4.....trim() method


                          // done till 15:34

























          
                    
                 



       


    }}