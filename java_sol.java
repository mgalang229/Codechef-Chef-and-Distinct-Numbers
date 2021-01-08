import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int tt = in.nextInt();
		for (int qq = 1; qq <= tt; qq++) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			Arrays.sort(a);
			boolean checker = false;
			for (int i = 0; i < n - 1; i++) {
				if (a[i] == a[i + 1]) {
					checker = true;
					break;
				}
			}
			System.out.println(checker ? "Yes" : "No");
		}
	}
}
