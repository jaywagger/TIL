package chap02.variable;
//변수에 값을 지정하는 예제
//Sout을 활용하여 printf를 보여주는 예제
public class VarEx1 {

	public static void main(String[] args) 
	{
		int year = 2019; 
		int age = 26;
		
		System.out.println(year);
		System.out.println(age);
		System.out.println("You are "+age+" years old in "+year);
		
		year = year+1; //초기값에서 1를 올려준다.
		age += 1; // age = age+1; 같은 뜻
		
		System.out.println("You will be "+age+" years old in "+year);
			
		
		
	}

}
