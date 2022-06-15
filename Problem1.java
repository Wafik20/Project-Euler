class Problem1 {
    public static void main(String[] args) {
        //Naive O(n) solution
            int sum = 8;
            for (int i = 6; i < 1000; i++) {
                if (i % 3 == 0 || i % 5 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);

        }
    }
