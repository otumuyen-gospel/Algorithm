
import java.util.Arrays;

public class Executable {
    
    public static void main(String[] args) {
        int[]data = GenerateData.data(20);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(SomeUtil.withoutDuplicate(data)));
    }
    
}
