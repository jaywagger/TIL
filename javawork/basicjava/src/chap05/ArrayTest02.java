package chap05;

import java.util.Random;
import java.util.Scanner;

import API.Util.ScanerTest;

//참조형데이터 배열 만들기
public class ArrayTest02 {
	public static void main(String[] args) 
	{
		//1. 배열의 선언
		String[] strArr = new String[3];
		Random[] ranArr = new Random[5];
		Scanner[] keyArr = new Scanner[100];
		
		System.out.println(strArr[0]);
		System.out.println(ranArr[0]);
		System.out.println(keyArr[0]);
		//위 모두 초기값은 null이다. 이유는 현재 아무것도 참조하고 있지 않기 때문임.
		System.out.println("------------------");
		
		//참조형 배열의 선언과 생성과 최화
		String[] arr = new String[3];
		arr[0] = new String("Java");// 자바라는 데이터가 이 위치에 저장되어 있음
		arr[1] = new String("JDBC");
		arr[2] = new String("HTML5");
		System.out.println(arr[0]);
		
	}
}
