public class StringCompression {

    public int compress(char[] chars) {
        if (chars == null || chars.length == 0) {
            return 0;
        }

        int write = 0; // Pointer to write the compressed result
        int read = 0;  // Pointer to traverse the array

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count the occurrences of the current character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the count if greater than 1
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {
        StringCompression sc = new StringCompression();
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(sc.compress(chars));
    }
}