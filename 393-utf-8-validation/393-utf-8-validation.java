class Solution {
    public boolean validUtf8(int[] data) {
        int temp=0;
        for(int i=0;i<data.length;i++)
        {
            if(temp==0) {
                if(data[i]<128)
                {
                    continue;
                }
                else if(data[i]>=192 && data[i]<224)
                {
                    temp=1;
                }
                else if(data[i]>=224 && data[i]<240)
                {
                    temp=2;
                }
                else if(data[i]>=240 && data[i]<248)
                {
                    temp=3;
                }
                else
                    return false;
            }            
            else{
                if(data[i]<192 && data[i]>=128)
                {
                    temp--;
                }
                else
                    return false;
            }
            
            
        }
        if(temp!=0)
            return false;
        return true;
    }
}