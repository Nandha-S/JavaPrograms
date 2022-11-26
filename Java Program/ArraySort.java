import java.util.*;
public class ArraySort{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=input.nextLine();
		System.out.println("String:"+s);
		s=s.replaceAll(" ","");
		char temp;
		char c[]=s.toCharArray();
		int size=c.length;
		for(int i=0;i<size-1;i++){
			for(int j=i+1;j<size;j++){
				if(c[i]>c[j]){
					temp=c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		System.out.println("Sorted String: ");
		for(int i=0;i<size;i++){
			System.out.print(c[i]+" ");
		}
	}
}