package backjoon.problem.R20230710;

import java.math.BigInteger;
import java.util.Scanner;

// ���ؿ��� ä���� ������ �ڵ带 Main.java�� �����Ͽ� �޴´�.
public class BUJA2 {

	public static void main(String[] args) {
		// �Է¹޴� �ٸ� ���
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    // StringTokenizer st = new StringTokenizer(br.readLine());
	    // BigInteger n = new BigInteger(st.nextToken());
		Scanner sc = new Scanner(System.in);
		// ù° �ٿ��� �ֹ��� ������ ���� �� n�� ���� ������ �� ����ü�� �� m�� �־�����. (1 �� m �� n �� 101000, m�� n�� 10���� ����)
		// int �ڷ������δ� 10�� 1000���� ǥ���� �� ���� => BIGINTEGER�� ����ؾ���
		// BigInteger�� ������ ���ڿ� ���·� �̷���� �־� �����̴�.
		/* < BigInteger Ŭ���� �������� �޼��� >
		 * ���� Bignumber1.add(Bignumber2) 
		 * ���� Bignumber1.subtract(Bignumber2) 
		 * ���� Bignumber1.multiply(Bignumber2) 
		 * ������ Bignumber1.divide(Bignumber2) 
		 * ������ Bignumber1.remainder(Bignumber2)
		 */
		BigInteger n = sc.nextBigInteger();
		BigInteger m = sc.nextBigInteger();
		sc.close();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));
	}

}
