package com.javarush.task.task14.task1408;

/**
 * Created by tab65 on 05.04.2018.
 */
public class BelarusianHen extends Hen {

    @Override
    int getCountOfEggsPerMonth() {
        return 3;
    }

    String getDescription() {
        //return super.getDescription() + " Моя страна - Беларусь. Я несу 3 яиц в месяц.";
        return super.getDescription() + " Моя страна - " + "Belarus" +". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
