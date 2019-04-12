package com.javarush.task.task09.task0912;

/**
 * Created by tab65 on 15.03.2018.
 */
public class Test
{

    int a, b;

    Test(int i, int j){
        a = i;
        b = j;
    }

    void ch (Test ob){ //это передача копии объекта
        ob.a = ob.a * 4;
        ob.b = ob.b * 4;

    }

    void ch1 (){
        this.a = this.a * 4;
        this.b = this.b * 4;

    }

}
