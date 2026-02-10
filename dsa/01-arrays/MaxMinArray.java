public class MaxMinArray {
    public static void main (String[]args){
    int [] arr={1,3,5,7,2,4,8};
    int max=arr[0];
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i]; 
        }
        if(arr[i]<min){
            min=arr[i];
        }
    }
    System.out.println("maximum element" + max);
    System.out.println("minimum element" +min);
    }



}
