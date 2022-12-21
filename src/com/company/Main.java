package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // write your code here
        File file = new File("C:\\Users\\wojta\\Desktop\\SKRYPTY\\studia\\Advent04\\src\\input.txt");


        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st = null;
        String firstElf = null, secondElf = null;
        int punkty = 0;
        int punkty2 = 0;

        while (true) {
            try {
                if ((st = br.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            String[] elf = st.split("-|,");
            for(int i = 0; i <=3; i++){
            //    System.out.println("Wartosc od " + i + " podzial: " + elf[i] );
            }
            int t1 = Integer.parseInt(elf[1]),
                    b1 = Integer.parseInt(elf[0]),
                    t2 = Integer.parseInt(elf[3]),
                    b2 = Integer.parseInt(elf[2]);
            int roznica = t1 - b1;
            int roznica2 = t2 - b2;
            if(roznica >= roznica2) {
                if (t1 >= t2 && b1 <= b2) {
                    punkty = punkty + 1;
                }
            }
            if(roznica < roznica2){
                if(t2 >= t1 && b2 <= b1) {
                    punkty = punkty + 1;
                }
            }
            if(roznica >= roznica2){
                //drugi musi sie znajdowac w
                if( b2 >= b1 && b2 <= t1)punkty2 = punkty2 + 1;
                else {
                    if (t2 >= b1 && t2 <= t1) punkty2 = punkty2 + 1;
                }
            }
            if(roznica2 > roznica){
                if( b1 >= b2 && b1 <= t2)punkty2 = punkty2 + 1;
                else {
                    if (t1 >= b2 && t1 <= t2) punkty2 = punkty2 + 1;
                }
            }





        }
        System.out.println("Suma punktow dla pierwszego zadania: " + punkty);
        System.out.println("Suma punktow dla drugiego zadania: " + punkty2);
    }

}


