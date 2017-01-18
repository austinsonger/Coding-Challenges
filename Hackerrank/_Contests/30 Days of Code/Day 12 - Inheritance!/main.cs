using System;

class Person{
    protected string firstName;
    protected string lastName;
    protected int id;

    public Person(){}
    public Person(string firstName, string lastName, int identification){
            this.firstName = firstName;
            this.lastName = lastName;
            this.id = identification;
    }
    public void printPerson(){
        Console.WriteLine("Name: " + lastName + ", " + firstName + "\nID: " + id);
    }
}

class Student : Person{
    private int[] testScores;

    public Student(string firstName, string lastName, int id, int[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.testScores = testScores;
    }

    public char calculate(){
        int a = 0;
        for(int i = 0; i < testScores.Length; i++){
            a = a + testScores[i];
        }
        a = a / testScores.Length;
        if (90 <= a && a <= 100) return 'O';
        if (80 <= a && a < 90) return 'E';
        if (70 <= a && a < 80) return 'A';
        if (55 <= a && a < 70) return 'P';
        if (40 <= a && a < 55) return 'D';
        return 'T';
    }
}

class Solution {
    static void Main(){
        string[] inputs = Console.ReadLine().Split();
        string firstName = inputs[0];
          string lastName = inputs[1];
        int id = Convert.ToInt32(inputs[2]);
        int numScores = Convert.ToInt32(Console.ReadLine());
        inputs = Console.ReadLine().Split();
          int[] scores = new int[numScores];
        for(int i = 0; i < numScores; i++){
            scores[i]= Convert.ToInt32(inputs[i]);
        }

        Student s = new Student(firstName, lastName, id, scores);
        s.printPerson();
        Console.WriteLine("Grade: " + s.calculate() + "\n");
    }
}
