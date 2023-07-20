package com.selimcinar.secondprojectjavalearning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    System.out.println("Hello java");
    System.out.println(5*2);
    System.out.println("Hello world");

   //Java Öğrenme Projesi
        //Variables
        // Değişkenler
    System.out.println(10*20);

    //Int 32 bit , long 64 bit,float 32 bit , double 64 bit
    //Integer tam sayı

    //Değişken tipi int adı age değeri 20
    int  age =20;
    System.out.println(10*age);
    System.out.println(age/5);

    int x = 5;
    int y= 11;
    Integer zn=50; //integer böylede tanımlanabilir hash mapde işlendi
    System.out.println(y/x);

    //Long tamsayı
        long myLong = 10;
        System.out.println(myLong /5);


    //Double - Float ondalıklı sayı
        double z = 5.0;
        double a = 11.0;
        a=13.0;
    System.out.println(a/z);

    float myFloat = 10.0f;
    System.out.println(myFloat/z);

    //Daire çevresi bulma
    double pi = 3.14;
    int r = 5;
    System.out.println(2*r*pi);

    //String metin veri tipi
    String name = "James";
    String surname = "Hetfield";
    name = "Hers";
    String fullname = name + surname;

    System.out.println(surname);
    System.out.println(fullname);
    System.out.println(name + " "+surname)

    //Boolean  doğru yada yanlış true or false
     boolean isAlive = true;
     isAlive = false;
     System.out.println(isAlive);

     //Final sabit değişken değeri sonradan değiştirilemez
     final int myInteger = 5;
     System.out.println("myInteger : "+myInteger);
     //myInteger = 4;
     System.out.println("myInteger: "+myInteger);


     //Diziler  birden çok veriyi bir arada tutar
     //String dizisinden oluşan myStringArray objesi 3 eleman tutabilir.
     String[] myStringArray = new String[3];

     myStringArray[0] = "James";
     myStringArray[1] = "Lars";
     myStringArray[2] = "Kirk";
     System.out.println(myStringArray[0]); //0.indeksi getir
     System.out.println(myStringArray[1]); //1.indeksi getir
     System.out.println(myStringArray[2]); //2.indeksi getir

     int[] myIntegerArray = new int[4];
     //Değer ekleme
     myIntegerArray[0] = 50;
     myIntegerArray[1] = 60;
     myIntegerArray[2] =70;
     myIntegerArray[3] = 80;
     //Değer yazdırma
     System.out.println("Index 0 : "+myIntegerArray[0]);
     System.out.println("Index 1 : "+myIntegerArray[1]);
     System.out.println("Index 2 :"+myIntegerArray[2]);
     System.out.println("Index 3: "+myIntegerArray[3]);


     //Lists listeler
        //ArrayList tanımlandı String veritipinde olacak.
        ArrayList<String> myMusicians = new ArrayList<>();
        //Değer ekleme
        myMusicians.add("James");
        myMusicians.add("Lars");
        myMusicians.add(1,"Kirk");
        myMusicians.add("Rob");
        //Değer yazdırma
        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));
        System.out.println(myMusicians.size()); //Kaç eleman olduğunu söyler


        //Setler Birden fazla aynı eleman olmaz
        HashSet<String> mySet = new HashSet<>();
        //Değer ekleme
        mySet.add("James");
        mySet.add("James");
        //Değer yazdırma
        System.out.println(mySet.size()); //Kaç eleman olduğu

        //HashMap Key-Value pairing var yani anahtar kelime değer ikilisi var.

        HashMap<String,String> myHashmap = new HashMap<>();
       //Değer ekleme
        myHashmap.put("name","James");
        myHashmap.put("instrument","Guitar");
        //Değer yazdırma
        System.out.println(myHashmap.get("name"));
        System.out.println(myHashmap.get("instrument"));

        HashMap<String,Integer> mySecondMap = new HashMap<>();
       //Değer ekleme
        mySecondMap.put("run",100);
        mySecondMap.put("basketball",200);
       //Değer yazdırma
        System.out.println(mySecondMap.get("run"));

        //Statements durumlar
        //Matematiksel işlemler operatörler
        //Matematiksel durumlar
        int xz = 5;
        System.out.println(xz);
        xz = xz + 1;
        System.out.println(xz);
        xz++;
        System.out.println(xz);
        xz--;
        System.out.println(xz);
        xz= xz +5;
        System.out.println(xz);

        int yz=4;
        //Mantıksal durumlar
        System.out.println(xz>yz);
        System.out.println(yz>xz);
        yz=30;
        System.out.println(xz>yz);
        System.out.println(xz>=yz);
        System.out.println(xz==yz);
        System.out.println(xz!=yz);

        //And && ve Or || veya

        x = 3;
        y = 4;
        z = 5;

        System.out.println(x<y && y<z);
        System.out.println(x<y && z<y);

        System.out.println(x<y || z<y);

        //If statement
        if(x<y){
            System.out.println("y is bigger");
        }
        else if (y<x){
            System.out.println("x is bigger");
        }
        else if (x==y){
            System.out.println(" x = y");
        }
        else{
            System.out.println("Error");
        }

        //Switch -Case
        int day = 1;
        String dayString = "";
        if (day == 1){
            dayString="Monday";
        }
        else if(day == 2){
            dayString = "Tuesday";
        }
        else if (day == 3){
            dayString = "Wednesday";
        }
        else {
            dayString = "Sunday";
        }

        switch (day){
            case 1:
                dayString = "Monday";
                break;
            case 2:
                dayString = "Tuesday";
                break;
            case 3:
                dayString = "Wednesday";
                break;
            default:
                dayString = "Sunday";
        }
        System.out.println(dayString);


        //Döngüler loops belli bir işlemi aynı şekilde çalıştırır
        //For loop

        int [] myNumbers = {10,12,15,18,21,24};
        int xFor = myNumbers[0] / 3 + 5;
        //System.out.println(xFor);

        // i 0'a eşit i değeri myNumbers dizisinin.boyutundan küçük olduğu sürece işlem yap ve i'yi artır
        for(int i = 0; i<myNumbers.length;i++){
            //XFor1 değişkenine ekle = dizi değerlerini 3 e bölüp 5ile çarparak
            int xFor1 = myNumbers[i] / 3 * 5;
            System.out.println(xFor1);
        }

        for (int number : myNumbers){
            System.out.println(number / 3 * 5);
        }

        for (int ab = 0; ab<10;ab++){
            int ba= ab*10;
            System.out.println(ba);
        }

        //While
        int j = 0;
        while (j<10){
            System.out.println("Test");
            j++;
        }







    }
}
