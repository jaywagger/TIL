package chap04.ConditionalStatement;

import java.util.Random;
import java.util.Scanner;
//if-else 문과 스캐너의 활용

public class IFTest02 {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하세요:");
		String name = key.next();
		System.out.println();
		
		System.out.println("당신의 점수를 입력하세요:");
		int num = key.nextInt();
		System.out.println();
		System.out.println(name+"의 점수:"+num);
	
		if(num>=90)
		{
			System.out.println();
			System.out.println("통과");
		}
		else 
		{
			System.out.println();
			System.out.println("재시험");
		}
		
	}

}
