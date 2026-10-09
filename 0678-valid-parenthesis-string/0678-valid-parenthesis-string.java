class Solution {
    public boolean checkValidString(String s) {
        int minBalance = 0;
        int maxBalance = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                minBalance++;
                maxBalance++;
            }
            else if(ch == ')'){
                minBalance--;
                maxBalance--;
            }
            else{
                minBalance--;
                maxBalance++;
            }

            if(maxBalance < 0){
                return false;
            }

            minBalance = Math.max(minBalance, 0);
        }

        return minBalance == 0;
    }
}