package chap05.array;
//배열 엑세스하기
import java.util.Random;
import java.util.Scanner;
import API.Util.ScanerTest;

public class ArrayTest03 {
	public static void main(String[] args) 
	{
		int[] myarr = new int[5];
		System.out.println(myarr[0]);
		System.out.println(myarr[1]);
		System.out.println(myarr[2]);
		System.out.println(myarr[3]);
		System.out.println(myarr[4]);
		// int 초기값 모두 0
		// 배열의 위치는 1씩 증가하므로, for문과 공통점이 있다.
		//배열의 요소의 크기느 출력해보기
		System.out.println("배열의 요소의갯수:"+myarr.length);
		//length는 배열의 사이즈를 보여준다.
		System.out.println("--------------------");
		
		for(int i=0; i<myarr.length;i++) 
			//배열의 요소만큼만 돌린다. 5번. 배열 크게와 같아야 한다.
			//그래야 접근할 수 있다.
		{
			System.out.println(myarr[i]);
		}
				
	}
}
