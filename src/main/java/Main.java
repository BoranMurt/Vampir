import java.util.*;

public class Main {
    public static void main(String[] args) {
        Players player = new Players();
        MatchRoles matchRoles = new MatchRoles();
        RandomRoles randomRoles = new RandomRoles();
        DeliRole deliRole = new DeliRole();
        RoleOrder roleOrder1 =new RoleOrder();
        ArrayList<String> changedRolesList = new ArrayList<>();
        Random random = new Random();


        player.setPlayersName();
        ArrayList<String> playersName= player.getPlayersNameList();
        randomRoles.joinAllList();
        System.out.println("*********************************************************");

        ArrayList<String> withDeliGoodRoles = randomRoles.getRandomRolesList();

        for (String withDeliGoodRole : withDeliGoodRoles) {
            String changer = deliRole.chanceDeliRoles(withDeliGoodRole);
            changedRolesList.add(changer);
        }
        HashMap<String, String> matchRoles1 = matchRoles.setPlayersRoles(changedRolesList);
        System.out.println(matchRoles1);
        ArrayList<String> playTime= roleOrder1.setRoleOrder();
        HashMap<String,Integer> playerHealth= matchRoles.setPlayerHealth();

        for(int i=0; i<playersName.size();i++){
            Scanner myObj2 = new Scanner(System.in);
            int min = 0;
            int max = 1;
            ArrayList<String> deliRandomResponse = new ArrayList<>();
            deliRandomResponse.add("Pozitif");
            deliRandomResponse.add("Negatif");
            String deli="Deli";
            String buyucu =playTime.get(0);
            String hirsiz=playTime.get(1);
            String vampir=playTime.get(2);
            String avci=playTime.get(3);
            String ispiyoncu=playTime.get(4);
            String doktor=playTime.get(5);

            String victim=playersName.get(i);
            String victimRole=matchRoles1.get(victim);
            System.out.println(victim +"-->"+" Bu akşam kime gideceksin?:");
            String innocent = myObj2.nextLine();

            if(victimRole.contains(buyucu)){ //büyücü
                if(!victimRole.contains(deli)){
                    playerHealth.put(innocent,playerHealth.get(innocent)+1);
                }
            }
            if(victimRole.contains(hirsiz)){ //hirsiz
                playerHealth.put(innocent,playerHealth.get(innocent)-1);
            }
            if(victimRole.contains(vampir)){ //vampir
                playerHealth.put(innocent,playerHealth.get(innocent)-1);
            }
            if(victimRole.contains(avci)){ //avci
                if(!victimRole.contains(deli)){
                    if(innocent.contains(vampir)){//rol yerine isim de arıyor innocentın rolünü yazdır.
                        System.out.println("Avcı'ya pozitif yollandı");
                    }
                    else {
                        System.out.println("Avcı'ya negatif yollandı");
                    }
                }
                if(victimRole.contains(deli)){
                    int picker = random.nextInt(max + min) + min;
                    String deliResponse= deliRandomResponse.get(picker);
                    System.out.println("Avcıya random "+deliResponse+" yollandı.");

                }
            }
            if(victimRole.contains(ispiyoncu)){ //ispiyoncu
                //yapılacak
                if(!victimRole.contains(deli)){
                    System.out.println("Oyuncu " +innocent+" rolünü öğrendi");;
                }
            }
            if(victimRole.contains(doktor)){ //doktor
                playerHealth.put(innocent,0);
            }
            System.out.println(playerHealth);
        }
        /*
        for(int i=0;i<playerHealth.values().size();i++){

        }
*/
    }
}




