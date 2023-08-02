package backjoon.problem.R20230802;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 사칙연산, 임의 정밀도 / 큰 수 연산
 * @updatedAt 김선우, 2023.08.02(문제풀이)
 * {@summary} 팩토리얼3(N 팩토리얼 출력)
 * - 입력 : 첫째줄 - N
 * https://www.acmicpc.net/problem/27434
 */
public class BigFactorial {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		bw.write(factorial(1, N) + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static BigInteger factorial(int a, int n) {
		BigInteger ret=BigInteger.valueOf(a);

		// O(n)으로 하면 시간초과가 나니까, O(NlogN)으로 나눠서 함
        if(a<n){
            int b=(a+n)/2;
            ret=factorial(a,b).multiply(factorial(b+1,n));
        }
        return ret;
	}
	
	public static void main(String[] args) throws Exception {
		new BigFactorial().solution();
	}
	
}
