interface Bank{
    void getInterest(int a);


}
class Axis implements Bank{
    public void getInterest(int a) {
        System.out.println(a);
    }
}
class Hdfc implements Bank{
    public void getInterest(int a){
        System.out.println(a);
    }
}
public class BankDemo {
    public static void main(String[] args) {
        Hdfc obj1=new Hdfc();
        Axis obj2=new Axis();
        obj2.getInterest(5);
        obj1.getInterest(6);

    }
}
