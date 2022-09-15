class Solution {
    public String kthDistinct(String[] arr, int k) {

        HashMap<String,Integer> hsh = new HashMap<>();
        
        for(int i=0;i<arr.length;i++) {
            if(hsh.containsKey(arr[i])) {
                hsh.put(arr[i],hsh.get(arr[i])+1);
            }
            else
                hsh.put(arr[i],1);    
        }
        int kk=0;
        int i;
        for(i =0;i<arr.length;i++) {
            if(hsh.get(arr[i])==1)
                kk++;
            if(k==kk)
                break;
        }
        if(i==arr.length)
            return "";
        return arr[i];
    }
}