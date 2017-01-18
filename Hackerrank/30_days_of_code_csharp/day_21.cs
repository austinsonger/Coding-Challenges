using System;

public class Solution {

    public static void printArray<T>(T[] A){
       for (int i = 0; i < A.Length; i++) {
           Console.WriteLine(A[i]);
       }
    }

    static void Main(string[] args) {
        int[] vInt = new int[] {1, 2, 3};
        string[] vString = new string[] {"Hello", "World"};

        printArray<int>(vInt);
        printArray<string>(vString);
    }
}
