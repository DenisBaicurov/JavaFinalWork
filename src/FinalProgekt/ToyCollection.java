package FinalProgekt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ToyCollection extends MyToy {


    public Map<String,Integer>maptoys(ArrayList<String>list){

       Map<String,Integer>toymap=new HashMap<>();
        for (String toy:list
             ) {
            int count=getCounttoys();
            System.out.println(count);
            for(int i=0;i<count;i++)
            {
                toymap.put(toy,i+1);
            }
        }

        for (Map.Entry<String,Integer>map:toymap.entrySet()
             ) {
            System.out.println(map);
        }
   return toymap;
    }


    public ArrayList<String>toyCollections(){
        ArrayList<String>toylist=new ArrayList<>();
        setNametoys("Мягкие игрушки");
        String toy1=getNametoys();
        setNametoys("Куклы");
        String toy2=getNametoys();
        setNametoys("Машинки");
        String toy3=getNametoys();
        setNametoys("Роботы");
        String toy4=getNametoys();
        setNametoys("Конструкторы");
        String toy5=getNametoys();
        setNametoys("Настольные игры");
        String toy6=getNametoys();
        toylist.add(toy1);
        toylist.add(toy2);
        toylist.add(toy3);
        toylist.add(toy4);
        toylist.add(toy5);
        toylist.add(toy6);

        return toylist;
    }




    public ArrayList<String>toyCollectionschoolboy(){

        setNametoys("Роботы");
        String toy1=getNametoys();
        setNametoys("Конструкторы");
        String toy2=getNametoys();
        setNametoys("Настольные игры");
        String toy3=getNametoys();
       ArrayList<String>toylist=new ArrayList<>();
       toylist.add(toy1);
        toylist.add(toy2);
        toylist.add(toy3);

        return toylist;
    }

    public ArrayList<String>toyCollectionspreschooler(){
        setNametoys("Мягкие игрушки");
        String toy1=getNametoys();
        setNametoys("Куклы");
        String toy2=getNametoys();
        setNametoys("Машинки");
        String toy3=getNametoys();
        ArrayList<String>toylist=new ArrayList<>();
        toylist.add(toy1);
        toylist.add(toy2);
        toylist.add(toy3);


        return toylist;
    }


/*public Map<Integer,String>idToysMap(Map<String,Integer>preschoolermap,Map<String,Integer>schoolboymap){

       Map<Integer,String> idtoysmap=new HashMap<>();
       int id=1;
    for (Map.Entry<String,Integer>entry:preschoolermap.entrySet()
         ) {
   for (int i=0;i<entry.getValue();i++){
       idtoysmap.put(id,entry.getKey());
       id++;
   }

    }
    for (Map.Entry<String,Integer>entry:schoolboymap.entrySet()
    ) {
        for (int i=0;i<entry.getValue();i++){
            idtoysmap.put(id,entry.getKey());
            id++;
        }

    }

     return idtoysmap;
}*/


    public Map<Integer,String>idToysMap(Map<String,Integer>toysmap){

        Map<Integer,String> idtoysmap=new HashMap<>();
        int id=1;
        for (Map.Entry<String,Integer>entry:toysmap.entrySet()
        ) {
            for (int i=0;i<entry.getValue();i++){
                idtoysmap.put(id,entry.getKey());
                id++;
            }
        }

        return idtoysmap;
    }







}
