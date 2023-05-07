/*
    19. Write a Java Program using below steps.
        19.1 Declare one of your group member names as instance variable.
        19.2 Declare one of your group member names as static variable.
        19.3 Declare one instance method name with group name (e.g. selenium())and call both global
        variables.
        19.4 Declare static method name agile() and call both variable
        19.5 Call both user defined methods into main method.
        Note: Declare 1 local variables in all user defined method and main method and print in to statement.
* */
public class Programme19{
    String a = "Hemi Patel";
    static String b = "Hiren Patel";
    public void m(){
        System.out.println("Instance member: "+a);
        System.out.println("Static member: "+b);

        String group_name1 = "selenium";
        System.out.println("Selenium Method local variable Group name: "+group_name1);

    }

    //
    public static void t(){
        Programme19 h1 = new Programme19();
        System.out.println("Instance member: "+h1.a);
        System.out.println("Static member: "+b);

        String group_name2 = "Agile";
        System.out.println("Agile Method local variable Group name: "+group_name2);

    }
    public static void main(String[] args) {
        String course_name = "Software Testing";
        System.out.println("Print Main Method Local Variable: "+course_name);
        Programme19 h2 = new Programme19();
        h2.m();
        t();
    }
}




