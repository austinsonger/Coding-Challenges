using System;
using System.Collections;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;

class Solution {

    static void Main(String[] args) {
        ArrayList names = new ArrayList();
        Regex tester = new Regex(@".+@gmail\.com", RegexOptions.IgnoreCase);
        int n = Convert.ToInt32(Console.ReadLine());

        for(int i = 0; i < n; i++){
            string[] entry = Console.ReadLine().Split(' ');
            if (tester.Match(entry[1]).Success) names.Add(entry[0]);
        }

        names.Sort();

        foreach (string name in names) {
            Console.WriteLine(name);
        }
    }
}
