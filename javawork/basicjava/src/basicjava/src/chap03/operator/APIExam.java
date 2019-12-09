package chap03.operator;

import java.util.Random;

public class APIExam {
	
	public static void main(String[] args) 
{
		Random r = new Random();
		
		int i = r.nextInt();
		
		System.out.println(i);
		
		int j = r.nextInt(100)+1;
		
		System.out.println(j);
}

}