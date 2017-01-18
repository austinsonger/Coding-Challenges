using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {
    static void Main(String[] args) {
        int value = Convert.ToInt32(Console.ReadLine());
        string binary = Convert.ToString(value, 2);
        int size = binary.Length;
        int streak = 0;
        int max_streak = 0;
        for (int i = 0; i < size; i++) {
            if (binary[i] == '1') streak++;
            if (binary[i] == '0') {
                if (streak > max_streak) max_streak = streak;
                streak = 0;
            }
        }
        if (streak > max_streak) max_streak = streak;
        Console.WriteLine(max_streak);
    }
}
