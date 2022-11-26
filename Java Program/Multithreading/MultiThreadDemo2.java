package javaPrograms;

import java.util.Scanner;

class Table{
	synchronized public void m(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(i*n);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);

		Table table=new Table();
		Thread t1=new Thread() {
			public void run() {
				table.m(5);
			}
		};
		Thread t2=new Thread() {
			public void run() {
				table.m(6);
			}
		};
		t1.start();
		t2.start();
		

		
	}

}
