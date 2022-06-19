/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user1
 */
public class SomeUtil {
    public static boolean isSorted(int[]a){
        int low = a[0];
        for(int i = 1; i < a.length; i++){
            if(low <= a[i]){
                low = a[i];
            }else{
                return false;
            }
        }
        return true;
    }
    public static int minimum(int[]a){
        int min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
    public static int[] withoutDuplicate(int[]a){
        boolean isDuplicate = false;
        int []arr = new int[a.length];
        int index = 0;
        for(int i = 0; i < a.length; i++){
            for(int r = 0; r < arr.length; r++){
                if(a[i] == arr[r]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                arr[index] = a[i];
                index++;
            }else{
                isDuplicate = false;
            }
        }
        return arr;
    }
}
