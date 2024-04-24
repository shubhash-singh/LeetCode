import java.util.Arrays;

public class MaximumMatchingofPlayersWithTrainers {
    public static void main(String[] args) {
        // write code according to uses
    }
    public static int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int result = 0;
        int minVal = Math.min(players.length, trainers.length);
        Arrays.sort(trainers);
        Arrays.sort(players);
        int j = trainers.length -1;
        int i = minVal - 1;
        while(i>=0) {
            if(players[i] <= trainers[j]){
                result++;
                j--;
                i--;
            }
            else{
                i--;
            }
            
            
        }
        return result;
    }
}
