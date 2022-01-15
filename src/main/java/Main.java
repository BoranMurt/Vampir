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


        player.setPlayersName();                                    //Oyuncu sayıları ve Oyuncu İsimleri kullanıcıdan alındı.
        ArrayList<String> playersName= player.getPlayersNameList(); //Oyuncu Listesi alındı.
        randomRoles.joinAllList();                                  //Roller Delinin rolü atanmamış haliyle oluşturuldu ve birleştirildi.
        ArrayList<String> withDeliGoodRoles = randomRoles.getRandomRolesList(); //Rol listesi alındı.

        System.out.println("*********************************************************");
        //Deliye rolü eklenen for döngüsü
        for (String withDeliGoodRole : withDeliGoodRoles) {
            String changer = deliRole.chanceDeliRoles(withDeliGoodRole);
            changedRolesList.add(changer);
        }

        System.out.println("Karışmadan önce:"+changedRolesList);

        long seed = System.nanoTime();
        Collections.shuffle(changedRolesList, new Random(seed)); //Son halindeki Rol listesi karıştırıldı.

        System.out.println("Karıştıktan sonra:"+changedRolesList);

        HashMap<String, String> matchRoles1 = matchRoles.setPlayersRoles(changedRolesList);//Oyuncular ve roller birleşti
        System.out.println(matchRoles1);

        ArrayList<String> playTime= roleOrder1.setRoleOrder();              //Oynanış sırası listesi alındı.
        String deli = "Deli";
        String seriKatil = playTime.get(0);
        String survivor = playTime.get(1);
        String buyucu = playTime.get(2);
        String hirsiz = playTime.get(3);
        String vampir = playTime.get(4);
        String avci = playTime.get(5);
        String bombaci = playTime.get(6);
        String doktor = playTime.get(7);
        String ispiyoncu = playTime.get(8);
        HashMap<String,Integer> playerHealth= matchRoles.setPlayerHealth(); //Oyuncuların Health Hashmap'i alındı.

        LinkedHashMap<String,String> linkedList= new LinkedHashMap<>();
        LinkedHashMap<String,Integer> playerBombCount=new LinkedHashMap<>();

        for (String t: matchRoles1.keySet()){
            if(matchRoles1.get(t).contains(seriKatil)){
                linkedList.put(t,matchRoles1.get(t));
            }
        }
        for (String t: matchRoles1.keySet()){
            if(matchRoles1.get(t).contains(survivor)){
                linkedList.put(t,matchRoles1.get(t));
            }
        }
        for (String t: matchRoles1.keySet()){
            if(matchRoles1.get(t).contains(buyucu)){
                linkedList.put(t,matchRoles1.get(t));
            }
        }
        for (String t: matchRoles1.keySet()){
            if(matchRoles1.get(t).contains(hirsiz)){
                linkedList.put(t,matchRoles1.get(t));
            }
        }
        for (String t: matchRoles1.keySet()){
            if(matchRoles1.get(t).contains(vampir)){
                linkedList.put(t,matchRoles1.get(t));
            }
        }
        for (String t: matchRoles1.keySet()){
            if(matchRoles1.get(t).contains(avci)){
                linkedList.put(t,matchRoles1.get(t));
            }
        }

        for (String t: matchRoles1.keySet()){
            if(matchRoles1.get(t).contains(bombaci)){
                linkedList.put(t,matchRoles1.get(t));
            }
        }
        for (String t: matchRoles1.keySet()){
            if(matchRoles1.get(t).contains(doktor)){
                linkedList.put(t,matchRoles1.get(t));
            }
        }
        for (String t: matchRoles1.keySet()){
            if(matchRoles1.get(t).contains(ispiyoncu)){
                linkedList.put(t,matchRoles1.get(t));
            }
        }
        System.out.println("SIRALANMIS LİSTE: "+linkedList);
        ArrayList<String> deliRandomResponse = new ArrayList<>();
        deliRandomResponse.add("Pozitif");
        deliRandomResponse.add("Negatif");
        Scanner myObj2 = new Scanner(System.in);
        int min = 0;
        int max = 2;

