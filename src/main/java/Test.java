import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args){
        List<Integer> result = new ArrayList<>();
        // integers.add(1);

        int [] arr = {1,2,3,4,5};
        
        int index = IntStream.range(0, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
        System.out.println(index);

    }
}
