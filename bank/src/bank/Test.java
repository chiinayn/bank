package bank;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int menu;
		int okane;
		int zandaka;
		Zandaka zan = new Zandaka(100000);
		Rosic rosic = new Rosic();
		zandaka = zan.getZandaka();
		
		Scanner scan = new Scanner(System.in);
		
		while(true){
			System.out.println("メニューを選択してください。");
			System.out.println("");
			System.out.println("1  預け入れ");
			System.out.println("2  引き出し");
			System.out.println("3  残高照会");
			System.out.println("0  終了");
			
			menu = scan.nextInt();
			
			if(menu == 1 ) {
				zandaka = rosic.plus(zandaka);
				zan.setZandaka(zandaka);
			} else if(menu == 2) {
				zandaka = rosic.minus(zandaka);
				zan.setZandaka(zandaka);
			} else if(menu == 3) {
				zandaka = zan.getZandaka();
				System.out.println("現在の残高は " + zandaka + "です。");
			} else if(menu == 0) {
				break;
			}
		}
		
		
	}

}
