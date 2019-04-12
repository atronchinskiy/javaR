package com.javarush.task.task17.task1710;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут

        switch (args[0]){
            case "-c":
                if (args[2].equals("м")){
                    try {
                        allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }else{
                    try {
                        allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(allPeople.size() - 1);

                break;

            case "-u":
                int u = Integer.parseInt(args[1].toString());
                allPeople.get(u).setName(args[2].toString());

                if (args[3].equals("м")) {
                    allPeople.get(u).setSex(Sex.MALE);
                }else {
                    allPeople.get(u).setSex(Sex.FEMALE);
                }

                try {
                    allPeople.get(u).setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[4]));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                int i = 0;
                break;
            
            case "-d":
                int d = Integer.parseInt(args[1].toString());
                allPeople.get(d).setName(null);
                allPeople.get(d).setSex(null);
                allPeople.get(d).setBirthDate(null);
                break;

            case "-i":
                int ii = Integer.parseInt(args[1].toString());
                String s = allPeople.get(ii).getSex().equals(Sex.MALE) ? "м" : "ж";
                System.out.println(allPeople.get(ii).getName() + " " +
                                    s + " " +
                                   new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(ii).getBirthDate()));

                break;

        }
    }
}
