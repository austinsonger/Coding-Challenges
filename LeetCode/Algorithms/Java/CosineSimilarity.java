/*
 * Cosine similarity is a measure of similarity between two vectors of an inner 
 * product space that measures the cosine of the angle between them. The cosine 
 * of 0��is 1, and it is less than 1 for any other angle.

See wiki: Cosine Similarity

Here is the formula:

/media/problem/cosine-similarity.png

Given two vectors A and B with the same size, calculate the cosine similarity.

Return 2.0000 if cosine similarity is invalid (for example A = [0] and B = [0]).

Example
Given A = [1, 2, 3], B = [2, 3 ,4].

Return 0.9926.

Given A = [0], B = [0].

Return 2.0000
 */
public class CosineSimilarity {

    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    public double cosineSimilarity(int[] A, int[] B) {
        if (A == null || A.length == 0 || B == null || 
                B.length == 0 || A.length != B.length) {
            return 2.0000;
        }
        double lenA = 0;
        double lenB = 0;
        double product = 0;
        for (int i = 0; i < A.length; ++i) {
            lenA += A[i] * A[i];
            lenB += B[i] * B[i];
            product += A[i] * B[i];
        }
        if (lenA + lenB == 0) {
            return 2.0000;
        }
        if (lenA == 0 || lenB == 0) {
            return 1.0000;
        }
        double d = product / Math.sqrt(lenA * lenB);
        return (double) Math.round(d * 10000) / 10000;
    }

}
