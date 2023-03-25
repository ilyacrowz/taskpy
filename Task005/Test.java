package main5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
 import java.io.IOException;
import java.io.InputStreamReader;
 import java.util.regex.Pattern;

public class Test {

public static void main(String[] args) {
 try {
     File file = new File("SloveneLexicon.txt");
     FileReader fileReader = new FileReader(file);
     BufferedReader bufferedReader = new BufferedReader(
             new InputStreamReader(
               new FileInputStream(file), "UTF8"));
     String vrstica;
     File test = new File("test.txt");
     FileWriter fw = new FileWriter(test);
     while ((vrstica = bufferedReader.readLine()) != null) {

         String s = vrstica;
         String[] dobi_besedo_v_vrstici = s.split("\\s+");
         String prva_beseda = dobi_besedo_v_vrstici[0];
         String tretja_beseda = dobi_besedo_v_vrstici[2];
         String nova_vrstica = System.getProperty("line.separator");

         Pattern ena = Pattern.compile("S\\p{L}\\p{L}ei\\p{L}*");
             if(ena.matcher(tretja_beseda).matches()){
             fw.write(prva_beseda+nova_vrstica);
             fw.write("\n");}
         Pattern dva = Pattern.compile("P\\p{L}\\p{L}\\p{L}ei\\p{L}*");
             if(dva.matcher(tretja_beseda).matches()){
                 fw.write(prva_beseda+nova_vrstica); 
             }
         }

     fw.close();
     bufferedReader.close();

 } catch (IOException e) {
     e.printStackTrace();
 }
}
}