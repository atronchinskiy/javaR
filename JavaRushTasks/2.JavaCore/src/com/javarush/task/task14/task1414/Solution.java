package com.javarush.task.task14.task1414;

/* 
MovieFactory
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String st;
        Movie movie;
        //Movie movie = MovieFactory.getMovie(st);
        st = bf.readLine();
        while (true) {
            movie = MovieFactory.getMovie(st);
            if (movie==null) break;
            System.out.println(movie.getClass().getSimpleName());
            st = bf.readLine();
        };

        /*
8 создать переменную movie класса movie и для каждой введенной строки(ключа):
8.1 получить объект используя moviefactory.getmovie и присвоить его переменной movie
8.2 вывести на экран movie.getclass().getsimplename()
        */

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            //напишите тут ваш код, пункты 5,6

            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            if ("thriller".equals(key)) {
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    //Напишите тут ваши классы, пункт 3

    static class Cartoon extends Movie{

    }
    static class Thriller extends Movie{

    }


}
