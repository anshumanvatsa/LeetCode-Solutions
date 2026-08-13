class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int  o =0;
        for(int i = 0;i<hours.length;i++){
            //int o = 0;
            if(hours[i] >= target){
                o++;
            }
        }
        return o;
    }
}