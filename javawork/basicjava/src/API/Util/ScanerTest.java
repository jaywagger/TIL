package API.Util;

import java.util.Scanner;

//Scanner 클래스 (API)의 사용방법
//=>프로그램 실행 중간에 값을 입력받을 수 이쓴 기능들을 제공하는 클래스
public class ScanerTest {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		System.out.println("문자열을 입력하세요오오오~!");
		String data = key.next();
		//스캐너의 next 매소드 사용
		System.out.println("키보드로 입력받은 문자열:"+data);
		//next는 스페이스바 이전의 문자만 받음.
		//ln는 다음 줄
		System.out.print("숫자를 입력하세요");
		int num = key.nextInt();
		//스캐너의 next int 매소드 사용
		System.out.println("키보드로 입력받은 문자열:"+num);
	}

}
