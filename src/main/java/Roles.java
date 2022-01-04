import java.util.ArrayList;

public class Roles {
    public static ArrayList<String> goodRoles2 = null;

    //Set Good Roles
    public ArrayList<String> setGoodRoles() {
        ArrayList<String> goodRoles = new ArrayList<>();
        goodRoles.add("deli");
        goodRoles.add("ispiyoncu");
        goodRoles.add("avcı");
        goodRoles.add("büyücü");
        goodRoles.add("doktor");
        System.out.println("***********İyi roller*********");
        for (String goodRole : goodRoles) {
            System.out.println(goodRole);
        }
        goodRoles2 = goodRoles;
        return goodRoles;
    }

    //Set Bad Roles
    public ArrayList<String> setBadRoles() {
        ArrayList<String> badroles = new ArrayList<>();
        badroles.add("vampir");
        System.out.println("***********Kötü Roller*********");
        for (String badrole : badroles) {
            System.out.println(badrole);
        }
        return badroles;
    }

    //Set Neutral Roles
    public ArrayList<String> setNeutralRoles() {
        ArrayList<String> neutralRoles = new ArrayList<>();
        neutralRoles.add("hırsız");
        neutralRoles.add("bombacı");
        neutralRoles.add("seri katil");
        neutralRoles.add("survivor");
        System.out.println("***********Tarafsız Roller*********");
        for (String neutralRole : neutralRoles) {
            System.out.println(neutralRole);
        }
        System.out.println("**********************************");
        return neutralRoles;
    }

    public ArrayList<String> getGoodRoles2() {
        return goodRoles2;
    }
}
