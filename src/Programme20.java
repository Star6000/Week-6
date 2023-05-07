/*
    20. Write a Java Program using below steps.
        20.1 Declare your Spain as static variable.
        20.2 Declare your United Kingdom as instance variable.
        20.3 Declare instance method name homeCountry()and call static variable.
        20.4 Declare static method name holidays() and call instance variable
        20.5 Call both methods in main method.
* */
public class Programme20 {
    public static String country_1 = "Spain";
    public String country_2 = "United Kingdom";


    public void homeCountry(){
        System.out.println("Static Variable: "+country_1);
    }
    public static void holidays(){
        Programme20 print = new Programme20();
        System.out.println("Instance Variable: " +print.country_2);
    }

    public static void main(String[] args) {
        Programme20 printing = new Programme20();
        printing.homeCountry();
        holidays();
    }
}

