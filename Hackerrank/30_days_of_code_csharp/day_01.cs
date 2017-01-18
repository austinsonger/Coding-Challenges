using System;
using System.Collections.Generic;
using System.IO;

class Solution {
    static void Main(String[] args) {
        int i = 4;
        double d = 4.0;
        string s = "HackerRank ";
        // Declare second integer, double, and String variables.
        int i_2;
        double d_2;
        string s_2;

        // Read and save an integer, double, and String to your variables.
        i_2 = Convert.ToInt32(Console.ReadLine());
        d_2 = Convert.ToDouble(Console.ReadLine());
        s_2 = Console.ReadLine();

        // Print the sum of both integer variables on a new line.
        Console.WriteLine(i + i_2);

        // Print the sum of the double variables on a new line.
        Console.WriteLine(String.Format("{0:0.0}", d + d_2));

        // Concatenate and print the String variables on a new line
        // The 's' variable above should be printed first.
        Console.WriteLine(s + s_2);
    }
}
