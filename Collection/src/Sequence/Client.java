package Sequence;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int m=in.nextInt();
		int n=in.nextInt();
		Joseph js=new Joseph(n+10);
		for (int i=1;i<=n;i++)
		{
			
			js.enQueue(i);
			
		}
		
		
		//		js.enQueue(1);
//		js.enQueue(2);
//		js.enQueue(3);
//		js.enQueue(4);
//		js.enQueue(5);
//		js.enQueue(6);
//		js.enQueue(7);
//		js.enQueue(8);
		
//		js.delete(0);
//		js.enQueue(3);
//		System.out.print(js.realLength());
//		System.out.print(js.peak());
		js.joseph(m);
		
	}

}
