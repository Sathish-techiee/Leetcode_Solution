class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);

        return Arrays.equals(target,arr);
       /* int count=0;
       for(int i=0;i<target.length;i++){

        
        if(target[i]==arr[i]){
         count++;
        }
        if(count==target.length){
            return true;
        }

        }
        return false;*/
    }
}