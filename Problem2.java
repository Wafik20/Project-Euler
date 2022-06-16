class Problem2 {
    public static void main(String[] args) {
        //O(nlog(n))
        int n = 3;
        int sum = 0;
        //we are looking for fibonacci numbers less than 4,000,000
        while(fib(n)<4000000){
            //fib(n) is even iff n%3 == 0
            if(n%3 == 0){
                sum += fib(n);
            }
            n++;
        }
        System.out.println(sum);
    }

    public static int fib(int n){
        //O(log(n)), given that the Math.pow() function function on O(log(n))
        //We use the the golden ratio formula to calculate the nth fibonacci number
        double phi = (1 + Math.sqrt(5))/2;
        return (int) Math.round((Math.pow(phi,n))/Math.sqrt(5));
    }
}
