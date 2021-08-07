import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class SevenSegmentProblem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        String num = sc.nextLine();

        List<Integer> toggleZero = Arrays.asList(1,1,1,1,1,1,0);
        List<Integer> toggleOne = Arrays.asList(0,1,1,0,0,0,0);
        List<Integer> toggleTwo = Arrays.asList(1,1,0,1,1,0,1);
        List<Integer> toggleThree = Arrays.asList(1,1,1,1,0,0,1);
        List<Integer> toggleFour = Arrays.asList(0,1,1,0,0,1,1);
        List<Integer> toggleFive = Arrays.asList(1,0,1,1,0,1,1);
        List<Integer> toggleSix = Arrays.asList(0,0,1,1,1,1,1);
        List<Integer> toggleSeven = Arrays.asList(1,1,1,0,0,0,0);
        List<Integer> toggleEight = Arrays.asList(1,1,1,1,1,1,1);
        List<Integer> toggleNine = Arrays.asList(1,1,1,0,0,1,1);
        List<List<Integer>> toggles = Arrays.asList(toggleZero, toggleOne, toggleTwo, toggleThree, toggleFour, toggleFive, toggleSix, toggleSeven, toggleEight, toggleNine);

        char[] charArray = num.toCharArray();
        List<Integer> existingIndex = new ArrayList<>();

        int steps = 0;
        for(int i=0;i<charArray.length;i++){
            List<Integer> currentToggle = toggles.get(Integer.parseInt(String.valueOf(charArray[i])));
            int index = 0;
            for(int j=0; j< currentToggle.size();j++){
                Integer item = currentToggle.get(j);
                if(item == 1){
                    if(!existingIndex.contains(index)){
                        steps++;
                    }
                    existingIndex.add(index);
                } else if(existingIndex.contains(index)){
                    steps++;
                    existingIndex.remove(index);
                }
                index++;
            }
        }
        System.out.println(steps);
    }
}
