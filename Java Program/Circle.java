import java.util.Scanner;

class Operation{
    int square(int n){
        return n*n;
    }
}
public class Circle {
    Operation op;  //aggregation...
    double pi=3.14;
    double area(int radius){
        op=new Operation();
        int square=op.square(radius);
        return pi*square;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius:");
        int num=input.nextInt();
        Circle c=new Circle();
        double res=c.area(num);
        System.out.println(res);
    }
}
