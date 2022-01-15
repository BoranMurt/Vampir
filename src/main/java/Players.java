import java.util.ArrayList;
import java.util.Scanner;

public class Players {
    public static Integer playersNumber;
    public static ArrayList<String> playersNameList;

    //Set Players Number
    public Integer setPlayersNumber(){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Oyuncu sayisi giriniz:");
        String players = myObj.nextLine();
        int players_number =Integer.parseInt((players));
        playersNumber=players_number;
        System.out.println("Oyuncu sayisi: " + players_number);
        return players_number;
    }

    //Set Players Name
    public void setPlayersName(){
        int players_number=setPlayersNumber();
        ArrayList<String> players_name = new ArrayList<>();
        for(int i =0;i<players_number;i++){
            Scanner myObj2 = new Scanner(System.in);
            System.out.println((i+1)+"."+" Oyuncu Adı giriniz:");
            String names = myObj2.nextLine();
            players_name.add(names);
        }
        System.out.println("Oyuncular:");
        for (String s : players_name) {
            System.out.println(s);
        }
        playersNameList=players_name;
    }

    public ArrayList<String> getPlayersNameList(){
        return playersNameList;
    }
}
