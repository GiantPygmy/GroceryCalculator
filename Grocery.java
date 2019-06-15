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
import java.lang.Math;

public class Grocery {

    /* attributes that will be used */
    String name;
    int quantity;
    double cost;
    double extendedCost;

    public static int groceryObjectID;
    public static int groceryObjectCounter;
    public static int totalQuantity;
    public static double totalExtendedCost;

    public Grocery() {

        this.name = null;
        this.quantity = 0;
        this.cost = 0.0;
        this.extendedCost = 0.0;
        this.groceryObjectID = 0;
        this.groceryObjectCounter = 0;
        this.totalQuantity = 0;
        this.totalExtendedCost = 0.0;
    }

    public Grocery(String name, int quantity, double cost) {

        this.name = name;
        this.cost = cost;
        this.groceryObjectID = groceryObjectID + 1;
        this.groceryObjectCounter = groceryObjectCounter + 1;
        this.quantity = quantity;
        this.totalQuantity = totalQuantity + quantity;
        this.totalExtendedCost = totalExtendedCost + cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getTotalQuantity() {
        return this.totalQuantity;
    }

    public double getExtendedCost() {
        return this.extendedCost;
    }

    public double getTotalExtendedCost() {
        return this.totalExtendedCost;
    }

    public String getTotalsAverage() {
        return "Average Cost = $" + (totalExtendedCost / totalQuantity);
    }

    public String toString() {
        return " " + this.name.toUpperCase() + " | Qty: " + this.quantity + " | Cost: $" + this.cost;
    }

}
