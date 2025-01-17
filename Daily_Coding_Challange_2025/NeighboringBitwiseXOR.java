package Daily_Coding_Challange_2025;

import java.util.Arrays;

public class NeighboringBitwiseXOR {

    public boolean doesValidArrayExist(int[] derived) {
        return Arrays.stream(derived).reduce(0,(x,y) ->  x^y) == 0;
    }

    public static void main(String[] args) {
        NeighboringBitwiseXOR obj = new NeighboringBitwiseXOR();
        int[] derived = {1, 1, 0};
        System.out.println(obj.doesValidArrayExist(derived));
    }
}