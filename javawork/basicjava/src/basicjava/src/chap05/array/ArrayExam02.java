package chap05.array;

public class ArrayExam02 {

	public static void main(String[] args) 
	{
		int [] arr = {10,20,30,40,50};
		int sum=0;
		int ave=0;
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("Array"+i+": "+arr[i]);
			sum += arr[i];
									
		}System.out.println("---------------------------");
		ave = sum/arr.length;
		
		System.out.println("배열의 합과 평군은: "+sum+" & "+ave);
	}

}
