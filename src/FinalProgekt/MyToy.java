package FinalProgekt;

import java.util.Map;

public class MyToy {
     int id;
    private String nametoys;
    private int counttoys;
    private double toyDropProbability;






    public String getNametoys() {
        return nametoys;
    }

    public void setNametoys(String nametoys) {
        this.nametoys = nametoys;
    }

    public int getCounttoys() {
        counttoys=(int)(Math.random() *10)+1;
        return counttoys;
    }



    public double getToyDropProbability() {
        return toyDropProbability;
    }

    public void setToyDropProbability(double toyDropProbability) {
        if(toyDropProbability<0 || toyDropProbability>100){
            System.err.println("Неверное значение для ввода");
            throw new IllegalArgumentException();}
        this.toyDropProbability = toyDropProbability;
    }







}