import java.util.ArrayList;
import java.util.Random;

public class DeliRole{
    public static int counter;
    public static ArrayList<String> deletedList;
    public static ArrayList<String> addedList;

    public ArrayList<String> defineDeliRole(){
        RandomRoles randomRoles=new RandomRoles();
        ArrayList<String> goodWithDeliList= randomRoles.setRandomGoodRoles();
        int deliCounter=0;

        for(int i=0;i<goodWithDeliList.size();i++){
            String checker= goodWithDeliList.get(i);
            if(checker.equals("deli")){
                goodWithDeliList.remove(i);
                deliCounter++;
            }
            counter=deliCounter;
            deletedList=goodWithDeliList;
        }
        addDeliToRole();
        ArrayList<String> finallyList=addedList;
        finallyList.addAll(deletedList);
     return finallyList;
    }
    public void addDeliToRole(){
        int min = 0;
        int max = deletedList.size();
        Random random = new Random();
        ArrayList<String> randomRole = null;

        for(int i=0;i<counter;i++){
            int picker = random.nextInt(max + min) + min;
            String randoms;
            randoms = deletedList.get(picker);
            String unite="Deli" + randoms;
            randomRole.add(unite);
        }
        addedList=randomRole;

    }
}
