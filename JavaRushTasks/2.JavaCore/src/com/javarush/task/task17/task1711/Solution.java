package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int ci = 1; ci < args.length; ci = ci + 3) {
                        if (args[ci + 1].equals("м")) {
                            try {
                                allPeople.add(Person.createMale(args[ci], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[ci + 2])));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        } else {
                            try {
                                allPeople.add(Person.createFemale(args[ci], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[ci + 2])));
                            } catch (ParseException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;

            case "-u":
                synchronized (allPeople) {
                    for (int ui = 1; ui < args.length; ui = ui + 4) {
                        int u = Integer.parseInt(args[ui].toString());
                        allPeople.get(u).setName(args[ui + 1].toString());

                        if (args[ui + 2].equals("м")) {
                            allPeople.get(u).setSex(Sex.MALE);
                        } else {
                            allPeople.get(u).setSex(Sex.FEMALE);
                        }

                        try {
                            allPeople.get(u).setBirthDate(new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[ui + 3]));
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }
                break;

            case "-d":
                synchronized (allPeople) {
                    for (int di = 1; di < args.length; di = di + 1) {
                        int d = Integer.parseInt(args[di].toString());
                        allPeople.get(d).setName(null);
                        allPeople.get(d).setSex(null);
                        allPeople.get(d).setBirthDate(null);
                    }
                }
                break;


            case "-i":
                synchronized (allPeople) {
                    for (int I = 1; I < args.length; I++) {
                        int ii = Integer.parseInt(args[I].toString());
                        String s = allPeople.get(ii).getSex().equals(Sex.MALE) ? "м" : "ж";
                        System.out.println(allPeople.get(ii).getName() + " " +
                                s + " " +
                                new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).format(allPeople.get(ii).getBirthDate()));
                    }
                }
                break;
        }

    }
}
