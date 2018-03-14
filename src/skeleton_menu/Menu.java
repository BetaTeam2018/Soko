package skeleton_menu;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private static final List<String> menuList;
	static {
		menuList = new ArrayList<String>();
		menuList.add("A j�t�kos �res mez�re l�pjen!");
		menuList.add("A j�t�kos csap�ajt�ra l�pjen!");
		menuList.add("A j�t�kos c�lhelyre l�pjen");
		menuList.add("A j�t�kos kapcsol�mez�re l�pjen!");
		menuList.add("A j�t�kos menjen neki a falnak!");
		// TODO: add more list items
	}
	public static void printMenuList() {
		int i = 1;
		System.out.println("�rja be a tesztelni k�v�nt teszteset sorsz�m�t! \n");
		for (String item : menuList) {
			System.out.println(i++ + ". " + item);
		}
		System.out.println("------------------------------------------------- \n \n");
	}
}
