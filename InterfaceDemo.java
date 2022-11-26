interface Animal{
    String name="specices";
    default void sleeping(){
        System.out.println("sleeping.....");
    }
    static void eating(){
        System.out.println("Eating....");
    }

    void bark();
}
class Dog implements Animal{
    public void bark(){
        System.out.println("Barking.....");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Animal obj=new Dog();
        System.out.println(Animal.name);
        obj.sleeping();
        Animal.eating();
        obj.bark();
        
    }
}
