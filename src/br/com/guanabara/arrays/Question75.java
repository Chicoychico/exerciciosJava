package br.com.guanabara.arrays;

public class Question75 {
    public static void main(String[] args) {
        int [] arrays = new int[16];
        arrays [0] = 1;
        arrays [1]= 1;
        System.out.println("F I B O N A C C I");
        for(int i = 2; i< arrays.length; i++){
            arrays[i]=arrays[0]+arrays[1];
            arrays[0]=arrays[1];
            arrays[1]=arrays[i];
            if(i==15){
                arrays [0] = 1;
                arrays [1]= 1;
            }
        }

        for( int num : arrays){
            System.out.print(num+" | ");
        }

        for(int i = 0; i< arrays.length;i++){
            arrays[i]=i;
        }

        System.out.println("\nVetores: ");
        for(int num: arrays){
            System.out.print(num + " | ");
        }
    }
}
