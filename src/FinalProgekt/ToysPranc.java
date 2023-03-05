package FinalProgekt;

import java.util.*;

public class ToysPranc extends ToyCollection{



/*



public Map<Integer,String>getParticipantmap(){
    Map<Integer,String>participantmap=new HashMap<>();
    System.out.println("Создадим список участников, укажите колличество участников, а также введите их данные");
    Scanner scanner=new Scanner(System.in);
count=getCountparticipant();
for (int i=1;i<=count;i++){

    System.out.println("Введите данные участника");
    String facts=scanner.nextLine();
    participantmap.put(i,facts);

}


   return participantmap;
}



*/
public Map<Integer,String>getCollectionmap(Map<Integer,String>collectionmap,int id){

    Map<Integer,String>collectionmap1=new HashMap<>();

    for (Map.Entry<Integer,String> entry:collectionmap.entrySet()
    ) {
        if(entry.getKey()!=id){
            collectionmap1.put(entry.getKey(),entry.getValue());
        }

    }

    return collectionmap1;
}




public int getIdCollection(ArrayList<Integer>listId){

    id=getRandomElement(listId);


 return id;
}



    public  int getRandomElement(ArrayList<Integer> list)
    {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }


    
    public ArrayList<Integer>getIdList(Map<Integer,String>collectionmap){
    ArrayList<Integer>idlist=new ArrayList<>();
        for (Map.Entry<Integer,String>entry:collectionmap.entrySet()
             ) {
            idlist.add(entry.getKey());
        }
    
    return idlist;
    }
    
    

    public String stringCollection(Map<Integer,String>collection,int id){

    String stringvaluemap="";
        for (Map.Entry<Integer,String>entry:collection.entrySet()
             ) {
            if(id==entry.getKey()){
                stringvaluemap=entry.getValue();
            }

        }

    return stringvaluemap;
    }



    public Map<Integer,String>sortmap(Map<Integer,String>collectionmap){

        Map<Integer,String>sortMap=new HashMap<>();
        int id=1;
        for (Map.Entry<Integer,String>entry:collectionmap.entrySet()
             ) {
            sortMap.put(id,entry.getValue());
            id++;
        }



     return sortMap;
    }

    public Map<Integer,String>addmap(Map<Integer,String>collectionmap){

        System.out.println("Для добавления игрушки - Машинки жмите 1");
        System.out.println("Для добавления игрушки - Настольные игры жмите 2");
        System.out.println("Для добавления игрушки - Конструкторы жмите 3");
        System.out.println("Для добавления игрушки - Роботы жмите 4");
        System.out.println("Для добавления игрушки - Куклы жмите 5");
        System.out.println("Для добавления игрушки - Мягкие игрушки жмите 6");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        if(str.equals("1")){collectionmap.put((collectionmap.size()+1),"Машинки");}
        else if(str.equals("2")){collectionmap.put((collectionmap.size()+1),"Настольные игры");}
        else if(str.equals("3")){collectionmap.put((collectionmap.size()+1),"Конструкторы");}
        else if(str.equals("4")){collectionmap.put((collectionmap.size()+1),"Роботы");}
        else if(str.equals("5")){collectionmap.put((collectionmap.size()+1),"Куклы");}
        else if(str.equals("6")){collectionmap.put((collectionmap.size()+1),"Куклы");}
        else {
            System.out.println("Вы ничего не добавили");
        }
        System.out.println("Продолжите добавлять игрушки - Да, жмите 0; - Нет , любая другая клавиша ");
       str=scanner.nextLine();
       if(str.equals("0")){
           addmap(collectionmap);
       }

        return collectionmap;
    }




    public void listtoys(Map<Integer,String>maptoys){

        for (Map.Entry<Integer,String>entry:maptoys.entrySet()
             ) {
            System.out.println(" Номер " + entry.getKey()+ " Игрушка "+ entry.getValue());
        }


    }
    
    
    
    
    
    




}
