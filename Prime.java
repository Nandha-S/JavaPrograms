import java.util.*;
public class Prime{
public static void main(String args[]){
int a[]={1,2,3,4,5,6,7,8,9,11,12,13,17,25};
for(int i: a){
	System.out.print(" "+i);
}
for(int i=0;i<a.length;i++){
	int count=0;
	for(int j=1;j<=a[i];j++){
		if(a[i]%j==0){
		count=count+1;
		}
	}
	if(count==2){
		System.out.println(a[i]+"is an Prime number");
	}
	}
	}
}
