package Easy;

public class PrimeNumberofSetBitsinBinaryRepresentation {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        for(int i = left;i<=right;i++){
            if(isPrime(Integer.bitCount(i))){
                res++;
            }
        }

        return res;
    }
    private boolean isPrime(int n){
        if(n==1) return false;

        for(int i = 2;i<n/2 + 1;i++){
            if(n%i==0) return false;
        }
        return true;
    }

}
