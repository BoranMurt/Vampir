import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Players player = new Players();
        Roles roles = new Roles();
        MatchRoles matchRoles = new MatchRoles();


        roles.setGoodRoles();
        roles.setBadRoles();
        roles.setNeutralRoles();
        ArrayList<String> players = player.setPlayersName();
        HashMap<String, String> matchRoles1 = matchRoles.setPlayersRoles(players);

        System.out.println("*********************************************************");
        System.out.println(matchRoles1);
        /*
        //deli role
        ArrayList<String> stupidMethod = randomRoles.getRandomRolesList();
        if(stupidMethod.contains("deli"))
        {
        ArrayList<String> finalRoles= deliRole.defineDeliRole();
        HashMap<String,String> gameRoles1=matchRoles.setFinalRoles(players,finalRoles);
            System.out.println(gameRoles1);
        }

        HashMap<String,String> gameRoles=matchRoles.setFinalRoles(players,finalRoles);
        System.out.println(gameRoles);
*/
    }
}




