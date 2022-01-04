import java.util.ArrayList;
import java.util.Random;

public class RandomRoles {
    public static ArrayList<String> randomGoofList;
    public static ArrayList<String> randomBofList;
    public static ArrayList<String> randomNeutrafList;
    public static ArrayList<String> randomFinalList;

    //Set Random Good Roles
    public ArrayList<String> setRandomGoodRoles() {
        Roles roles = new Roles();
        RolesNumber rolesNumber = new RolesNumber();

        ArrayList<String> randomGood = new ArrayList<>();
        ArrayList<String> goodRolesList = roles.setGoodRoles();
        int randomGoodNumber = rolesNumber.setGoodRolesNumber();

        int min = 0;
        int max = goodRolesList.size();
        Random random = new Random();


        for (int i = 0; i < randomGoodNumber; i++) {
            int picker = random.nextInt(max + min) + min;
            String randomRole;
            randomRole = goodRolesList.get(picker);
            randomGood.add(randomRole);
        }
        randomGoofList = randomGood;
        return randomGood;
    }

    //Set Random Bad Roles
    public ArrayList<String> setRandomBadRoles() {
        Roles roles = new Roles();
        RolesNumber rolesNumber = new RolesNumber();

        ArrayList<String> randomBad = new ArrayList<>();
        ArrayList<String> badRolesList = roles.setBadRoles();
        int randomBadNumber = rolesNumber.setBadRolesNumber();

        int min = 0;
        int max = badRolesList.size();
        Random random = new Random();


        for (int i = 0; i < randomBadNumber; i++) {
            int picker = random.nextInt(max + min) + min;
            String randomRole;
            randomRole = badRolesList.get(picker);
            randomBad.add(randomRole);
        }
        randomBofList = randomBad;
        return randomBad;
    }

    //Set Random Neutral Roles
    public ArrayList<String> setRandomNeutralRoles() {
        Roles roles = new Roles();
        RolesNumber rolesNumber = new RolesNumber();

        ArrayList<String> randomNeutral = new ArrayList<>();
        ArrayList<String> neutralRolesList = roles.setNeutralRoles();

        int randomNeutralNumber = rolesNumber.setNeutralRolesNumber();

        int min = 0;
        int max = neutralRolesList.size();
        Random random = new Random();


        for (int i = 0; i < randomNeutralNumber; i++) {
            int picker = random.nextInt(max + min) + min;
            String randomRole;
            randomRole = neutralRolesList.get(picker);
            randomNeutral.add(randomRole);
        }
        randomNeutrafList = randomNeutral;
        return randomNeutral;
    }


    public void joinAllList() {
        ArrayList<String> good = setRandomGoodRoles();
        ArrayList<String> bad = setRandomBadRoles();
        ArrayList<String> neutral = setRandomNeutralRoles();
        good.addAll(bad);
        good.addAll(neutral);
        randomFinalList = good;
    }


    //Get Random Roles List
    public ArrayList<String> getRandomRolesList() {
        return randomFinalList;
    }

}
