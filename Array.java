import java.util.*;
public class Array{
public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the Rows:");
int r=input.nextInt();
System.out.println("Enter the Coloumns:");
int c=input.nextInt();
int a[][]=new int[r][c];
int b[][]=new int[r][c];
System.out.println("enter elements of  marix:");
for(int i=0;i<r;i++){
	for(int j=0;j<c;j++){
		a[i][j]=input.nextInt();
	}
}
System.out.println("Original marix:");
for(int i=0;i<r;i++){
	for(int j=0;j<c;j++){
		System.out.print(" "+a[i][j]);
	}
	System.out.println();
}
for(int i=0;i<r;i++){
	for(int j=0;j<c;j++){
		b[j][i]=a[i][j];
	}
}
System.out.println("Reverse marix:");
for(int i=0;i<r;i++){
	for(int j=0;j<c;j++){
		System.out.print(" "+b[i][j]);
	}
	System.out.println();
}
}
}