/* 4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
*/
public class Programme4 {
    int a = 1;
    int b = 2;
    static int c = 3;
    static int d = 4;

public void t(){
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(a+b+c+d);
}
public static void m(){
Programme4 h1 = new Programme4 ();
    System.out.println(h1.a);
    System.out.println(h1.b);
    System.out.println(c);
    System.out.println(d);
    System.out.println(h1.a+h1.b+c+d);
}
    public static void main(String[] args){
    Programme4 h1 =new Programme4();
     h1.t();//call instance method
     m();//call static method
    }
}





