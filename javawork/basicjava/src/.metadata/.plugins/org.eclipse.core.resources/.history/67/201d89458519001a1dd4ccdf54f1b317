package chap04;

import java.util.Scanner;

public class ScoreSwitchExam {

	public static void main(String[] args) 
	{
		Scanner key = new Scanner(System.in);
		System.out.println("시험의 점수를 입력하세요: ");
		int grade = key.nextInt();
		
		if(grade > 100 | grade < 0)
		{
			System.out.println("잘못입력");
		}	
		else             // 여기가 중요
		{		
			switch (grade/10)
			{
				case 10:
				case 9:	
					System.out.println("A");
					break; 
				case 8:
					System.out.println("B");
					break;
				case 7:
					System.out.println("C");
					break;
				case 6:
					System.out.println("D");
					break;
				default:
					System.out.println("F");
			}
		}
		

	}

}
