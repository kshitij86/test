package com.company;

import java.util.*;

public class GreedyFractionalKnapsack {
    // Item can be taken in parts.

    static class Item{
        double val, weight, id;
        Double cost;
        Item(double val, double weight, double id){
            this.val = val;
            this.weight = weight;
            this.id = id;
            this.cost = (val/ weight);
        }
    }

    private static void printItem(Item[] x){
        for(Item i : x){
            System.out.println("ID : " +  i.id + " COST : " + i.cost);
        }
    }

    private static double getMaxValue(int[] val, int[] wt, int capacity){
        // Array of items to store the items.
        Item[] items = new Item[wt.length];

        for(int i = 0; i < wt.length; i++){
            items[i] = new Item(val[i], wt[i], i);
        }

        // A new comparator to sort the Items based on their cost.
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item t1, Item t2) {
                return t2.cost.compareTo(t1.cost);
            }
        });

        double totVal = 0d;

        for(Item i : items){

            if(capacity - (int)i.weight >= 0){
                // This item can be taken whole.
                totVal += i.val;
                capacity -= i.weight;
            }

            else{
                // Calculate the item's fractional value.
                double fraction = (double)capacity/(double)i.weight;
                // The item now has only a fraction of the value it had.
                totVal += (fraction * i.val);
                // And a fraction of the weight.
                capacity -= (int)(capacity - (fraction*i.weight));
                break;
            }
        }
        printItem(items);
        System.out.println("Capacity left : " + capacity);
        return totVal;
    }

    public static void main(String[] args) {
        int[] values = {10, 5, 15, 7, 6, 18, 3};
        int[] weights = {2, 3, 5, 7, 1, 4, 1};
        int capacity = 15;
        System.out.println("Maximum value we can get : " + getMaxValue(values, weights, capacity));
    }
}
