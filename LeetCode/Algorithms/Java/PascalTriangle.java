/*
 * Given numRows, generate the first numRows of Pascal's triangle.

 * For example, given numRows = 5,
 * Return

 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 */
public class PascalTriangle {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int n = 0; n < numRows; n++) {
            int nCk = 1;
            List<Integer> list = new ArrayList<Integer>();
            for (int k = 0; k <= n; k++) {
                list.add(nCk);
                nCk = nCk * (n - k) / (k + 1);
            }
            result.add(list);
        }
        return result;
    }

}
