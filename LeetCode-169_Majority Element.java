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
	    
	 // find key with max value  
        int key=0;
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
            
            int value=entry.getValue();
            if(value==maxValue){
		key=entry.getKey();
                break;
	    }
        }
      
        return key;
    }
}
