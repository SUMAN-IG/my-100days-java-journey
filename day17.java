import java.util.Scanner;
public class day17 {

    public static void main(String[] args) {
// int age;
// System.out.println("enter your age");
// Scanner sc=new Scanner(System.in);
// age = sc.nextInt();
// switch (age) {      // choosing an option
//     case 18:
//         System.out.println("your going to be 18");
//         break;

//      case 23:
//      System.out.println("your going to join a job");
//      break;

//      case 34:
//      System.out.println("your going to have a enjoyable life");
//         break;
//         default:
//         System.out.println("enjou ur life");


//           // question no 2
// Scanner sc2 = new Scanner(System.in);
// byte m1,m2,m3;
//  System.out.println("enter your physics marks");
//  m1 = sc.nextByte();

//   System.out.println("enter your chemistry marks");
//    m2 = sc.nextByte();

// System.out.println("enter your maths marks");
//  m3 = sc.nextByte();

//   float avg = m1+m2+m3/3.0f;
//   System.out.println(avg);

//  if (avg>40 && m1>33 && m2>33 && m3>33) {
//     System.out.println("congratulations you are passs");
//  }
//   else{
//     System.out.println(" sorry you r fail");
//   } 
//  Scanner sc1=new Scanner(System.in);

//    int day = sc1.nextInt();
//     switch (day){
//  case 1 -> System.out.println("monday");
//  case 2 -> System.out.println("tuesday");
//  case 3 -> System.out.println("wednesday");
//  case 4 -> System.out.println("thursday");
//  case 5 -> System.out.println("friday");
//  case 6 -> System.out.println("saturday");
//  case 7 -> System.out.println("sunday");
//     }
 System.out.println("lets find wheather the year is a leap year or no");
 
 Scanner sc5=new Scanner(System.in);
  int year= sc5.nextInt();
 if ((year%4==0) && year%100==0 || (year%400==0)) {
            System.out.println("its a leap year");
        }
    
else {
    System.out.println("its not a leap year");
 }
    
 }
}

    
        
    