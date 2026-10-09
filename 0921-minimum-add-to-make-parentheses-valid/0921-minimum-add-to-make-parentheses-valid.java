class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
                count++;
            }
            else{
                if(stack.isEmpty()){
                    count++;
                }
                else{
                    char top = stack.pop();
                    if(ch == ')' && top == '('){
                        count--;
                    }
                }
            }
        }
        return count;
    }
}