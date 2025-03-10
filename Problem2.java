import java.util.List;
/*
Triangle
approach: at each row we chose minimum from 2 elements from next row
time: O(mxn)
space: O(mxn)
 */
public class Problem2 {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle==null||triangle.size()==0) return 0;
        int n = triangle.size();

        for (int i = n-2;i>=0;i--) {
            for (int j = 0;j<=i;j++) {
                triangle.get(i).set(j, triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j), triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
