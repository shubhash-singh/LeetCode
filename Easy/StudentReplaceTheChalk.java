package Easy;


/**
 * https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/
 */
public class StudentReplaceTheChalk {
    public static void main(String[] args) {
        int[] chalk = {5,1,5};
        int k = 22;
        System.out.println(chalkReplacer(chalk, k));
    }
    public static int chalkReplacer(int[] chalk, int k) {
        
        
        // int i = chalk.length;
        while( k >= 0){
            for(int i = 0; i < chalk.length; i++){
                if (k < chalk[i]){
                    return i;
                }
                k = k- chalk[i];
            }
        }
        return -1;
    }
    
}