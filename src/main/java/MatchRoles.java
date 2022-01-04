import java.util.ArrayList;
import java.util.HashMap;

public class MatchRoles {
    public ArrayList<String> rolesWithDeli;
    //Match Roles and Players
    public HashMap<String,String> setPlayersRoles(ArrayList<String> players){
        HashMap<String,String> matchedList = new HashMap<String,String>();
        RandomRoles randomRoles = new RandomRoles();
        Players players1= new Players();
        ArrayList<String> roles = randomRoles.joinAllList();
        players=players1.getPlayersNameList();
        for (int i=0;i<players.size();i++){
        matchedList.put(players.get(i),roles.get(i));
        }
        rolesWithDeli=roles;
        return matchedList;
    }
    public HashMap<String,String> setFinalRoles(ArrayList<String> playerNames,ArrayList<String> last){
        HashMap<String,String> finallyfinallyList = null;
        for(int i=0;i<playerNames.size();i++){
            finallyfinallyList.put(playerNames.get(i),last.get(i));
        }
        return finallyfinallyList;
    }

}
