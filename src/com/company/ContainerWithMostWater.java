package com.company;

public class ContainerWithMostWater {

    public static void main(String[] args) {
        int [] input = new int []{1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater solution = new ContainerWithMostWater();
        System.out.println(solution.maxArea(input));

    }

    public int maxArea(int[] height) {
        int maxValue = 0;
        for (int i=0; i<height.length-1;i++){
            for(int j=i+1;j<height.length; j++ ){
                int result = (j-i)*findMin(height[i], height[j]);
                System.out.println(String.format("i=%d j=%d distance=%d min of (%d, %d) is %d",i,j,j-i,height[i],height[j],findMin(height[i],height[j])));
                System.out.println("result is "+result);
                if (result>maxValue)
                        maxValue=result;
            }
        }
        return maxValue;
    }

    public static int findMin(int x, int y){
        if (x<y){
            return x;
        }else{
            return y;
        }
    }
}
