/*5. Write a program for a calculator with addition, subtraction, multiplication, and division
methods all with parameters and use string concatenation methods. (Note: Two static
and Two instance methods.*/
public class Programme5 {

    public void addition(int a,int b){
        int h1 = a+b;
        System.out.println(h1);
    }
    public void substraction(int b,int a){
        int h1 = b-a;
        System.out.println(h1);
    }
public static void multipication(int c,int d){
    System.out.println(c*d);
}
public static void division(int d,int c){
    System.out.println(d/c);
}

public static void main(String[] args) {
        Programme5 h2 = new Programme5();
        h2.addition(5,10);
        h2.substraction(10,5);
        multipication(2,4);
        division(4,2);



}
}