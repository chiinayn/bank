package bank;

import java.util.Scanner;

public class Rosic {
	
	Scanner scan = new Scanner(System.in);
	
	public int plus(int zan) {
		int okane;
		System.out.println("いくら預け入りますか？");
		okane = scan.nextInt();
		return zan += okane;
	}
	
	public int minus(int zan) {
		int okane;
		System.out.println("いくら引き出しますか？");
		okane = scan.nextInt();
		return zan -= okane;
	}
	
	
	
	
	
}
