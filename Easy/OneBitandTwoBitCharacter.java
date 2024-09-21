package Easy;

public class OneBitandTwoBitCharacter {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        if(n % 2 != 0 && n > 2 && bits[n - 3] == 0 && bits[n - 1] == 0 && bits[n - 2] == 1){
            return false;
        }
        if(n % 2 != 0 && n > 4 && bits[n - 3] == 1 && bits[n - 4] == 1 && bits[n - 5] == 0 && bits[n - 1] == 0 && bits[n - 2] == 1){
            return false;
        }
        if(n % 2 != 0 && bits[n - 1] == 0){
            return true;
        }
        if(n%2 == 0 && bits[n - 1] == 0 && bits[n - 2] == 0){
            return true;
        }
        if(n >= 4 && n%2 == 0 && bits[n - 1] == 0 && bits[n - 2] == 1 && bits[n - 3] == 1 && bits[n - 4] == 0){
            return true;
        }
        

        return false;
    }
}