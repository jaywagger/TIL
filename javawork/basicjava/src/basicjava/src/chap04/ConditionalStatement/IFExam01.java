package chap04.ConditionalStatement;

import java.util.Scanner;
//숫자를 입려받아서 음수인지 양수인지 출력하고
//단, 양수인 경우 짝수인지 홀수인지 출력하기. 0은 제외

public class IFExam01 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num = key.nextInt();
		System.out.println();
	
		if(num > 1)
		{
			
			System.out.println("입력하신 값은 양수입니다.");
			System.out.println();
			System.out.print(num+"은 ");
			
			if(num%2==0)
			{
				System.out.println("짝수입니다");
				System.out.println();
			}
			else 
			{
				System.out.print("홀수입니다");
				System.out.println();
			}
		}
		else 
		{
			System.out.println("입력하신 값은 음수이니다");
			
		}
		
				
	}

}
