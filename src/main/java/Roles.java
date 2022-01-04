import java.util.ArrayList;
import java.util.Scanner;

public class Roles {

    //Set Good Roles
    public ArrayList<String> setGoodRoles(){
        ArrayList<String> goodRoles = new ArrayList<String>();
        goodRoles.add("deli");
        goodRoles.add("ispiyoncu");
        goodRoles.add("avcı");
        goodRoles.add("büyücü");
        goodRoles.add("doktor");
        System.out.println("***********İyi roller*********");
        for (int i = 0; i < goodRoles.size(); i++) {
            System.out.println(goodRoles.get(i));
        }
        return goodRoles;
    }

    //Set Bad Roles
    public ArrayList<String> setBadRoles(){
        ArrayList<String> badroles = new ArrayList<String>();
        badroles.add("vampir");
        System.out.println("***********Kötü Roller*********");
        for (int i = 0; i < badroles.size(); i++) {
            System.out.println(badroles.get(i));
        }
        return badroles;
    }

    //Set Neutral Roles
    public ArrayList<String> setNeutralRoles(){
        ArrayList<String> neutralRoles = new ArrayList<String>();
        neutralRoles.add("hırsız");
        neutralRoles.add("bombacı");
        neutralRoles.add("seri katil");
        neutralRoles.add("survivor");
        System.out.println("***********Tarafsız Roller*********");
        for (int i = 0; i < neutralRoles.size(); i++) {
            System.out.println(neutralRoles.get(i));        }
        System.out.println("**********************************");
        return neutralRoles;
    }

}
