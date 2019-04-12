package com.javarush.task.task14.task1408;

/**
 * Created by tab65 on 05.04.2018.
 */
public class MoldovanHen  extends Hen{

    @Override
    int getCountOfEggsPerMonth() {
        return 2;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + "Moldova" +". Я несу " + this.getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}