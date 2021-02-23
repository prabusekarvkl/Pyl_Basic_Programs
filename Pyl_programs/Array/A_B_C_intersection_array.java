package Array;

public class A_B_C_intersection_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3,6 };
		int b[] = { 2, 4, 6, 3 };
		int c[] = { 7, 2, 8, 3, 2,6 };
		int d[] = new int[a.length + b.length]; // d.length
		int e[] = new int[c.length + d.length]; // e.length
		int m = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {

					d[m] = b[j];
					m = m + 1;
				}
				
			}
		}

		int n = 0;
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < d.length; j++) {
				if (d[j] == c[i]) {
					e[n] = c[i];
					n = n + 1;
				}

			}
		}

		for (int i = 0; i < e.length; i++) {
			for (int j = i + 1; j < e.length; j++) {
				if (e[i] == e[j]) {
					e[i] = 0;
				}

			}
		}

		System.out.println();
		for (int i = 0; i < e.length; i++) {
			if (e[i] != 0)
				System.out.print(e[i] + " ");
		}
	}

}
