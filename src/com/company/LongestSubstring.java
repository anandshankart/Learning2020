package com.company;

public class LongestSubstring {

    char[] temp;

    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();
        System.out.println(solution.lengthOfLongestSubstring("abcabca"));

        }


    int lengthOfLongestSubstring(String s){
        int length =1;
        int maxLength = 1;
        char[] array = s.toCharArray();
        temp = new char[array.length];
        temp[0]= s.charAt(0);
        for(int i=0; i<s.length()-1; i++){
            if(array[i]!= array[i+1]){
                if(!isPresent(temp,array[i+1])){
                    length++;
                    if(length> maxLength){
                        maxLength=length;
                    }
                    addToTemp(array[i+1]);
                    System.out.println("new  length :"+length);
                }else{
                    length=1;
//                    addToTemp(array[i+1]);
                    temp= new char[array.length];
                    System.out.println("new  length :"+length);
                }
            }

        }


        return maxLength;
    }

    private void addToTemp( char c) {
        for (int i =0; i <temp.length; i++){
            if(temp[i] == '\0'){
                temp[i] = c;
                return;
            }
        }
    }

    private boolean isPresent(char[] temp, char c) {
        boolean result = false;
        for(int i =0; i<temp.length; i++){
            if(temp[i]=='\0'){
                return result;
            }
            else if(temp[i]==c){
                return true;
            }
        }
        return result;
    }
}
