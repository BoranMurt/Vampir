import java.util.ArrayList;
import java.util.HashMap;

public class MatchRoles {

    //Match Roles and Players
    public HashMap<String, String> setPlayersRoles(ArrayList<String> finalRole) {
        HashMap<String, String> matchedList = new HashMap<>();
        new RandomRoles();
        Players players1 = new Players();
        ArrayList<String> players = players1.getPlayersNameList();
        for (int i = 0; i < players.size(); i++) {
            matchedList.put(players.get(i), finalRole.get(i));
        }

        return matchedList;
    }

}
