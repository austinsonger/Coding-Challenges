using System;
using System.Collections.Generic;
using System.IO;
class Solution {
    static void Main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
        double meal_cost;
        int tip_percent;
        int tax_percent;

        meal_cost = Convert.ToDouble(Console.ReadLine());
        tip_percent = Convert.ToInt32(Console.ReadLine());
        tax_percent = Convert.ToInt32(Console.ReadLine());

        double tip = meal_cost * tip_percent / 100;
        double tax = meal_cost * tax_percent / 100;

        Console.WriteLine("The total meal cost is {0:0} dollars.", meal_cost + tip + tax);

    }
}
