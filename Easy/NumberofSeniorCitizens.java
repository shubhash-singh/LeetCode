package Easy;

// https://leetcode.com/problems/number-of-senior-citizens

public class NumberofSeniorCitizens {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522","5303914400F9211","9273338290F4010"};
        System.out.println(countSeniors(details));
    }

    static int countSeniors(String[] details) {
        int result = 0;
        for(String passanger : details){
            int passAge = Integer.parseInt(passanger.substring(11,13));
            System.out.println("Passange age: "+passAge);
            if(passAge > 60){
                result++;
            }
        }
        return result;
    }
}
