using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        int[] A = Array.ConvertAll(Console.ReadLine().Split(' '), Int32.Parse);
        int total_swaps = 0;
        for (int i = 0; i < n; i++) {
            int swap = 0;
            for (int j = 0; j < n - 1; j++) {
                if (A[j] > A[j + 1]) {
                    int x = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = x;
                    swap++;
                }
            }
            total_swaps += swap;
            if (swap == 0) {
                break;
            }
        }
        Console.WriteLine("Array is sorted in " + total_swaps + " swaps.");
        Console.WriteLine("First Element: " + A[0]);
        Console.WriteLine("Last Element: " + A[n - 1]);
    }

}
