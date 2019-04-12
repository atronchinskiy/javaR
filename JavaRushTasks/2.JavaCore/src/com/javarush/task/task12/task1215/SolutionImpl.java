package com.javarush.task.task12.task1215;

/**
 * Created by tab65 on 19.03.2018.
 */

interface Student
{
    public String getName();
}

class StudentImpl implements Student
{

        private String name;
        public StudentImpl(String name)
        {
            this.name = name;
        }
    public String getName()
    {
        return this.name;
    }
    private void setName(String name)
    {
        this.name = name;
    }

}
