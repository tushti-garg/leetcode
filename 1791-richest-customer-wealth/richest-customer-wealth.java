class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for(int i = 0;i<accounts.length;i++){
            int CurrentWealth =0;
            for(int j = 0;j<accounts[i].length;j++){
                CurrentWealth+=accounts[i][j];

            }
            if(CurrentWealth > maxWealth){
                maxWealth = CurrentWealth;
            }
        }
        return maxWealth; 
    }
}