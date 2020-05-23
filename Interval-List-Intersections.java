class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
       
        int i = 0, j = 0;
        int n=A.length;
        int m=B.length;
         List<int[]> ans = new ArrayList();
        while (i < n && j < m) {
          int l = Math.max(A[i][0], B[j][0]);
          int h = Math.min(A[i][1], B[j][1]);
          if (l <= h)
            ans.add(new int[]{l, h});
          if (A[i][1] < B[j][1])
            i++;
          else
            j++;
        }

    int res[][]= ans.toArray(new int[ans.size()][]);
        return res;
    }
}