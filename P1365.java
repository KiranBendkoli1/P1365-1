class P1365 {
    int smcount = 0;
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    smcount = smcount +1;
                }
                
            }
            nums[i] = smcount;
            smcount = 0;
        }
        
        return nums;
    }
    public static void main(String[] args) {
        P1365 p1 = new P1365();
        int[] nums = {8,1,2,2,3};
        int[] nums2 = p1.smallerNumbersThanCurrent(nums);
        for(int i: nums2){
            System.out.println(i);
        }
    }
}