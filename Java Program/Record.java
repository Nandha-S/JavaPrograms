import java.util.Scanner;

record Person(String name, int age, String gender) {
    Person(){
        this("nandha",21,"male");
    }

}
record Student(String studentName,int rollNo,String dept){
    Student(){
        this("nandha",1234,"cse");
    }
}
record Employee(int employeeId,String employeeName){
    Employee(){
        this(13244,"nandha");
    }
}
record Animal1(String animalType,String animalName){
    Animal1(){
        this("dog","Tommy");
    }
}
record Vehicle(String vehicleName,String Color){
    Vehicle(){
        this("car","red");
    }
}
public class Record {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 1 for Person records");
        System.out.println("Enter 2 for Student records");
        System.out.println("Enter 3 for Employee records");
        System.out.println("Enter 4 for Animal records");
        System.out.println("Enter 5 for Vehicle records");
        int num=input.nextInt();
        switch (num){
            case 1:{
                System.out.println("Enter Person name:");
                String name= input.next();
                System.out.println("Enter Person age:");
                int i= input.nextInt();
                System.out.println("Enter Person gender:");
                String gender= input.next();
                Person p=new Person(name,i,gender);
                System.out.println("Person records: "+p);
                break;
            }
            case 2:{
                System.out.println("Enter Student name:");
                String name= input.next();
                System.out.println("Enter Student rollno:");
                int i= input.nextInt();
                System.out.println("Enter Student department:");
                String dept= input.next();
                Student s=new Student(name,i,dept);
                System.out.println("Student records: "+s);
                break;
            }
            case 3:{
                System.out.println("Enter employee id:");
                int id= input.nextInt();
                System.out.println("Enter employee name");
                String name= input.next();
                Employee e=new Employee(id,name);
                System.out.println("Employee records: "+e);
                break;
            }
            case 4:{
                System.out.println("Enter Animal type:");
                String type= input.next();
                System.out.println("Enter animal name");
                String name= input.next();
                Animal1 a=new Animal1(type,name);
                System.out.println("Employee records: "+a);
                break;
            }
            case 5:{
                System.out.println("Enter vehicle name:");
                String name= input.next();
                System.out.println("Enter vehicle color");
                String color= input.next();
                Vehicle v=new Vehicle(name,color);
                System.out.println("Employee records: "+v);
                break;
            }
        }



    }
}
