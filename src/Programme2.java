      /*  2.1 Declare two static variables.
        2.2 Declare one static method.
        2.3 Call both static variables into the static method inside the print statement.
        2.4 Declare the Main method.
        2.5 Call the static method into the Main method and run the programme.*/
        public class Programme2 {
          static int a = 5;
          static int b = 14;//Declare two static variables

          public static void t(){
              System.out.println(a);
              System.out.println(b); //call static variables in static method with print
              System.out.println(a + b);
          }

          public static void main(String[] args) { //Declare main method
              t();//call static method in main method
          }
      }

