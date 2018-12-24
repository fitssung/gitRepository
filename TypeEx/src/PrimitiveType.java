
public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		저장 가능한 값의 범위
//		 논리형  boolean: false, true
//		 문자형  char: 0~65535
//		 정수형  byte, short, int, long
//			byte: -127~127
//	  	    short: -32,768 ~32,767
//		    int: -2의 31승 ~ 반대 까지 약 +-20억
//		    long: -2의 63승 ~ 반대 까지
//		 실수형 float, doule
//			float: 1.4E-45 ~ 3.4E38
//			double: 엄청 크다(long보다 큼)
		
//		boolean
//		기본값: false
		boolean power = true;
		boolean checked = false;
		
		System.out.println("대답 yes/no, 스위치 on/off");
		System.out.println(power);
		System.out.println(checked);
		System.out.println();
		System.out.println();
		
//		char character
//		기본값 = ' '; -> 공백
		char ch = 'A';
		// 하나의 문자만을 저장할 수 있다 (ex. 'Sa' ->X 'S'->O)
		
		System.out.println(ch);
//		아스키코드( 이진법 논리 이런거 배우고 등 후에 )
		
//		인코딩 디코딩
		
		
//		정수형
//		byte, short, int, long
//		   1 ,  2,    4,    8
//	해당 bit 8, 16, 32, 64
//		32비트는 int = 20억정도까지
		int num = 300000000;
		
		System.out.println(num);
//		=128~127
		byte b = 127;
		
		b = (byte)(b + 20);
		
		System.out.println(b);
//		컴퓨터의 기본값 int (4byte)
//		30000'L'-> long
		long bigNum = 3000000000L;
		
		System.out.println("Long 타입: " + bigNum);
		
		int firstNum = 1500000000;
		int secondNum = 1300000000;
		
		int sum = 0;
		sum = firstNum + secondNum;
		
		System.out.println("총 명품금액: " + sum);
		
//		실수형
//		float, double
//		4byte  8byte
//		실수 정확도 -> 정밀도
//		float은 거의 안쓰고 더블을 쓴다. 기본이 더블, 그래서 뒤에 f를 적는다
		float f = 9.12345678901234567890F;
		float f2 = 1.12345678901234567890f;
		double d = 9.12345678901234567890d;
		
		System.out.println(f);
		System.out.println(f2);
		System.out.println(d);
		
//		기본값들은 설정을 해줘야한다 처음에, 기본
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
