class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder k = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
    if (k.toString().equals(goal)) {
        return true;
    }

    char first = k.charAt(0);
    k.deleteCharAt(0);
    k.append(first);
    }
    return false;
}
}