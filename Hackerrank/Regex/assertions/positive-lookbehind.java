//https://www.hackerrank.com/challenges/positive-lookbehind
public class Solution {    
  public static void main(String[] args) {
    Regex_Test tester = new Regex_Test();
    tester.checker("(?<=[13579])\\d");
  }
}
