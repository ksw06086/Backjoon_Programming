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
 * @category ����, ����, ��Ģ����
 * @updatedAt �輱��, 2023.08.02(����Ǯ��)
 * {@summary} �������� ���߱���(������ ���� ����ö�� ����)
 * - �Է� : ù°�� - ����ö���� �Ÿ�, ���� ���ð�, ����ö ���ð�
 * https://www.acmicpc.net/problem/28113
 */
public class PublicTransport {
	private void solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int subwayLoad = Integer.valueOf(st.nextToken());
		int busReadyTime = Integer.valueOf(st.nextToken());
		int subwayReadyTime = Integer.valueOf(st.nextToken());
		
		if(subwayLoad > subwayReadyTime) { bw.write("Bus"); }
		else if(busReadyTime == subwayReadyTime) { bw.write("Anything"); }
		else if(busReadyTime > subwayReadyTime) { bw.write("Subway"); }
		else { bw.write("Bus"); }
		
		bw.flush();
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		new PublicTransport().solution();
	}
	
}
