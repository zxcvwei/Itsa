import java.util.Scanner;

public class p10055 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while (scn.hasNext()) {
			long me = scn.nextLong();
			long army = scn.nextLong();
			long num;
			if (me <= army) {
				num = army - me;
				System.out.println(num);
			} else {
				num = me - army;
				System.out.println(num);
			}
		}

	}

}
