class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i++) {
            char a = s[i];
            s[i] = s[s.length - 1 - i];      // use index from the end
            s[s.length - 1 - i] = a;         // swap back
        }
    }
}