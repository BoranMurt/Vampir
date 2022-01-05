import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Players player = new Players();
        MatchRoles matchRoles = new MatchRoles();
        RandomRoles randomRoles = new RandomRoles();
        DeliRole deliRole = new DeliRole();
        RoleOrder roleOrder =new RoleOrder();
        ArrayList<String> changedRolesList = new ArrayList<>();

        player.setPlayersName();
        randomRoles.joinAllList();
        System.out.println("*********************************************************");

        ArrayList<String> withDeliGoodRoles = randomRoles.getRandomRolesList();

        for (String withDeliGoodRole : withDeliGoodRoles) {
            String changer = deliRole.chanceDeliRoles(withDeliGoodRole);
            changedRolesList.add(changer);
        }
        HashMap<String, String> matchRoles1 = matchRoles.setPlayersRoles(changedRolesList);
        System.out.println(matchRoles1);
        roleOrder.setRoleOrder();


    }
}




