
package programozasifeladatokosszefoglalo;

import java.util.Scanner;

public class ProgramozasiFeladatokOsszefoglalo {

    private static int szam;
    private static Scanner sc = new Scanner (System.in);
    private static int elsoSzam;
    private static int masodikSzam;
    private static int harmadikSzam;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Szambekeres1();
       Masodikfeladat2();
       HarmadikFeladat3();
       NegyedikFeladat4();
       OtodikFeladat5();
        
    }

    private static void Szambekeres1() {
         System.out.print("Kérek egy számot!");
         elsoSzam = sc.nextInt();       
         
       
    }

    private static void Masodikfeladat2() {
       masodikSzam = sc.nextInt();
      if (!((szam>=5) && (szam <=30))) {
      System.out.println("Hiba nem megfelelő a szám!");
    }
    }

    private static void HarmadikFeladat3() {
        
        System.out.print("Kérek egy számot 5 és 30 között!");
        harmadikSzam = sc.nextInt();
      while (!((szam>=5) && (szam <=30))) {
        System.out.println("Hiba nem megfelelő a szám!");
           szam = sc.nextInt();
        
    }
    
}

    private static void NegyedikFeladat4() {
        Scanner myObj = new Scanner(System.in);  
    System.out.println("Írd le a keresztnevedet!: ");
    String userName = myObj.nextLine();  
    
    }

    private static void OtodikFeladat5() {
    Scanner myObj = new Scanner(System.in);  
    System.out.println("Írd le a nevedet szóközzel!");

    String userName = myObj.nextLine();  
    System.out.println("A vezetékneved " + userName);  
    }
}
