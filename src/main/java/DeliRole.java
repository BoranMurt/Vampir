import java.util.ArrayList;
import java.util.Random;

public class DeliRole{
    public String chanceDeliRoles(String roles){
        String chancedRole =roles;
        Roles roles1 = new Roles();
        ArrayList<String> delili= roles1.getGoodRoles2();
        delili.remove("deli");
        delili.remove("doktor");
        int min = 0;
        int max = delili.size();
        Random random = new Random();

        if (roles.equals("deli")){
            int picker = random.nextInt(max + min) + min;
            chancedRole = "Deli "+delili.get(picker);
        }
        return chancedRole;
    }


}
