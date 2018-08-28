import java.util.*;

public class Sample {
    static String[][] rank;
    static void printRank(String [][] r) {
        for (String[] a : r) {
            System.out.println(a[0] + " " + a[1] + " " + a[2]);
        }
    }
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        rank = new String[N][];
        for (int i = 0; i < N; i++) {
            String s = sc.next();
            String[] array = s.split(",");
            rank[i] = array;
        }
        System.out.println("ソート前");
        printRank(rank);
    }
}
