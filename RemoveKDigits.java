class Solution {
    public String remove(String num) {
        
        StringBuilder ans = new StringBuilder();
        int length = num.length();
        int index = length - 1;
        for (int i = 0; i < index; i++) {
            if (num.charAt(i) > num.charAt(i + 1)) {
                index = i;
                break;
            }
        }
        for (int i = 0; i <= length-1; i++) {
            char temp = num.charAt(i);
            if (ans.length()==0&&temp=='0'||i==index)
                continue;
            ans.append(temp);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
    public String removeKdigits(String num, int k) {
        for(int j=1;j<=k;j++){
            num=remove(num);
        }
        return num;
    }
    

}