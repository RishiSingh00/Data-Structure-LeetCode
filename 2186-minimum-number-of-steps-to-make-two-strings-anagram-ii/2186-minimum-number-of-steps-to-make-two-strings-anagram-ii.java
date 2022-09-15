class Solution {
    public int minSteps(String s, String t) {
        
        HashMap<Character,Integer> hsh1 = new HashMap<>();
        HashMap<Character,Integer> hsh2 = new HashMap<>();
        
        for(int i=0;i<s.length();i++) {
            if(hsh1.containsKey(s.charAt(i)))
                hsh1.replace(s.charAt(i),hsh1.get(s.charAt(i))+1);
            else
                hsh1.put(s.charAt(i),1);
        }
        
        for(int i=0;i<t.length();i++) {
            if(hsh1.containsKey(t.charAt(i)))
                    hsh1.replace(t.charAt(i),hsh1.get(t.charAt(i))-1);
            else
                    hsh1.put(t.charAt(i),-1);
        }
        int ans =0;
        
        for(int i : hsh1.values()) {
            ans+=Math.abs(i);
        }
        return ans;
        
    }
}