package backjoon.problem.R20230712;

import java.util.Scanner;

/*
 * ���� �ۼ��� : �輱��
 * ���� �ۼ��� : 2023.07.12
 * ���� ������ : 2023.07.12
 * ���� : 3003�� - ŷ, ��, ��, ���, ����Ʈ, ��
 * ���� �̷� : �輱��, 2023.07.12(����Ǯ��)
 * ���۱� : �輱��
 */
public class Chess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		
		king = king - sc.nextInt();
		queen = queen - sc.nextInt();
		rook = rook - sc.nextInt();
		bishop = bishop - sc.nextInt();
		knight = knight - sc.nextInt();
		pawn = pawn - sc.nextInt();
		
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn);
	}
}
/* ����Ǯ�� 2
 * Scanner sc = new Scanner(System.in);
 * 
 * int comp[] = {1,1,2,2,2,8}; int input[] = new int[6]; 
 * for (int i = 0; i < input.length; i++) 
 * { 
 * 		input[i] = sc.nextInt(); 
 * 		System.out.println(comp[i] - input[i] + " "); 
 * }
 */