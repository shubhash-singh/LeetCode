package Easy;
/**
 * https://leetcode.com/problems/count-operations-to-obtain-zero/
 */
public class OperationToObtainZero {

    public int countOperations(int num1, int num2) {
        int steps = 0;
        while(num1 != 0 && num2 != 0){
            if(num1 >= num2){
                num1 = num1 - num2;
                steps++;
            }
            else {
                num2 -= num1;
                steps++;
            }
        }
        return steps;
    }
}