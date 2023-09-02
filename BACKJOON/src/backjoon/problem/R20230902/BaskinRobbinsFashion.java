package backjoon.problem.R20230902;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author swkim
 * @category 수학, 구현, 조합론
 * @updatedAt 김선우, 2023.09.02(문제풀이)
 * {@summary} 베라의 패션(N개의 상의, N개의 하의 서로 다른 색으로 맞출 수 있는 조합 개수)
 * - 입력 : 1째줄 - N
 * https://www.acmicpc.net/problem/15439
 */
public class BaskinRobbinsFashion {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.valueOf(br.readLine());
		int result = N * (N-1);
		
		bw.write(result + "");
		bw.flush();
		br.close();
		bw.close();
	}
	
	// 여기서는 안씀
	public static int factorial (int num) {
        if (num == 1) return 1;
        
        return num * factorial ( num - 1 );
    }
	
	public static void main(String[] args) throws Exception {
		new BaskinRobbinsFashion().solution();
	}
	
}
