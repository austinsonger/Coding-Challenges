using System;
using System.Collections.Generic;
using System.IO;

class Solution {
    static String is_prime(int n){
        if(n == 1) return "Not prime";
        double limit = Math.Sqrt(n);
        for (double i = 2; i <= limit; i++) {
            if (n % i == 0) return "Not prime";
        }
        return "Prime";
    }

    static void Main(String[] args){
        int T = Int32.Parse(Console.ReadLine());
        while (T-- > 0) {
            int n = Int32.Parse(Console.ReadLine());
            Console.WriteLine(is_prime(n));
        }
    }
}
