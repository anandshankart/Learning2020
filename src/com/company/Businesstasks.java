package com.company;

import java.util.LinkedList;

public class Businesstasks {

    public static void main(String[] args) {
        Businesstasks solution = new Businesstasks();
        String [] list = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
                "u","v","w","x","y","z"};
        System.out.println(solution.getTask(list,17));
        list = new String[]{"zlqamum", "yjsrpybmq", "tjllfea", "fxjqzznvg", "nvhekxr", "am", "skmazcey", "piklp",
                "olcqvhg", "dnpo", "bhcfc", "y", "h", "fj", "bjeoaxglt", "oafduixsz", "kmtbaxu",
                "qgcxjbfx", "my", "mlhy", "bt", "bo", "q"};
        System.out.println(solution.getTask(list,9000000));
    }

    public static int normalizeIndex(int index, int listSize){
        // as long as index is bigger than the listsize reduce the value of index to be within list size.
        while(index>=listSize){
            index = index - listSize;
        }
        return index;
    }

    public String getTask(String [] list , int n){
        LinkedList<String> linkedList = new LinkedList<String>();
        for(String item : list){
            linkedList.add(item);
        }
        int index = n-1;
        /*while(index>=linkedList.size()){
            index = index - linkedList.size();
        }*/

        index = normalizeIndex(index, linkedList.size());

        while (linkedList.size()>1){
            // 1. Remove @ index
            linkedList.remove(index);
            // 2. Incrment Index
            index +=  + n-1;
            // normalize index if bigger than list size.
            /*while(index>=linkedList.size()){
                index = index - linkedList.size();
            }*/
            index = normalizeIndex(index, linkedList.size());
        }
        /*  Just old logic.
            int x = n;
            while(linkedList.size()>1){
            if(linkedList.size()>=x){
                int newx = x;

                System.out.println("Removing "+linkedList.get(x-1));
                linkedList.remove(x-1);
            }else{
                int newx = x;
                while(newx > linkedList.size()){
                    newx = newx-linkedList.size();
                }
                System.out.println("Removing "+linkedList.get(newx-1));
                linkedList.remove(newx-1);
            }
        }*/
        String answer ="";
        answer = linkedList.getFirst();
        return answer;
    }

}

