/* Write a Java programme using the following steps.
        1.1 Declare two instance variables.
        1.2 Declare one instance method.
        1.3 Call both instance variables into the instance method inside the print statement.
        1.4 Declare the Main method.
        1.5 Call the above instance method into the Main method and run the programme.
        */
public class Programme1 {
    int a = 14;   //  Declare instance variables
    int b = 23;  // Declare instance variables

    public void t(){             //Declare instance method
        System.out.println(a);
        System.out.println(b);   //Declare instance variables in same method
        System.out.println(a+b);
    }
      public static void main (String[]args) {
    //main method
       Programme1 h1 = new Programme1();//call instance method into main method
       h1.t();
}


}




