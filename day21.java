public class day21 {

    public static void main(String[] args) {
        


        // // practice problem 1

        int n=4;
        for(int i=n; i>0; i--){
        for (int j=0;j<i;j++) {
            System.out.print("*");
        } }
        System.out.print("\n");


        // //question number 2

        int sum=0;
        int n1=4;
        for(int j=0; j<n1;j++) {
            sum =sum+(2*j);
        } 
        System.out.print("the sum of even numbers is  ");   // first 4 sum of even numbers 0 2 4 6 =12
        System.out.println(sum);

        //      question number 3

        int n2=10;
        for(int k=10; k>=0; k--){
           System.out.printf("%d X %d = %d\n", n2, k ,n2*k);  // ===5(n2)X1(k)=5(n2*k)
                   }
            ////      question number 4


int n3=5;
for(int k=0; k<=10; k++){
   System.out.printf("%d X %d = %d\n", n3, k ,n3*k);  // ===5(n2)X1(k)=5(n2*k)
}

//      question number 5

int n4=5;
      int l=1;
      int factorial=1;
    while (l<=n4){
        factorial *=l;
        l++;
     } System.out.println(factorial);


// ////      question number 6

        int n9=8;
        int sum2=0;
        for(int f=1; f<=10;f++) {
            sum2 +=n9*f;
        } 
        System.out.println(sum2);
 

 }}