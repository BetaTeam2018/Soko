package skeleton_menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	private static final List<String> menuList;
	static {
		menuList = new ArrayList<String>();
		menuList.add("A j�t�kos �res mez�re l�pjen!");
		menuList.add("A j�t�kos csap�ajt�ra l�pjen!");
		menuList.add("A j�t�kos c�lhelyre l�pjen");
		menuList.add("A j�t�kos kapcsol�mez�re l�pjen!");
		menuList.add("A j�t�kos menjen neki a falnak!");
		menuList.add("?");
		
		//@Ferenc9 begin
		menuList.add("A j�t�kos egy l�d�t tol"); // number 7
		menuList.add("A j�t�kos j�t�kost tol.");
		menuList.add("A l�d�k a padl�n tol�dnak."); // Eredeti: A l�da padl�ra tol�dik
		menuList.add("A l�da lyukra tol�dik.");
		menuList.add("A j�t�kos egy l�d�t tol"); // number 11
		//Ferenc9 end
		//@csiki100 begin
		menuList.add("A l�da c�lhelyre ker�l");
		menuList.add("A l�da kapcsol�ra ker�l");
		menuList.add("A l�da falnak tol�dik");
		menuList.add("a l�da j�t�kost tol");
		
		// TODO: add more list items
	}
	public static void printMenuList() {
		int i = 1;
		System.out.println("�rja be a tesztelni k�v�nt teszteset sorsz�m�t! \n");
		for (String item : menuList) {
			System.out.println(i++ + ". " + item);
		}
		System.out.println("------------------------------------------------- \n");
	}
	
	public static int readListNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sorsz�m: ");
		return sc.nextInt();
	}
	
	public static void notFoundListNumErrorMessage() {
		System.out.println("Error: �rv�nytelen sorsz�m! \n");
	}
	
}
