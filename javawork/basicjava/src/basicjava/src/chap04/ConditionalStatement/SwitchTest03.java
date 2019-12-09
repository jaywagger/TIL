package chap04.ConditionalStatement;
//swtich문에서의 제약사항
import java.util.Scanner;

public class SwitchTest03 {

	public static void main(String[] args) 
	{
		//switch의 조건문은 int로 casting될 수 있는 값을 담고 있는 변소, 연산식, 메소드
		double d = 1.5;
		//선언에서 double문 사용할 수 없다. int나 str를 활용해라
		// byte, short, int, char, string 사용 가능.
		
		int data=5;		
		switch(data+60) // 연산할 수 있다.
		{
			case 'A': //ascii 코드도 사용할 수 있다. A는 선언되지 않았음. 
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;
		}
		
		//String도 가능
		String code = new String("a01");
		switch(code)
		{
		case "a01": 
			System.out.println("A01");
			break;
		case "a02":
			System.out.println("A02");
			break;
		case "a03":
			System.out.println("A03");
		
		}

	}

}
