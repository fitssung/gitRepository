
public class OperEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		int secondNum = 4;
//		// * -> "에스테리크"
//		// %d: 10진수의 표현식 -> 숫자가 들어가면 된다
		System.out.printf("%d + %d = %d\n", num, secondNum, num+secondNum);
		System.out.printf("%d - %d = %d\n", num, secondNum, num-secondNum);
		System.out.printf("%d * %d = %d\n", num, secondNum, num*secondNum);
//		// int / int -> 10 / 4 -> 2 int는 실수 취급 x
		System.out.printf("%d / %d = %d\n", num, secondNum, num/secondNum);
		System.out.printf("%d / %f = %f\n", 
				num, (float)secondNum, num/(float)secondNum);
//		//printf -> 거의 안쓴다
//		
//		
	}

}
