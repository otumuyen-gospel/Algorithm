
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user1
 */
public class GenerateData {
    public static long[] dataArray(int size){
        long[]data = new long[size];
        Random r = new Random();
        for(int i = 0; i < size; i++){
            data[i] = 5 + r.nextInt(size+1);
        }
        return data;
    }
    public static List dataList(int size){
        List list = new ArrayList();
        Random r = new Random();
        for(int i = 0; i < size; i++){
            list.add(5 + r.nextInt(size+1));
        }
        return list;
    }
}
