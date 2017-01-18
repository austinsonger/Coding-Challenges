using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static int get_hg_value(int[][] A, int i, int j) {
        int sum = 0;
        // First row
        sum += A[i][j] + A[i][j + 1] + A[i][j + 2];
        // Seccond row
        sum += A[i + 1][j + 1];
        // Third row
        sum += A[i + 2][j] + A[i + 2][j + 1] + A[i + 2][j + 2];
        return sum;
    }

    static void Main(String[] args) {
        int A_size = 6;
        int[][] A = new int[A_size][];
        for (int i = 0; i < A_size; i++) {
           string[] row = Console.ReadLine().Split(' ');
           A[i] = Array.ConvertAll(row, Int32.Parse);
        }

        int hg_size = A_size - 2;
        int max_hg_value = -100000;
        for (int i = 0; i < hg_size; i++){
            for (int j = 0; j < hg_size; j++) {
                int hg_value = get_hg_value(A, i, j);
                if (hg_value > max_hg_value) max_hg_value = hg_value;
            }
        }
        Console.WriteLine(max_hg_value);

    }
}
