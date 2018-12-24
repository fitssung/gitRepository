
public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자동 형변환
//		자동 형변환의 규칙
//		기존의 최대한 보존할 수 있는 타입으로 자동 형변환한다.
//		  1		  2		  4		 8		  4		   8
//		byte -> short -> int -> long -> float -> double
//				char  -> 
//		값의 손실이 없으면 바로 들어갈 수 있다. 손실이 있다면 적어야한다.
//		ex. long에서 int로 가려면 3485345L 적어야한다.
//		묵시적 형변환 (보통은 적지 않는다.)
//		-> 값의 손실이 없다.
//		명시적 형변환
//		-> 값의 손실이 있지만 손실이 있지만 그 결과가
//			원하는 결과라고 compiler에게 알려준다.
		
		/* 1. boolean(논리형)을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다.
		 * 2. 서로 다른 타입의 변수간의 연산은 형변환을 하는 것이 원칙이지만,
		 *    값의 범위가 작은 타입에서 큰 타입으로 형변환은 생략할 수 있다.		 * 
		 */
		
		
		
		double doubleNum = 0.0;
		
		doubleNum = 10;
		
		System.out.println(doubleNum);
		System.out.println();
		
		int small = 20000;
		long midium = 5000000;
		double large =  111111111;
		
		
		System.out.println(small);
		System.out.println(midium);
		System.out.println(large);
		
		
		
		
		
		
		
		
		
		
	}

}
