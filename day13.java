public class day13 {
    public static void main(String[] args) {
         
        String name = "Suman";
        System.out.println(name.startsWith("Su"));      // check if the first word is as same as string name
        System.out.println(name.endsWith("man"));     // check if the last word is as same as string name
    System.out.println(name.charAt(2));                                          // show the perticular char
System.out.println(name.indexOf("man"));
        String modifiedname = "YONIGGA";
               System.out.println(modifiedname.lastIndexOf(8));
               System.out.println(name.equals("suman"));
               System.out.println(name.equalsIgnoreCase("suman"));
   
          

            System.out.println("my name is suman rana \n hey this is so cool");       


///  PRACTICE SET TEST 3
                 // 1. problem 1-----  program to convert a string to a lower case

                 String name1 =name.toLowerCase();
        System.out.println(name1);

                 // 2. problem 2-------program to replace the spaces with underscores

   String text = "tolowercase";
   text = text.replace(" ", "_");
 System.out.println(text);

                 // 3. problem 3----------program to fill in a letter template whihc gives bots

      String letter = "dear <|name|>, thanks a lot ";
      letter = letter.replace("<|name|>", "suman");         // this string method is use to replace the perticular word....!!!!
      System.out.println(letter);

                   // 4. problem 4-----program to detect double and triple spaces in a string

       String myString = "this string contains double and triple   spaces";
       System.out.println(myString.indexOf(" "));
       System.out.println(myString.indexOf("   "));

                   // 5. problem 5-----program to format the following letter using escape sequence characters.
        
        String myletter ="dear suman,\n\t your doing great job \n keep pushing"; 
        System.out.println(myletter);


}} 
