
public class StrTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		 문자형 (초기값  -> 공백으로
		char ch = ' ';

	  //* 문자열 : 어떤 다른 내용들과 합쳐져도 영향을 주지 않아야 한다.
//		->초기값 String strDefault = null;
//		String str = ""; ->초기화
		String str = "";
		String name = "";

		// 문자열 특징
//		문자열 + any type -> 문자열  + 문자열 -> 문자열
//		any type + 문자열 -> 문자열  + 문자열 -> 문자열
		// 문자열에서의 "+" : concat
		
		str = "Ja" + "va";
		name = str + 8.0;
		
		System.out.println("str : " + str);
		System.out.println("name : " + name);
		
		String kkk = "";
		
//		kkk = 7 (문자열에 정수라 x)
		kkk = 7 + " ";
		
		System.out.println(kkk);
		
		
		
		
	}

}
