package skeleton_menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private static final List<String> menuList;
	static {
		menuList = new ArrayList<String>();
		menuList.add("A játékos üres mezõre lépjen!");
		menuList.add("A játékos csapóajtóra lépjen!");
		menuList.add("A játékos célhelyre lépjen");
		menuList.add("A játékos kapcsolómezõre lépjen!");
		menuList.add("A játékos menjen neki a falnak!");
		// TODO: add more list items
	}
	public static void printMenuList() {
		int i = 1;
		System.out.println("Írja be a tesztelni kívánt teszteset sorszámát! \n");
		for (String item : menuList) {
			System.out.println(i++ + ". " + item);
		}
		System.out.println("------------------------------------------------- \n");
	}
	
	public static int readListNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sorszám: ");
		return sc.nextInt();
	}
	
	public static void notFoundListNumErrorMessage() {
		System.out.println("Error: Érvénytelen sorszám! \n");
	}
}
