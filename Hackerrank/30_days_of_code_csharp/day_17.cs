using System;

class Calculator {
    public int power(int n, int p) {
        if (n < 0 || p < 0) throw new Exception("n and p should be non-negative");
        else return (int)Math.Pow(n, p);
    }
}

class Solution {
    static void Main(String[] args) {
        Calculator myCalculator = new  Calculator();
        int T = Int32.Parse(Console.ReadLine());
        while (T-- > 0) {
            string[] num = Console.ReadLine().Split();
            int n = int.Parse(num[0]);
            int p = int.Parse(num[1]);
            try {
                Console.WriteLine(myCalculator.power(n,p));
            }
            catch (Exception e) {
               Console.WriteLine(e.Message);
            }
        }
    }
}
