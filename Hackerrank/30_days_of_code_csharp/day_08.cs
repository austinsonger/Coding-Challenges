using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        int N = Convert.ToInt32(Console.ReadLine());
        Dictionary<string, string> numbers = new Dictionary<string, string>();
        for (int i = 0; i < N; i++) {
            string[] entry = Console.ReadLine().Split();
            numbers[entry[0]] = entry[1];
        }
        string query = Console.ReadLine();
        while (query != null) {
            if (numbers.ContainsKey(query)) {
                Console.WriteLine(query + "=" + numbers[query]);
            } else {
                Console.WriteLine("Not found");
            }
            query = Console.ReadLine();
        }
        
    }
}
