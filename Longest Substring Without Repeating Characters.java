class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s.length() == 0)
            return 0;
        else if (s.length() == 1)
            return 1;
        
        ArrayList<String> list = new ArrayList<String>();
        int count = 0;
        int finalCount=0;
        for (int i =0; i < s.length(); i++){
            char c = s.charAt(i);
            if (list.contains(Character.toString(c))){  
                if (finalCount<count){
                    finalCount = count;  
                }
                while(true){
                    if (list.get(0).equals(Character.toString(c))){
                        list.remove(0);
                        break;
                    }
                    else{
                        list.remove(0);
                    }
                }
                list.add(Character.toString(c));
                count = list.size();
            }
            else{
                list.add(Character.toString(c));
                count++;
            } 
        }
        if (finalCount > count)
            return finalCount;
        else
            return count;
    }
}