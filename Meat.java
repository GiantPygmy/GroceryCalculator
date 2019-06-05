package grocery.calculator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeremy Ryan
 */
public class Meat extends Grocery {
    private int cookingTemp;
    private String cookingTime;
    private boolean cooked;

    //Constructor
   public Meat()
    {
        super();
        this.cookingTemp=0;
        this.cookingTime="";
        this.cooked= false;
    }
    public Meat(String name,int quantity,double cost,int cookingTemp,String cookingTime,boolean cooked)
    {
        super(name,quantity,cost);
        this.cooked= cooked;
        this.cookingTime= cookingTime;
        this.cookingTemp= cookingTemp;
    }
    //get and set
    public int getCookingTemp() {
        return cookingTemp;
    }

    public void setCookingTemp(int cookingTemp) {
        this.cookingTemp = cookingTemp;
    }

    public String getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(String cookingTime) {
        this.cookingTime = cookingTime;
    }

    public boolean isCooked() {
        return cooked;
    }

    public void setCooked(boolean cooked) {
        this.cooked = cooked;
    }

    @Override
    public String toString() {
        return super.toString()+" Cooking Temperature: "+cookingTemp+" Cooking Time: "+cookingTime+
                " Cooked: "+cooked;
    }
}