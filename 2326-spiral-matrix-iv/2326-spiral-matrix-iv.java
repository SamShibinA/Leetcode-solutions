/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat=new int[m][n];
        int l=0,r=n-1,t=0,b=m-1;

        for(int i=0;i<m;i++)for(int j=0;j<n;j++) mat[i][j]=-1;

        while(l<=r&&t<=b){
            for(int i=l;i<=r&&!(head==null);i++){
                mat[t][i]=head.val;
                head=head.next;
            }
            t++;

            for(int i=t;i<=b&&!(head==null);i++){

                mat[i][r]=head.val;
                head=head.next;
            }
            r--;

            if(t<=b){
                for(int i=r;i>=l&&!(head==null);i--){
                    mat[b][i]=head.val;
                    head=head.next;
                }
                b--;
            }

            if(l<=r){
                for(int i=b;i>=t&&!(head==null);i--){
                    mat[i][l]=head.val;
                    head=head.next;
                }
                l++;
            }

        }
        return mat;

    }
}