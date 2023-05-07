/*Write a Java Program using below steps.
18.1 Declare your council name as static variables.
18.2 Declare your house number as instance variables.
18.3 Declare one instance method name borough() and call Static variable
18.4 Declare static method name address() and call instance variable
18.5 Call both user defined methods into main method.*/
public class Programme18 {

        static String council_name = "Croydon Council";

        int house_number = 61;
        public void m(){
            System.out.println("Council Name: "+council_name);
        }
        public static void t(){
            Programme18 h1 = new Programme18();
            System.out.println("My House number is: "+h1.house_number);
        }

        public static void main(String[] args) {
            Programme18 h2 = new Programme18();
            h2.m();

            t();
        }
}
