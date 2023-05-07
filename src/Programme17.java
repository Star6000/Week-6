/*17. Write a Java Program using below steps.
17.1 Declare your city as instance variables.
17.2 Declare your country as static variables.
17.3 Declare one instance method and call static variable in print statement
17.4 Declare static method and call instance variable in print Statement.
17.5 Call both user defined methods into main method.*/
public class Programme17 {
        String a = "London";
        static String b = "UK";
        public void m(){
            System.out.println("Country Name: "+b);//Declare static variable in instance method
            Programme17 h1 = new Programme17();
        }
            public static void t(){
                Programme17 h1 = new Programme17();
                System.out.println("City Name:"+h1.a);
            }
            public static void main(String[] args){
            Programme17 h2 = new Programme17();
            h2.m();
            t();

            }
    }


