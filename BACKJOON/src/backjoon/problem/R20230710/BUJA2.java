package backjoon.problem.R20230710;

import java.math.BigInteger;
import java.util.Scanner;

// 백준에선 채점시 제출한 코드를 Main.java로 가정하여 받는다.
public class BUJA2 {

	public static void main(String[] args) {
		// 입력받는 다른 방법
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    // StringTokenizer st = new StringTokenizer(br.readLine());
	    // BigInteger n = new BigInteger(st.nextToken());
		Scanner sc = new Scanner(System.in);
		// 첫째 줄에는 최백준 조교가 가진 돈 n과 돈을 받으러 온 생명체의 수 m이 주어진다. (1 ≤ m ≤ n ≤ 101000, m과 n은 10진수 정수)
		// int 자료형으로는 10의 1000승을 표현할 수 없음 => BIGINTEGER를 사용해야함
		// BigInteger의 범위는 문자열 형태로 이루어져 있어 무한이다.
		/* < BigInteger 클래스 사직연산 메서드 >
		 * 덧셈 Bignumber1.add(Bignumber2) 
		 * 뺄셈 Bignumber1.subtract(Bignumber2) 
		 * 곱셈 Bignumber1.multiply(Bignumber2) 
		 * 나눗셈 Bignumber1.divide(Bignumber2) 
		 * 나머지 Bignumber1.remainder(Bignumber2)
		 */
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		sc.close();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
	}

}