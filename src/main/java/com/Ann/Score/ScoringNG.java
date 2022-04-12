package com.Ann.Score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] name ={"Ann","Jerry","Tiffany","Silviya","Minny"};
        int[] englishes ={85,79,83,88,95};
        int[] maths={98,75,39,60,58};
        for(int i = 0; i < 5 ;i++){
            System.out.println(name[i]+"\t"+englishes[i]+"\t"+maths+"\t"+(englishes[i]+maths[i])/2);
        }
    }
}
