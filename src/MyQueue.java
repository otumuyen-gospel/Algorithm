/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user1
 * A class to simulate the queue scenario
 */

public class MyQueue {
    int rear_Q,capacityOfQueue;
    private static int[]array;
    public MyQueue(int size){
        capacityOfQueue = size;
        array = new int[size];
    }
    public boolean isEmpty(){
        if(rear_Q == 0){
            return true;
        }else{
            return false;
        }
    }
    public int size(){
        return rear_Q;
    }
    public void enqueue(int element){
        if(rear_Q == capacityOfQueue){
            System.out.println("queue is already full");
        }else{
            array[rear_Q] = element;
            rear_Q++;
        }
    }
    public void dequeue(){
        if(rear_Q == 0){
            System.out.println("queue is already empty");
        }else{
            for(int i = 0; i < rear_Q-1; i++){
                /*
                 shift backward to delete  value and simulate first in first out(FIFO)
                */
                array[i] = array[i+1];
            }
            /* 
             helps to adjust size of queue and change value in the position 
             of the previous last item to the new added item whenever 
             new item is added to the queue
            */
            rear_Q--;
        }
    }
    public void display(){
        if(rear_Q == 0){
            System.out.println("queue is empty");
        }else{
            for(int i = 0; i < array.length; i++){
                System.out.print(array[i]+" ");
            }
           
        }
    }
}
