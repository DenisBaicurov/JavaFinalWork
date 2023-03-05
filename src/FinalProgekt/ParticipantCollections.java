package FinalProgekt;

import java.util.*;

public class ParticipantCollections {
   int participant;



    public  int getIdOfParticipants(int size){
        System.out.println("Введите количество участников розыгыша,не меньше 3 и не больше колличества призов - " + size);
        Scanner scanner=new Scanner(System.in) ;
     try {
         participant=scanner.nextInt();
     }
     catch (InputMismatchException e){
         System.err.println("Неверный ввод числа");
         System.out.println("Повторите ввод");
         getIdOfParticipants(size);

     }
     if (participant<0){
         System.err.println("Колличество участников не должно быть отрицательным");
         System.out.println("Повторите ввод");
         getIdOfParticipants(size);

     }
        if (participant<3){
            System.err.println("Колличество участников слишком маленькое");
            System.out.println("Повторите ввод");
            getIdOfParticipants(size);
        }

     if (participant>size){
         System.err.println("Колличество участников не должно быть больше колличества призов");
         System.out.println("Повторите ввод");
         getIdOfParticipants(size);
     }


      return participant;
    }

    public Map<Integer,String>mapparticipant(int  participant){

        Map<Integer,String>participantmap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите данные участников розыгрыша - фам.,имя,возраст ");
        for (int i=1;i<=participant;i++){

            System.out.println("Вводим участника");
            String part=scanner.nextLine();
            participantmap.put(i,part);

        }

        return participantmap;
    }











}
