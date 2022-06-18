
import java.util.Arrays;

/*
  linear search has O(n) time execution. that
  is running time is proportional to the number of elements in the array.
  it is simplest to implement and least efficient algorithm.
  it carries sequential search i.e element by element
*/
public class LinearSearch extends Thread{
    /*
      search and print the index of the element if found else
      print -1 if not found.
    */
    int[]data; int element;int index = -1;
    public  LinearSearch(int[]data, int element){
        this.data = data;
        this.element = element;
        Arrays.sort(data);//sorting the array
    }
    public void elapsedTime(String text){
        long totalSeconds = System.currentTimeMillis() / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println(text+" : "+currentHour+":"+currentMinute+":"+currentSecond);
    }
    public void run(){
        try{
            elapsedTime("StartTime");
            for(int i = 0; i < data.length; i++){
                if(data[i] == element){
                    index = i;
                    break;
                }
                Thread.sleep(1000);//search every 0.1 seconds
            }
            System.out.println(index);
            elapsedTime("EndTime");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
