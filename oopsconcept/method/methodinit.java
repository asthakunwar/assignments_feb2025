package asthakunwar.assignments_feb2025.oopsconcept.method;

public class methodinit {
    String color;
    int age;
    void initobj(String c , int a)
    {
        color = c;
        age = a;
    }
    void display()
    {
        System.out.println(color + " " + age);
    }
    public static void main(String args[])
    {
        methodinit obj = new methodinit();
        obj.initobj("blue",20);
        obj.display();
    }
}
