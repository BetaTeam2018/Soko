package skeleton_menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private static final List<String> menuList;
	static {
		
		// @kristofgyori begin
		menuList = new ArrayList<String>();
		menuList.add("Kilépés a Szkeletonból");
		menuList.add("A játékos üres mezõre lépjen!");
		menuList.add("A játékos lyukra lépjen!");
		menuList.add("A játékos csapóajtóra lépjen!");
		menuList.add("A játékos célhelyre lépjen");
		menuList.add("A játékos kapcsolómezõre lépjen!");
		menuList.add("A játékos menjen neki a falnak!");
		// @ kristofgyori end
		
		//@Ferenc9 begin
		menuList.add("A játékos egy ládát tol"); // number 7
		menuList.add("A játékos játékost tol.");
		menuList.add("A ládák a padlón tolódnak."); // Eredeti: A láda padlóra tolódik
		menuList.add("A láda lyukra tolódik.");
		menuList.add("A játékos egy ládát tol"); // number 11
		//Ferenc9 end
		//@csiki100 begin
		menuList.add("A láda célhelyre kerül");
		menuList.add("A láda kapcsolóra kerül");
		menuList.add("A láda falnak tolódik");
		menuList.add("a láda játékost tol");
		
		// TODO: add more list items
	}
	public static void printMenuList() {
		int i = 0;
		System.out.println("Írja be a tesztelni kívánt teszteset sorszámát! \n");
		for (String item : menuList) {
			System.out.println(i++ + ". " + item);
		}
		System.out.println("=================================================\n");
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
