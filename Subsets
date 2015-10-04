public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
         List<List<Integer>> subs = new  ArrayList<List<Integer>>();
         subs.add(new ArrayList<Integer>());
        
            for (int i=0;i<nums.length;i++){
                   List<List<Integer>> newSubs = new  ArrayList<List<Integer>>();
                   for(List<Integer> list:subs){
                       newSubs.add(list);
                       List<Integer> addedList = new ArrayList<Integer>(list);
                       addedList.add(nums[i]);
                       newSubs.add(addedList);
                   }
                   
                   subs=newSubs;
            }
            
            return subs;
        
        
    }
