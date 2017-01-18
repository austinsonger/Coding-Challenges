using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        int T = Convert.ToInt32(Console.ReadLine());
        for(int i = 0; i < T; i++){
            String entry = Console.ReadLine();
            String odd = "";
            String even = "";
            for(int j = 0; j < entry.Length; j++){
                if(j % 2 == 0) odd = odd + entry[j];
                else even = even + entry[j];
            }
            Console.WriteLine(odd + " " + even);
        }
    }
}
