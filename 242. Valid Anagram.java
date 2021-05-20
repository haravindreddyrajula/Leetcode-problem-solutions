class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() == 0 || t.length() == 0 || s.equals(null) || t.equals(null) || s.length() != t.length())
            return false;
        
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        
        String ts = new String(ch1);
        String tt = new String(ch2);
        
        if (ts.equals(tt))
            return true;
        else
            return false;
        
    }
}