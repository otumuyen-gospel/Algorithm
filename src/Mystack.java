
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user1
 */
public class Mystack {
    private static int top,capacity;
    private static int[]array;
    public Mystack(int size){
        capacity = size;
        array = new int[size];
    }
    public void push(int elem){
        if(top == capacity){
            System.out.println("stack overflow - full");
        }else{
            array[top] = elem;
            top++;
        }
    }
    public void pop(){
        if(top == 0){
            System.out.println("stack is empty");
        }else{
            /* 
             we delete top element when next insertion is made.
             new element we take the place of the previous top element
            */
            top--;
        }
    }
    public int peek(){
        if(top > -1){
         return array[top-1];
        }else{
            System.out.print("stack is empty : ");
            return -1;
        }
    }
    public int size(){
        return top;
    }
    public int search(int elem){
        if(top == 0){
            System.out.print("stack is empty : ");
        }else{
            //linear search
           
            for(int i = 0; i < top; i++){
                if(array[i] == elem){
                    return i;
                }
            }
            
        }
        return -1;
    }
    public boolean isEmpty(){
        return (top == 0);
    }
    public void display(){
        if(top == 0){
            System.out.println("stack is empty");
        }else{
            for(int i = 0; i < top; i++){
                System.out.print(array[i]+" ");
            }
        }
    }
}
