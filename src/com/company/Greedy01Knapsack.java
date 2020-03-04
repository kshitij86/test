package com.company;

import java.util.*;

public class Greedy01Knapsack {
    // Take it whole, or take none.

    static class Item{
        int value, weight, id;
        // Cost made Double, so items can be sorted using a comparator.
        Double cost;
        Item(int value, int weight, int id){
            this.value = value;
            this.weight = weight;
            this.id = id;
            this.cost = (double) value/ weight;
        }
    }

    private static void printItem(Item[] x){
        for(Item i : x){
            System.out.println("ID : " + i.id + " COST :"  + i.cost);
        }
    }

    private static int getMaxValue(int[] values, int[] weights, int capacity){
        // Store the items in an array of Item.
        Item[] items = new Item[values.length];

        for(int i = 0; i < values.length; i++){
            items[i] = new Item(values[i], weights[i], i);
        }

        // Sort the items by their values.
        Arrays.sort(items, new Comparator<Item>(){
            public int compare(Item o1, Item o2){
                return o2.cost.compareTo(o1.cost);
            }
        });

        int totVal = 0;

        for(Item i : items){
            // Get the value and weight for the current item.
            if(capacity - i.weight >= 0) {
                totVal += i.value;
                capacity -= i.weight;
            }
        }

        printItem(items);
        System.out.println("Capacity left : " + capacity);
        return totVal;
    }

    public static void main(String[] args){
        int[] values = {10, 5, 15, 7, 6, 18, 3};
        int[] weights = {2, 3, 5, 7, 1, 4, 1};
        int capacity = 50;
        System.out.println("Maximum value : " + getMaxValue(values, weights, capacity));
    }
}
