class Solution {
    public int candy(int[] ratings) {
        int count = 0;
        int[] arr1 = new int[ratings.length];
        int[] arr2 = new int[ratings.length];
        for(int i=0;i<ratings.length;i++){
            arr1[i] = 1;
            arr2[i] = 1;
        }
        for(int i=0;i<ratings.length-1;i++){
            if(ratings[i]>ratings[i+1]){
                arr1[i] = arr1[i+1] + 1;
            }
        }
        for(int i=ratings.length-1;i>0;i--){
            if(ratings[i]>ratings[i-1]){
                arr2[i] = arr2[i-1] + 1;
            }
        }
        for(int i=0;i<ratings.length;i++){
            count += Math.max(arr1[i],arr2[i]);
        }
        return count;
    }
}