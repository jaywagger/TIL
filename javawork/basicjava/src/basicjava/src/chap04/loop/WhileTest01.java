package chap04.loop;
//기초 while문 연습
//자바 프로그래밍 5번 출력
public class WhileTest01 {

	public static void main(String[] args) 
	{
		int i=1;
		while(i<=5)
		{
			System.out.println(i+". 자바프로그래밍");
			i++; 
		}
		System.out.println("---------------------------------");
		
		i=1; //위 코드떄문에 i=5 이므로, 초기화한다.
		while(true)
		{
			if(i>5)
			{
				//반복문을 빠져나가
				break;
			}
			System.out.println(i+". 자바프로그래밍");
			i++;
		}
		
		
		
	}

}
