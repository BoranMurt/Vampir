import java.util.Scanner;

public class RolesNumber {

    //Set Good Roles Number
    public Integer setGoodRolesNumber() {
        Scanner myObj3 = new Scanner(System.in);
        System.out.println("İyi rol sayısı: ");
        String goodNumber = myObj3.nextLine();
        int goodRolesNumber = Integer.parseInt(goodNumber);
        System.out.println("Belirlenen İYİ rol sayısı: " + goodRolesNumber);
        return goodRolesNumber;
    }

    //Set Bad Roles Number
    public Integer setBadRolesNumber() {
        Scanner myObj4 = new Scanner(System.in);
        System.out.println("Kötü rol sayısı: ");
        String badNumber = myObj4.nextLine();
        int badRolesNumber = Integer.parseInt(badNumber);
        System.out.println("Belirlenen KÖTÜ rol sayısı: " + badRolesNumber);
        return badRolesNumber;
    }

    //Set Neutral Roles Number
    public Integer setNeutralRolesNumber() {
        Scanner myObj5 = new Scanner(System.in);
        System.out.println("Tarafsız rol sayısı: ");
        String neutralNumber = myObj5.nextLine();
        int neutralRolesNumber = Integer.parseInt(neutralNumber);
        System.out.println("Belirlenen TARAFSIZ rol sayısı: " + neutralRolesNumber);
        return neutralRolesNumber;
    }
}
