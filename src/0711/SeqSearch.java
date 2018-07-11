// 線形探索

import java.util.Scanner;

class SeqSearch {

	//--- 配列aの先頭n個の要素からkeyと一致する要素を線形探索 ---//
	static int seqSearch(int[] a, int n, int key) {



		int i = 0;

        int [] b = new int[n+1];
        System.arraycopy(a, 0, b, 0, n);
        a = b;

        a[n] = key; // 番兵の追加

        // １，２行目の表示
        System.out.print("   |");
        for(int j =0; j<a.length; j++)
            System.out.printf("%4d",j);
        System.out.println();
        System.out.print("---+");
        for(int j =0; j<a.length; j++)
            System.out.print("----");
        System.out.println("--");

		while (true) {

            // 3,4行目の表示
            System.out.print("   |");
            for(int j =0; j<a.length; j++)
                if ( j == i)
                    System.out.print("   *");
                else
                    System.out.print("    ");
            System.out.println();
            System.out.printf("%3d|",i);
            for(int j =0; j<a.length; j++)
                System.out.printf("%4d",a[j]);
            System.out.println();


			if (a[i] == key)
                break;
			i++;
            // 5行目の表示
            System.out.println("   |");

		}

        System.out.println();

        return i == n ? -1 : i; // iがnのときは番兵と一致なので、-1を返す
	}

	public static void main(String[] args) {
//		Scanner stdIn = new Scanner(System.in);
//
//		System.out.print("要素数：");
//		int num = stdIn.nextInt();
//		int[] x = new int[num];		// 要素数numの配列
//
//		for (int i = 0; i < num; i++) {
//			System.out.print("x[" + i + "]：");
//			x[i] = stdIn.nextInt();
//		}
//
//		System.out.print("探す値：");		// キー値の読込み
//		int ky = stdIn.nextInt();
//
        int [] x = {6, 4, 3, 2, 1, 9, 8};
        int num = x.length;
        //int ky = 55;
        int ky = 3;
        //int ky = 11;
		int idx = seqSearch(x, num, ky);	// 配列xから値がkyの要素を探索

		if (idx == -1)
			System.out.printf("%dは存在しません。\n",ky);
		else
			System.out.printf("%dはx[" + idx + "]にあります。\n", ky);
	}
}
