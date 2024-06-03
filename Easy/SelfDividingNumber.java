package Easy;


// https://leetcode.com/problems/self-dividing-numbers/


import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i = left; i<=right;i++){
            if(i%10 == 0){
                continue;
            }
            else{
                int num = i;
                boolean flag = true;
                while(num>0){
                    flag = false;
                    int digit = num%10;
                    if(digit == 0 || i % digit != 0){
                        break;
                    }
                    num /= 10;
                    flag = true;

                }
                if(flag){
                    result.add(i);
                }
            }
        }
        return result;
    }
}
