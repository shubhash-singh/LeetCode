class PowerOfX{
    public static double myPow(double x, int n) {
        if (n == 0){
            return 1;
        }
        else if (n<0){
            if (n%2==0){
                x = Math.abs(x);
                if (n==Integer.MIN_VALUE){
                    return(1/Math.pow(x, Math.abs(n+1)));
                }
                return(1/Math.pow(x, Math.abs(n)));
            }
            else{
                if (n==Integer.MIN_VALUE){
                    return(1/Math.pow(x, Math.abs(n+1)));
                }
                return(1/Math.pow(x, Math.abs(n)));
            }
        }
        else {
            return Math.pow(n, x);
        }
    }
}