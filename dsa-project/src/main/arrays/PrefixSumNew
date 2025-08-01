public class PrefixSumNew {
    public long[] rangeSum(int[] A, int[][] B) {
       long[] prefixSum = prefixSum(A);
       long[] rangeSum = rangeSums(B,prefixSum);
    
       return rangeSum;
    }

    public long[] prefixSum(int[] A) {
        int n = A.length;
        long[] prefixSum = new long[n];

        prefixSum[0] = A[0];

        for (int i = 1; i <= n-1; i++) {
   
    }

     public long[] prefixSum(int[] A) {
        int n = A.length;
        long[] prefixSum = new long[n];
        
        prefixSum[0] = A[0];

        for (int i = 1; i <= n-1; i++) {
            prefixSum[i] = prefixSum[i-1] + A[i];
        }

        return prefixSum;
        //A = {1, 2, 3, 4, 5};
        // prefixSum = {1, 3, 6, 10, 15};
    }

    public long sumRange(int left, int right,long[] prefixSum ) {
        if(left==0){
            return prefixSum[right];
        }else{
            return prefixSum[right] - prefixSum[left-1];
        }
        
    }

    // Method to answer all queries
    public long[] rangeSums(int[][] queries,long[] prefixSum ) {
        long[] result = new long[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            result[i] = sumRange(left, right, prefixSum );
        }
        return result;
    }
}
