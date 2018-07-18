// int型スタックの利用例

import java.util.Scanner;

class GstackTester {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Gstack<String> s = new Gstack<String>(5);	// 最大64個プッシュできるスタック

		while (true) {
			System.out.println("現在のデータ数：" + s.size() + " / "
															  + s.capacity());
			System.out.println("(1)プッシュ (2)ポップ (3)ピーク");
			System.out.println("(4)ダンプ (5)検索 (6)クリア");
		    System.out.print("(7)確認 (0)終了：");

			int menu = stdIn.nextInt();
			if (menu == 0) break;

			String x;
			switch (menu) {
			 case 1: 							// プッシュ
				System.out.print("データ：");
				x = stdIn.next();
				try {
					s.push(x);
			 	} catch (IntStack.OverflowIntStackException e) {
					System.out.println("スタックが満杯です。");
				}
				break;

			 case 2: 							// ポップ
				try {
			 		x = s.pop();
					System.out.println("ポップしたデータは" + x + "です。");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			 case 3: 							// ピーク
				try {
			 		x = s.peek();
					System.out.println("ピークしたデータは" + x + "です。");
			 	} catch (IntStack.EmptyIntStackException e) {
					System.out.println("スタックが空です。");
				}
				break;

			 case 4: 							// ダンプ
				s.dump();
				break;


            case 5: // 検索
			    System.out.print("検索する番号 => ");
			    String key = stdIn.next();
                int ret = s.indexOf(key); 
                if (ret != -1) {
                    System.out.println((s.size()-ret) + "回popすればデータが取り出せます" );
                } else {
                    System.out.println("見つかりません");
                }
                break;

            case 6: // クリア
                s.clear();
                System.out.println("クリアしました");
                break;

            case 7: // 確認
                if (s.isEmpty()) {
                    System.out.println("スタックは空です");
                } else if (s.isFull()){
                    System.out.println("スタックは一杯です");
                }
                break;
			}

		}
	}
}
