package chap04.loop;
//for문 중첩하기 별그리기
public class ForTest02 {

	public static void main(String[] args) 
	{
		for(int row =1; row<=5; row++) //아랫꺼 5번 아래로 반복
		{
			for(int i=1;i<=5;i++)			//별 5개 한줄
			{
				System.out.print("1");
			}System.out.println();
		}
	}

}
