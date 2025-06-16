package Easy;

public class CountSymmetricIntegers {
    
    public int countSymmetricIntegers(int low, int high) {
        int res = 0;
        for(int i=low;i<=high;i++){
            String num = String.valueOf(i);

            if(num.length() % 2 != 0){
                continue;
            }
            else{
                int sum1 = 0;
                int sum2 = 0;
                int half = num.length() / 2;
                int count = 0;
                for(char x : num.toCharArray()){
                    count++;
                    if(count <= half){
                        sum1 += (int)(x);
                    }
                    else{
                        sum2 += (int)(x);
                    }
                }
                if(sum1 == sum2){
                    res++;
                }
            }
        }
        return res;
    }
}