// Oynatış zamanı
        for (String s : linkedList.keySet()) {
            String victimRole = linkedList.get(s);
            int survivorKalanKalkanSayisi=2;

            if(victimRole.contains(seriKatil)){
                System.out.println(s + "-->" + " Bu akşam kimi öldüreceksin?"+"Kalan Oyuncular: "+linkedList.keySet());
                String innocent = myObj2.nextLine();
                playerHealth.put(innocent, playerHealth.get(innocent) - 1);
            }

            if (victimRole.contains(survivor) && survivorKalanKalkanSayisi>0 ) { //survivor
                if(playerHealth.get(s)>=0){
                    System.out.println(s + "-->" + " Bu akşam kalkanını kullanıcak mısın?(evet/hayır):");
                    String response = myObj2.nextLine();
                    if(response.contains("evet")){
                        playerHealth.put(s, playerHealth.get(s) + 1);
                        --survivorKalanKalkanSayisi;
                        System.out.println("Kalkan kullanıldı. Kalan kalkan Sayısı: "+survivorKalanKalkanSayisi);
                    }
                    else{
                        System.out.println("Kalkan kullanılmadı. Kalan kalkan Sayısı: "+survivorKalanKalkanSayisi);
                    }
                }
                else {
                    System.out.println(s + "-->" + " Her gecenin sabahı olmaz! Ama belki olur beklemen lazım.");
                }
            }

            if (victimRole.contains(buyucu)) { //büyücü
                if(playerHealth.get(s)>=0){
                    if (!victimRole.contains(deli)) {
                        System.out.println(s + "-->" + " Bu akşam kimi koruyacaksın?:\n"+"Kalan Oyuncular: "+linkedList.keySet());
                        String innocent = myObj2.nextLine();
                        if(playerHealth.get(innocent)>=0){
                            playerHealth.put(innocent, playerHealth.get(innocent) + 1);
                        }
                    }
                    else{
                        System.out.println(s + "-->" + " Bu akşam kimi koruyacaksın?:\n"+"Kalan Oyuncular: "+linkedList.keySet());
                        String innocent = myObj2.nextLine();
                    }
                }
                else {
                    System.out.println(s + "-->" + " Her gecenin sabahı olmaz! Ama belki olur beklemen lazım.");
                }
            }

            if (victimRole.contains(hirsiz)) { //hirsiz
                if(playerHealth.get(s)>=0){
                    System.out.println(s + "-->" + " Bu akşam birin rolünü çalacak mısın?(evet/hayır)\n(Kullanmak zorunda değilsin):");
                    String response = myObj2.nextLine();
                    if(response.contains("evet")){
                        System.out.println(s + "-->" + " Kimin rolünü çalacaksın?:\n"+"Kalan Oyuncular: "+linkedList.keySet());
                        String innocent = myObj2.nextLine();
                        if(playerHealth.get(innocent)<=0){
                            playerHealth.put(response, playerHealth.get(innocent) - 1);
                            linkedList.put(s, linkedList.get(innocent));
                            System.out.println(s + "-->" + " Yeni rolün: "+linkedList.get(s));
                        }
                        else{
                            System.out.println("Rolü çalamadın. Hakkını sonraki gecelerde kullanabilirsin.");
                        }
                    }
                    else {
                        System.out.println("Hakkını harcamadın sonraki gecelerde kullanabilirsin.");
                    }
                }
                else {
                    System.out.println(s + "-->" + " Her gecenin sabahı olmaz! Ama belki olur beklemen lazım.");
                }
            }

            if (victimRole.contains(vampir)) { //vampir
                if(playerHealth.get(s)>=0){
                    System.out.println(s + "-->" + " Bu akşam kimi öldüreceksin?"+"Kalan Oyuncular: "+linkedList.keySet());
                    String innocent = myObj2.nextLine();
                    playerHealth.put(innocent, playerHealth.get(innocent) - 1);
                }
                else {
                    System.out.println(s + "-->" + " Her gecenin sabahı olmaz! Ama belki olur beklemen lazım.");
                }
            }

            if (victimRole.contains(avci)) { //avci
                if(playerHealth.get(s)>=0){
                    System.out.println(s + "-->" + " Bu akşam kimi soracaksın?:\n"+"Sorabileceğin Oyuncular: "+linkedList.keySet());
                    String innocent = myObj2.nextLine();
                    if (!victimRole.contains(deli)) {
                        if (linkedList.get(innocent).contains(vampir)) {
                            System.out.println(s + "-->" + " Avcı'ya pozitif yollandı");
                        } else {
                            System.out.println(s + "-->" + " Avcı'ya negatif yollandı");
                        }
                    }
                    if (victimRole.contains(deli)) {
                        int picker = random.nextInt(max + min) + min;
                        String deliResponse = deliRandomResponse.get(picker);
                        System.out.println("Avcıya random " + deliResponse + " yollandı.");
                    }
                }
                else {
                    System.out.println(s + "-->" + " Her gecenin sabahı olmaz! Ama belki olur beklemen lazım.");
                }
            }

            if (victimRole.contains(bombaci)) { //bombacı
                if(playerHealth.get(s)>=0){
                    System.out.println(s + "-->" + " Bu akşam bomba mı koyacaksın, patlatıcak mısın?(bombala/patlat):");
                    String response = myObj2.nextLine();
                    if(response.contains("bombala")){
                        System.out.println(s + "-->" + " Kime bomba koyucaksın?:");
                        String response2= myObj2.nextLine();
                        //bomba HashMapi olacak, arttırılacak.
                        System.out.println("yapım aşamasında");
                    }
                    if(response.contains("patlat")){
                        System.out.println("inprogress");
                    }
                    else {
                        System.out.println("geçersiz işlem");
                    }
                }
                else {
                    System.out.println(s + "-->" + " Her gecenin sabahı olmaz! Ama belki olur beklemen lazım.");
                }
            }

            if (victimRole.contains(doktor)) { //doktor
                if(playerHealth.get(s)>=0){
                    System.out.println(s + "-->" + " Kimi dirilticeksin?\n"+"Oyuncular: "+linkedList.keySet());
                    String innocent = myObj2.nextLine();
                    if(playerHealth.get(innocent)<0){
                        playerHealth.put(innocent, 0);
                        System.out.println(s + "-->" + " Oyuncuyu dirilttin");
                    }
                    else{
                        playerHealth.put(innocent, 0);
                        System.out.println(s + "-->" + " Oyuncuyu diriltmedin. Çay içip döndün.");
                    }
                }
                else {
                    System.out.println(s + "-->" + " Her gecenin sabahı olmaz! Ama belki olur beklemen lazım.");
                }
            }
            if (victimRole.contains(ispiyoncu)) { //ispiyoncu
                if(playerHealth.get(s)>=0){
                    if (!victimRole.contains(deli)) {
                        System.out.println(s + "-->" + " Kimin rolünü öğrenmek istiyorsun?:\n"+"Sorabileceğin Oyuncular: "+linkedList.keySet());
                        String innocent = myObj2.nextLine();
                        System.out.println(s + "-->" + " Oyuncu " + innocent + " rolünü öğrendi");
                        System.out.println(innocent+" rolü: "+ linkedList.get(innocent));
                    }
                }
                else {
                    System.out.println(s + "-->" + " Her gecenin sabahı olmaz! Ama belki olur beklemen lazım.");
                }
            }
            System.out.println(playerHealth);
            //seri katilin öldüğü kişiyi büyücü diriltiyormuş gibi oldu.Düzelt bunu
        }
    }
}




