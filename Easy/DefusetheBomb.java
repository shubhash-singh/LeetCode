// https://leetcode.com/problems/defuse-the-bomb/
package Easy;

import java.util.Arrays;

public class DefusetheBomb {

    public static int[] decrypt(int[] code, int k) {
        
        int n = code.length;
        int[] res = new int[n];
        if(k==0){
            return res;
        }

        else if( k > 0){

            for(int i = 0;i<n;i++){
                for(int j = 0;j<k;j++){
                    res[i] += code[(i+j+1)%n];
                }
            }
        }

        else if( k < 0){
            k = Math.abs(k);
            for(int i = 0;i<n;i++){
                for(int j = 0;j < k;j++){
                    
                    int index = i-1-j;
                    
                    if (index < 0){
                        index = n + index;
                    }
                    System.out.println(index);
                    res[i] += code[index%n];
                    
                }
            }
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] code = {2,4,9,3};
        int k = -2;

        System.out.println(Arrays.toString(decrypt(code, k)));
    }
}