package chap04;
//for문 중첩하기 2~9 구구단
public class ForTest03 {

	public static void main(String[] args) 
	{

		for(int dan=2; dan<=9; dan++)
		{
			for(int i=1;i<=9;i++)			//구구단
			{
				System.out.print(+i+" x "+dan+" = " + dan*i+"\t");
			}System.out.println();
		}
	}

}
