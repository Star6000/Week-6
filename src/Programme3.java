/* 3.1 Declare one instance and one static variable.
   3.2 Declare one instance method.
   3.3 Declare one static method.
   3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
   3.5 Declare the Main method.
   3.6 Call both instance and static methods into the Main method and run the programme.*/
public class Programme3 {
    int a = 5; //Instance variable
    static int b = 6; //static variable
    public void t(){ //Declare instance method
       System.out.println(a);//Declare instance variable
       System.out.println(b);//Declare static variable
       System.out.println(a+b);
    }

       public static void m(){ //Declare static method
            Programme3 h1 = new Programme3();
            System.out.println(h1.a);//instance variable
            System.out.println(b);//static variable
            System.out.println(h1.a+b);
        }
        public static void main(String[] args){ //main method
        Programme3 h1 = new Programme3();
        h1.t();//call instance method in main method
         m();//call static method in main method
        }
   }

