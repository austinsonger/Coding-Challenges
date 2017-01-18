using System;
using System.Collections.Generic;
using System.IO;

class Solution {
    static void Main(String[] args) {
        int[] return_date = Array.ConvertAll(Console.ReadLine().Split(' '), Int32.Parse);
        int[] expected_date = Array.ConvertAll(Console.ReadLine().Split(' '), Int32.Parse);

        if (return_date[2] > expected_date[2]) Console.WriteLine(10000);
        else if (return_date[1] > expected_date[1]) Console.WriteLine(500 * (return_date[1] - expected_date[1]));
        else if (return_date[0] > expected_date[0]) Console.WriteLine(15 * (return_date[0] - expected_date[0]));
        else Console.WriteLine(0);
    }
}
