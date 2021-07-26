class Solution {
    
    private static HashMap<Integer, Integer> freq=new HashMap<>();
    
    public int majorityElement(int[] nums) {
        
        
        // make freq map
        for(int num : nums){
            if(!freq.containsKey(num))
                freq.put(num,0);
			
            freq.put(num,freq.get(num)+1);
        }
        
       
        // get max value of map
        int maxValue=Collections.max(freq.values());
        int key, value;
        
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
             key=entry.getKey();
             value=entry.getValue();
            if(value==maxValue)
               return key;
        }
      
        return 1;
    }
}