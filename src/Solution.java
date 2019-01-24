import java.util.ArrayList;
import java.util.List;

class Solution {
    private List<Integer> result = new ArrayList<>();
    public List<Integer> pancakeSort(int[] A) {
        if(A.length<=1){
            return result;
        }
        int index = 0;
        int min = A[index];
        for(int i=0;i<A.length;i++){
            if(min>A[0]){
                index = i;
            }
        }
        ArrayUtils.reverse(A);
        return null;
//        pancakeSort(int[] A, 1);
    }

    private void pancakeSort(int[] A, int index){

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.pancakeSort(grid));
    }
}