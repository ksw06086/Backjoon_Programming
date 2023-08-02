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
 * @category ����, ��Ģ����, ���� ���е� / ū �� ����
 * @updatedAt �輱��, 2023.08.02(����Ǯ��)
 * {@summary} ���丮��3(N ���丮�� ���)
 * - �Է� : ù°�� - N
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

		// O(n)���� �ϸ� �ð��ʰ��� ���ϱ�, O(NlogN)���� ������ ��
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
