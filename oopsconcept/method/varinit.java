package asthakunwar.assignments_feb2025.oopsconcept.method;

public class varinit {
    String color;
    int age;
    public static void main(String args[])
    {
        varinit obj = new varinit();
        obj.age = 2;
        obj.color = "Brown";
        System.out.println(obj.age + " " + obj.color);
    }
}
