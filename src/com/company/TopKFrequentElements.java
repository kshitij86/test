package com.company;

/*
Given a non-empty array of integers, return the k most frequent elements.
*/


import java.util.*;

public class TopKFrequentElements {

    private static List<Integer> frequentKMethod(Integer[] nums, int k){
        List<Integer> a = new ArrayList<>(Arrays.asList(nums));
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i : a){
            if(!map.containsKey(i)) { map.put(i, 0); }
            if(map.containsKey(i)) { map.replace(i, map.get(i), map.get(i)+1); }
        }
        // Clear this list and store elements to save space.
        a.clear();

        // Sort the HashMap below, feels genuinely complicated.
        List<HashMap.Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());

        Collections.sort(list, new Comparator<>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // Put data from sorted list to HashMap
        HashMap<Integer, Integer> temp = new LinkedHashMap<>();
        for (HashMap.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        System.out.println(temp);
        a = new ArrayList<>(temp.keySet());
        List<Integer> cx = a.subList(a.size() - k, a.size());
        return cx;
    }

    public static void main(String[] args) {
        Integer[] n = new Integer[10000] ;
        Random random = new Random();
        for(int i = 0; i < 10000; i++){
            n[i] = random.nextInt(Integer.MAX_VALUE);
        }
        System.out.println(frequentKMethod(n, 55));
    }
}
