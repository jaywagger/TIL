package chap02.variable;
//변수값을 상숙값으로 바꾸기
public class Constant_Ex1 {

	public static void main(String[] args) 
	{
		final int X = 10; //final를 붙히면 constant value가 되어 변수값을 바꿀 수 없다.
		final int Y = 20; //상수값은 대문자를 사용하는게 약속. 여러단어면 '_'를 사용.
		int tmp = 0;
			
		System.out.println("X:"+ X + " Y:" + Y);
			
//		tmp = x; //tmp->x, x->y, y->tmp
//		x = y;
//		y = tmp;
//		
//		System.out.println("X:"+ x + " Y:" + y);
		
		

	}

}
