class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        for(int i=m-1;i>=0;i--){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<n&&i+j<m;j++){
                l.add(mat[j][i+j]);
            }

            Collections.sort(l);

            int idx=0;
            for(int j=0;j<n&&i+j<m;j++){
                mat[j][i+j]=l.get(idx++);
            }

        }

        for(int i=1;i<n;i++){
            List<Integer> l=new ArrayList<>();
            for(int j=0;j<m && i+j<n;j++){
                l.add(mat[i+j][j]);
            }

            Collections.sort(l);

            int idx=0;
            for(int j=0;j<m && i+j<n;j++){
                mat[i+j][j]=l.get(idx++);
            }

        }

        return mat;
    }
}