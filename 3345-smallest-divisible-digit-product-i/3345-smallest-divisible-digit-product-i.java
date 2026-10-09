class Solution {
    public int smallestNumber(int n, int t) {
        int temp = n;
        int num = n;
        while(true){
            int product = 1;
            while(temp > 0){
                product *= temp % 10;
                temp /= 10;
            }
            if(product % t == 0){
                return num;
            }
            num++;
            temp = num;
        }
    }
}