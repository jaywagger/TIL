package chap04;
// 구구단

import java.util.Scanner;

public class ForExam02 
{

	public static void main(String[] args) 
	{
		Scanner key = new Scanner (System.in);
		System.out.println("숫자를 입력하세요: ");
		int num = key.nextInt();
		System.out.println();
		
		
		for(int i =1; i<= 9; i++)
		{
			System.out.println(num+" x "+i+" = " + num*i);
			System.out.println();
		}
	}
}
