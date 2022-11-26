import java.util.*;
public class Arrays{
static void Min(int a[]){
	int min=a[0];
	for(int i=0;i<a.length;i++){
		if(min>a[i]){
			min=a[i];
		}
	}
	System.out.println("Small Element in array: "+min);
}
static void Max(int a[]){
	int max=a[0];
	for(int i=0;i<a.length;i++){
		if(max<a[i]){
			max=a[i];
		}
	}
	System.out.println("Big Element in array: "+max);
}
static void sortA(int a[]){
	int temp=0;
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Ascending array: ");
	for(int i=0;i<a.length;i++){
		System.out.print(" "+a[i]);
	}
	System.out.println();
}
static void sortD(int a[]){
	int temp=0;
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			if(a[i]<a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("Descending array: ");
	for(int i=0;i<a.length;i++){
		System.out.print(" "+a[i]);
	}
	System.out.println();
}

	
public static void main(String args[]){

Scanner input=new Scanner(System.in);
System.out.println("Enter the number of elements in array:");
int n=input.nextInt();
int[] arr=new int[n];
for(int i=0;i<arr.length;i++){
	System.out.println("Enter the elements of an array:");
	arr[i]=input.nextInt();
}
System.out.println("Elements in array:");
for(int i:arr){
	System.out.print(" "+i);
}
System.out.println();
Min(arr);
Max(arr);
sortA(arr);
sortD(arr);
}
}
