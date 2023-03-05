package FinalProgekt;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class MainToysPrank {

    public static void main(String[] args) throws IOException {
      boolean b=true;


            BufferedWriter writer = new BufferedWriter(new FileWriter("result.txt"));



        System.out.println("Сформируем наш набор игрушек");
        ToyCollection toyCollection=new ToyCollection();
        ToysPranc pranc=new ToysPranc();
        Map<String,Integer>toysmap=toyCollection.maptoys(toyCollection.toyCollections());
       Map<Integer,String>toysetmap=toyCollection.idToysMap(toysmap);
        List<Integer>idlist=new ArrayList<>();


        System.out.println("Получаем следующий набор игрушек");
        for (Map.Entry<Integer,String>toyset:toysetmap.entrySet()
             ) {

            System.out.println("номер - "+toyset.getKey()+" игрушка "+toyset.getValue());
            writer.write("номер - "+toyset.getKey()+" игрушка "+toyset.getValue()+"\n");
           idlist.add(toyset.getKey());
        }
       System.out.println("Начинаем розыгрыш игрушек");
       ParticipantCollections participantCollections =new ParticipantCollections();


       while (b==true) {
           System.out.println("Определим колличество участников розыгрыша");
           int particant = participantCollections.getIdOfParticipants(idlist.size());// колличество участников
           writer.write("\n\n");
           System.out.println("Составим список участников");
           Map<Integer, String> participantmap = participantCollections.mapparticipant(particant);
           while (participantmap.size() > 0) {
               System.out.println("Определим номер и участника,");
               ArrayList<Integer> listparticipant = pranc.getIdList(participantmap);
               int idparticipant = pranc.getIdCollection(listparticipant);
               String valueparticipant = pranc.stringCollection(participantmap, idparticipant);
               System.out.println("Определим номер и игрушку");
               ArrayList<Integer> listtoys = pranc.getIdList(toysetmap);
               int idtoys = pranc.getIdCollection(listtoys);
               String valuetoys = pranc.stringCollection(toysetmap, idtoys);
               System.out.println("Участник " + valueparticipant + " Под номером " + idparticipant + " Получает "
                       + valuetoys + " Под номером " + idtoys);
               writer.write("Участник " + valueparticipant + " Под номером " + idparticipant + " Получает "
                       + valuetoys + " Под номером " + idtoys+"\n");
               participantmap = pranc.getCollectionmap(participantmap, idparticipant);
               toysetmap = pranc.getCollectionmap(toysetmap, idtoys);

           }
           writer.write("\n\n");
           writer.write("Оставшийся список игрушек\n");
           System.out.println("Оставшийся список игрушек");
           toysetmap = pranc.sortmap(toysetmap);
           pranc.listtoys(toysetmap);
           for (Map.Entry<Integer,String>entry:toysetmap.entrySet()
                ) {
               writer.write("Номер "+entry.getKey()+" Игрушка "+entry.getValue()+"\n");
           }
           System.out.println("Для того, чтобы добавить игрушку жмите 1, нет любую другую клавишу");
           Scanner scanner = new Scanner(System.in);
           String str = scanner.nextLine();


           if (str.equals("1")) {
               Map<Integer,String>toysetmap1=new HashMap<>();
               toysetmap1.putAll(toysetmap);
               toysetmap=pranc.addmap(toysetmap);
               System.out.println(toysetmap1.size());
               System.out.println(toysetmap.size());
               if(toysetmap.size()>toysetmap1.size()){
                    writer.write("Добавим "+String.valueOf(toysetmap.size()-toysetmap1.size())+" игрушек\n");
                   for (Map.Entry<Integer,String>entry:toysetmap.entrySet()
                        ) {
                       if(entry.getKey()>toysetmap1.size()){
                           writer.write("Номер "+entry.getKey()+" Игрушка "+entry.getValue()+"\n");
                       }

                   }

               }

           }


           if (toysetmap.size() < 3) {
               System.out.println("Выходим из розыгрыша , т.к.  подарков слишком мало");
               b = false;
           }
           else
           {
               System.out.println("Выйти из розыгрыша - Нет, жмите 1; - Да , любая другая клавиша");
           str = scanner.nextLine();
           if (!str.equals("1")) {
               b = false;
           }


       }
           idlist=pranc.getIdList(toysetmap);


       }

       writer.flush();
       writer.close();
    }






}
