class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;
        int insertions = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(count % 2 == 1){
                    insertions++;
                    count--;
                }
                count += 2;
            }
            else{            
                count--;

                if(count < 0){
                    insertions++;
                    count = 1;
                }
            }
        }
        return insertions + count;
    }
}