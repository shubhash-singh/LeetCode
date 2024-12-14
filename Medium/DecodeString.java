public class DecodeString {

    public String decodeString(String s) {
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < s.length()) {
            int character_occurance = 0;
            if (Character.isDigit(s.charAt(index))) {
                character_occurance = (int)s.charAt(index);
                if(s.charAt(index+1) == '['){
                    index++;
                    String str = "";
                    for(int i=index;i<s.length();i++){
                        if()

                    }
                }
            }
        }
    }
}