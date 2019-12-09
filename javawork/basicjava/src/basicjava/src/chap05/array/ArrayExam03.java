package chap05.array;
//모든 홀수번째 인덱스의 합을 구하기
public class ArrayExam03 {

	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50,60,70,80,90,100};
		int oddSum=0;
		
		for (int i=0; i<arr.length; i++)
		{
			if (i%2==1 ) //arr[i]%2==1 아니고
			{	
				System.out.println(i+"."+"홀수 배열: "+arr[i]);
				oddSum += arr[i]; 
			}
						 
		}System.out.println("배열의 홀수 번째 정수의 합은: "+oddSum);
	}

}
