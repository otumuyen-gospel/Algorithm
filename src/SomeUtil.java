
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user1
 */
public class SomeUtil {
    public static void reverse(String string){
        StringBuilder s = new StringBuilder(string.length());
        for(int i = string.length()-1; i >= 0; i--){
            s.append(string.charAt(i));
        }
        System.out.println(s.toString());
    }
    public static boolean checkNesting(String s){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){//count number of left parenthesis
                ++count;
            }else if(ch == ')'){//count number of right parenthesis
                --count;
                if(count < 0)return false;//check correct ordering(positioning) of left and right parenthesis
            }
        }
        return (count == 0);//check eqaul correct number of left and right parenthesis
    }
    public static void fizzBuzz(){
        for(int i = 1; i <= 100; i++){
            if((i % 5 != 0 )&& (i % 3 == 0)){
               System.out.println("Fizz");
            }else if((i % 5 == 0 )&& (i % 3 != 0)){
                System.out.println("Buzz");
            }else if((i % 5 == 0 )&& (i % 3 == 0)){
                System.out.println("FizzBuzz");
            }else{
                System.out.println(i);
            }
        }
    }
    public static boolean isSorted(long[]a){
        long low = a[0];
        for(int i = 1; i < a.length; i++){
            if(a[i] < low){
                return false;
            }
        }
        return true;
    }
    //this method is inefficient
    public static int linearSearch(long[]data, int element){
        for(int i = 0; i < data.length; i++){
            if(data[i] == element){
                return i;//found the element
            }

        }
        return -1; // not found;
    }
    public static int binarySearch(long[]data, int element){
        //binarysearch must sorted first before searching
        //first you sort in ascending order;
        Arrays.sort(data);
        int low = 0; // the beginning element index
        int high = data.length; // the ending element index
        while(low < high){// keep run only if low is not equal to high or greater than high
            int middle = (low +high)/2; //start from the middle element
            if(data[middle] == element){
                return middle;//found the element
            }else if(data[middle] < element){//if the search element is greater than middle element
                low = middle + 1; // reset and start search from the sequence of elements above middle element alone
            }else{// reset and start search from the sequence of elements below middle element alone
                high = middle;
            }
        }
        return -1; // not found;
    }
    
    public static long smallest(long[]a){
        long min = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }
    public static long middle(long[]a){
        //first you sort in ascending order;
        Arrays.sort(a);
        //calculate the index of the midian element
        int middle = (a.length + 1) / 2;
        //return the middle element by the index i.e [middle - 1]
        return a[middle - 1] ;
    }
    public static long largest(long[]a){//finds the largest value in an array
        long max = a[0];
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
    public static long secondLargest(long[]a){
        long max = a[0];
        long max2 = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                long temp = max;
                max = a[i];
                max2 = temp;
            }
        }
        return max2;
    }
    public static long thirdLargest(long[]a){
        long max = a[0];
        long max2 = 0;
        long max3 = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] > max){
                long temp = max;
                max = a[i];
                max3 = max2;
                max2 = temp;
            }
        }
        return max3;
    }
    public static long[] delete(long a[], int item){
        //first create a new array that can accommodate a new items
        long []aa = new long[a.length-1];
        int k = 0;
        int i = 0;
        //copy all item to new array except the item for deletion
        while(k < aa.length){
            if(a[i] == item){
                //copy the next item instead
                i++;
                aa[k] = a[i];
            }
            //copy items
            aa[k] = a[i];
            i++;
            k++;
        }
        
       return aa;
    }
    public static long[] deleteAt(long a[], int pos){
        //first create a new array that can accommodate a new items
        long []aa = new long[a.length-1];
        int k = 0;
        int i = 0;
        //copy all item to new array except the item for deletion
        while(k < aa.length){
            if(i == pos){
                //copy the next item instead
                i++;
                aa[k] = a[i];
            }
            //copy items
            aa[k] = a[i];
            i++;
            k++;
        }
        
       return aa;
    }
    public static long[] insert(long a[], int item){
        //how to insert in a sorted array that is already full
        //first create a new array that can accommodate a new item
        long []aa = new long[a.length+1];
        int k = 0;//start index of aa[]
        boolean isShift = true;
        //find the accurate position for each items in the new array
        while(k < a.length){
            if(item >= a[k]){
                aa[k] = a[k];//insert existing item
                aa[k+1] = item;//shift forward once and insert new item 
            }else{  
                aa[k+1] = a[k];//insert existing item
                
                //shift back once and insert new item only once
                if(isShift){
                  aa[k+1-1] = item;
                  isShift = false;
                }
            }
            k++;
        }
        return aa;
    }
    
    public static long mode(long[]a){
        return 0;
    }
    public static long mean(long[]a){
        return 0;
    }
    public static void shuffle(long[]a){
        
    }
    public static void sort(long[]a){
        
    }
    public static long[] removeDuplicateArray(long[]a){
        return null;
    }
    public static long uniqueRandomNumbers(int start , int end){
        return 0;
    }
    
}


