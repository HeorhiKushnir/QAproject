package PracticeLesson8.phone;

import java.util.Arrays;

public class Phone
{
    private int number;
    private String model;
    private int weight;

    public void receiveCall(String name)
    {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name,int number)
    {
        System.out.println(name + " " + number);
    }

    public int[] sendMessage(int... var)
    {
        return var;
    }

    public Phone()
    {

    }

    public Phone(int number, String model)
    {
        this.number = number;
        this.model = model;
    }


    public Phone(int number, String model, int weight)
    {
        this (number, model);
        this.weight = weight;
    }

    public int getNumber() {return number;}

    public void setNumber(int number) {this.number = number;}

    public String getModel() {return model;}

    public void setModel(String model) {this.model = model;}

    public int getWeight() {return weight;}

    public void setWeight(int weight) {this.weight = weight;}

    @Override
    public String toString()
    {
        return "Number= " + number + ", model= " + model + ", weight= " + weight;
    }
}
