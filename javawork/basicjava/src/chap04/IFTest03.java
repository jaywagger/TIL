package chap04;

import java.util.Random;
import java.util.Scanner;
//if-else 문과 스캐너의 활용

public class IFTest03 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요:");
		String name = key.next();
		System.out.println();
		
		System.out.println(name+"님의 시험 점수를 입력하세요:");
		int num = key.nextInt();
		System.out.println();
		System.out.println(name+"의 점수:"+num);
		System.out.println();
	
		System.out.println(name+"의 응시 횟수를 입력하세요:");
		int fre = key.nextInt();
		System.out.println();
		System.out.println(name+"의 응시횟수:"+fre);
		System.out.println();
		
		if(num>=90)
		{
			System.out.println();
			System.out.println("통과");
		}
		else 
		{
			if(fre>=3)
			{
				System.out.println("처음부터 다시 시작");
				System.out.println();
			}
			else
			{
				System.out.println("이 과목만 재시험^^");	
				System.out.println();
			}
			
		}
		
	}

}
