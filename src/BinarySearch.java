
import java.util.Arrays;

/*
  binary search has O(lgn) time execution. that
  is running time is proportional to the logarithm of the number of elements in the array.
  it is better to implement and more efficient algorithm.
  running time is n^2(i.e if it takes 3s to search 1,000 elements,
  it will take 6s to run 100,000,000 elements
  it helps eliminate 50% of the search
  before using binarysearch the data must be sorted
*/
public class BinarySearch extends Thread{
    /*
      search and print the index of the element if found else
      print -1 if not found.
    */
    int[]data; int element;int index = -1;
    public  BinarySearch(int[]data, int element){
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
        int iteration = 0;
        try{
            elapsedTime("StartTime");
            int low = 0; // the beginning element index
            int high = data.length; // the ending element index
            while(low < high){// keep run only if low is not equal to high or greater than high
                int middle = (low +high)/2; //start from the middle element
                if(data[middle] == element){
                    index = middle;
                    break;//found the element
                }else if(data[middle] < element){//if the search element is greater than middle element
                    low = middle + 1; // reset and start search from the sequence of elements above middle element alone
                }else{// reset and start search from the sequence of elements below middle element alone
                    high = middle;
                }
                iteration++;
                Thread.sleep(1000);//search every 1 seconds
            }
            System.out.println("Data : "+data[index]+" : index :"+ index+ " : iteration : "+iteration);
            elapsedTime("EndTime");
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}
