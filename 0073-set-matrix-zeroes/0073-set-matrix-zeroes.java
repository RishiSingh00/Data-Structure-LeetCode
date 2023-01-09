class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        int zRow = 0, zCol = 0;
        int rLen = matrix.length, cLen = matrix[0].length;
        while(zRow < rLen && zCol < cLen) {
            if(matrix[zRow][zCol] == 0)
                break;
            if(zCol == cLen - 1) {
                zRow++;
                zCol = 0;
            }
            else
                zCol++;
        }
        
        if(zRow == rLen)
            return;
        
        for(int i = 0 ; i < rLen ; i++) {
            for(int j = 0 ; j < cLen ; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][zCol] = 0;
                    matrix[zRow][j] = 0;
                }
            }
        }
        
        for(int i = 0 ; i < rLen ; i++) {
            if(i == zRow) 
                continue;
            
            if(matrix[i][zCol] !=0 )
                matrix[i][zCol] = 0;
            else {
                for(int j = 0 ; j < cLen ; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        
        
        for(int i = 0 ; i < cLen ; i++) {
            if(matrix[zRow][i] !=0 )
                matrix[zRow][i] = 0;
            else {
                for(int j = 0 ; j < rLen ; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        
        for(int j = 0 ; j < cLen ; j++) {
            matrix[zRow][j] = 0;
        }
        
        return;
    }
}