class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet hs = new HashSet<>();
        Boolean bool = false;


        for( int i = 0; i < nums.length ; i++)
        {
            if( hs.contains(nums[i]))
            {
                bool = true;

            }
            else{
                hs.add(nums[i]);

            }


        }
    return bool;

        
    }
}