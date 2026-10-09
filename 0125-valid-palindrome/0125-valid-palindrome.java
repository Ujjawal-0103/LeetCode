class Solution {
    public boolean isPalindrome(String s) {
        HashSet<Character> map = new HashSet<>();
        for(char i = 'a'; i <= 'z'; i++){
            map.add(i);
        }
        for(char i = '0'; i <= '9'; i++){
            map.add(i);
        }

        s = s.toLowerCase();

        int i = 0; 
        int j = s.length() - 1;

        while(i < j){
            if(!map.contains(s.charAt(i))){
                i++;
                continue;
            }
            else if(!map.contains(s.charAt(j))){
                j--;
                continue;
            }

            if(s.charAt(i) != s.charAt(j)){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}