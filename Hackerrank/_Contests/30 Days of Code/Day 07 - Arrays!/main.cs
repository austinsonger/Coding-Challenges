using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        string[] A = Console.ReadLine().Split(' ');
        string out_str = "";
        for(int i = 0; i < n - 1; i++){
            out_str = " " + A[i] + out_str;
        }
        out_str = A[n - 1] + out_str;
        Console.WriteLine(out_str);
    }
}
