class Solution {
    public boolean isPalindrome(String s) {
        String a = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String rev = new StringBuilder(a).reverse().toString();
        return a.equals(rev);
    }
}