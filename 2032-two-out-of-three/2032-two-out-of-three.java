import java.util.*;
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        HashSet<Integer> ab = new HashSet<>();
        HashSet<Integer> bc = new HashSet<>();
        HashSet<Integer> ca = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();
        
        for(int i=0;i<nums1.length+nums2.length;i++) {
            if(i>nums1.length-1)
                ab.add(nums2[i-nums1.length]);
            else
                ab.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length+nums3.length;i++) {
            if(i>nums2.length-1)
                bc.add(nums3[i-nums2.length]);
            else
                bc.add(nums2[i]);
        }
        for(int i=0;i<nums1.length+nums3.length;i++) {
            if(i>nums1.length-1)
                ca.add(nums3[i-nums1.length]);
            else
                ca.add(nums1[i]);
        }
        //real code
        
        for(int i=0;i<nums3.length;i++) {
            if(ab.contains(nums3[i])) 
                result.add(nums3[i]);
        }
        for(int i=0;i<nums2.length;i++) {
            if(ca.contains(nums2[i])) 
                result.add(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++) {
            if(bc.contains(nums1[i])) 
                result.add(nums1[i]);
        }
        List<Integer> ans= new ArrayList<>();
        ans.addAll(result);
        return ans;
        
        
    }
}