package chap04;
//for문 연습 - 기본 for 연습(for문의 문법)
public class ForTest01 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{	
		int count=1;
		for(int i=1; i<5;i++)
			{
			System.out.println(i+". 자바프로그래밍:");//+count/
			//count++;
			}
		
		System.out.println("***********************************");
		for(int i=11; i<25;i++)
		{
		System.out.println("자바프로그래밍");
		}
		
		System.out.println("***********************************");
		for(int i=5; i>1;i--) //조건에 따라 --도 사용할 수 있다.
							  //초기값(시작값)은 사용 용도에 따라 설정 
		{
		System.out.println("자바프로그래밍");
		}
	
	}
}
