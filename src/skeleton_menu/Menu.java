package skeleton_menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final List < String > menuList;
	//private static Scanner sc = new Scanner(System.in);
    static {

        // @kristofgyori begin
        menuList = new ArrayList < String > ();
        menuList.add("Kilépés a Szkeletonból\n");
        menuList.add("A játékos üres mezõre lépjen!"); // 
        menuList.add("A játékos lyukra lépjen!"); //  
        menuList.add("A játékos csapóajtóra lépjen!"); // 
        menuList.add("A játékos célhelyre lépjen"); //  
        menuList.add("A játékos kapcsolómezõre lépjen!"); // 	
        menuList.add("A játékos menjen neki a falnak!\n"); // 
        // @ kristofgyori end

        //@Ferenc9 begin
        menuList.add("A játékos egy ládát tol"); // number 7
        menuList.add("A játékos játékost tol.");
        menuList.add("A ládák a padlón tolódnak."); // Eredeti: A láda padlóra tolódik
        menuList.add("A láda lyukra tolódik.");
        menuList.add("A láda csapóajtóra kerül\n"); // number 11
        //Ferenc9 end

        //@csiki100 begin
        menuList.add("A láda célhelyre kerül");
        menuList.add("A láda kapcsolóra kerül");
        menuList.add("A láda falnak tolódik");
        menuList.add("A láda játékost tol");
        menuList.add("A láda letolódik a kapcsolóról");
        menuList.add("A láda letolódik a célhelyrol");
        //csiki100 end
        // TODO: add more list items
    }
    public static void printMenuList() {
        int i = 0;
        System.out.println("Írja be a tesztelni kívánt teszteset sorszámát! \n");
        for (String item: menuList) {
            //System.out.println(i++ + ".\t" + item);
            System.out.printf("%-4s%s%n", i++ + ".", item);
        }
        System.out.println("=================================================\n");
    }

    public static int readListNumber() {
    	Scanner scanner = null;
    	try {
    	    scanner = new Scanner(System.in);
    	    System.out.print("Sorszám: ");
            
            return scanner.nextInt(); 
    	}
    	finally {
    	    if(scanner!=null);
    	      //  scanner.close();
    	}
    }

    public static void notFoundListNumErrorMessage() {
        System.err.println("Error: Érvénytelen sorszám! \n");
    }
    
  
}