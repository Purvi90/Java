package j2 ;


public class Strings {
    
 /*    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is :" +name);
    }
*/

//concatenation ---
/* 
     public static void main(String args[]) {
       String firstName = "purvi";
       String lastName = "sharma";
       String fullName = firstName+lastName;
       System.out.println(fullName);
    }
       */

       // count length--

/* 
      public static void main(String args[]) {
       String firstName = "purvi";
       String lastName = "sharma";
       String fullName = firstName+ " " + lastName;
       System.out.println(fullName.length());
    }
       */

  // CharAt ----
  /* 
    public static void main(String args[]) {
       String firstName = "purvi";
       String lastName = "sharma";
       String fullName = firstName+ " " + lastName;
       System.out.println(fullName.length());

       for(int i=0;i<fullName.length();i++){
          System.out.println(fullName.charAt(i));
       }
    }
       */

       // comparing strings ---

       public static void main(String args[]){
         String name1="Purvi";
         String name2="Purvi";

         if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal");
         }
         else{
            System.out.println("Strings are not equal");
         }
       }
}
