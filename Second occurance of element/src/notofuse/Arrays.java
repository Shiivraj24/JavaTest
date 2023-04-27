package notofuse;

import java.util.Scanner;

public class Arrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
        int size = str.length();
		char ch = sc.next().charAt(0);
		int count = 0;
		char[] ch1 = new char[size];

		for (int i = size- 1, j=0 ; i >= 0; i--,j++) {
			ch1[j] = str.charAt(i);
		}

		for (int i =0 ; i < ch1.length; i++) {
			if (ch1[i] == ch) {
				count++;
			}

			if (count == 2) {
				System.out.println("char found at index " + i);
				break;
			}
		}

		if (count == 0)
			System.out.println("char not found");
		else if (count == 1)
			System.out.println("char found only once");

	}
}
