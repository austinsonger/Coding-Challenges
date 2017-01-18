using System;
using System.IO;

class Solution {

    static void Main(String[] args) {
        int t = Convert.ToInt32(Console.ReadLine());
        for(int a0 = 0; a0 < t; a0++){
            string[] tokens_n = Console.ReadLine().Split(' ');
            int n = Convert.ToInt32(tokens_n[0]);
            int k = Convert.ToInt32(tokens_n[1]);
            int maximal = 0;
            for (int i = 0; i < n; i ++) {
                for (int j = i + 1; j < n + 1; j++) {
                    int val = i & j;
                    if (maximal < val && val < k) {
                        maximal = val;
                    }
                }
            }
            Console.WriteLine(maximal);
        }
    }
}
