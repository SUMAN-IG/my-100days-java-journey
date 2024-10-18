import java.util.Scanner;
public class day18 {
     public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter your URL");
    String name1 = sc.nextLine();

    if (name1.endsWith(".com")) {
        System.out.println(name1 +"it is an commercial website");
    } else if (name1.endsWith(".org")) {
        System.out.println(name1 +".it is an organization website");
    } else if (name1.endsWith(".in")) {
        System.out.println(name1 +"its an indian website");
    }else {
        System.out.println(name1.endsWith("its an unknown website "));
    }
        

    }

     }


