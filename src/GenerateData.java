
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user1
 */
public class GenerateData {
    public static int[] data(int size){
        int[]data = new int[size];
        Random r = new Random();
        for(int i = 0; i < size; i++){
            data[i] = 5+ r.nextInt(size+1);
        }
        return data;
    }
}
