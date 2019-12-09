package chap04;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		int num=0;
		while(num<10)
		{
			System.out.println("숫자입렵");
			num = key.nextInt();
			//while문은 조건을 만조하지 앟으면 브럭만의 코드가 실행되지 않는다
			System.out.println("while문- 실행명령문:"+num);
			
		}
		
		//num=10;
		do
		{
			System.out.println("숫자입렵");
			num = key.nextInt();
			//while문은 조건을 만조하지 앟으면 브럭만의 코드가 실행되지 않는다
			System.out.println("while문- 실행명령문:"+num);
			
		}
		while(num>10);

	}

}
