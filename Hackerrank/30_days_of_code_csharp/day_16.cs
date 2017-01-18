using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        string S = Console.ReadLine();
        try {
            int data = Int32.Parse(S);
            Console.WriteLine(data);
        }
        catch (FormatException e) {
            Console.WriteLine("Bad String");
        }
    }

}
