#include <iostream>
#include <vector>

using namespace std;

class Person{
    protected:
        string firstName;
        string lastName;
        int id;

    public:
        Person(string firstName, string lastName, int identification){
            this->firstName = firstName;
            this->lastName = lastName;
            this->id = identification;
        }

        void printPerson(){
            cout<< "Name: "<< lastName << ", "<< firstName <<"\nID: "<< id << "\n";
        }
};

class Student : public Person{
    private:
        vector<int> testScores;

    public:
        Student(string firstName, string lastName, int identification, vector<int> scores)
        : Person(firstName, lastName, identification) {
            this->testScores = scores;
        }

        char calculate() {
            float average = 0;
            char out_value = 'T';
            for (int i = 0; i < this->testScores.size(); i++) {
                average += this->testScores[i];
            }
            average = average / this->testScores.size();
            if (90 <= average && average <= 100) out_value = 'O';
            else if (80 <= average && average < 90) out_value = 'E';
            else if (70 <= average && average < 80) out_value = 'A';
            else if (55 <= average && average < 70) out_value = 'P';
            else if (40 <= average && average < 55) out_value = 'D';
            else out_value = 'T';
            return out_value;
        }
};

int main() {
    string firstName;
      string lastName;
    int id;
      int numScores;
    cin >> firstName >> lastName >> id >> numScores;
      vector<int> scores;
      for(int i = 0; i < numScores; i++){
          int tmpScore;
          cin >> tmpScore;
        scores.push_back(tmpScore);
    }
    Student* s = new Student(firstName, lastName, id, scores);
    s->printPerson();
    cout << "Grade: " << s->calculate() << "\n";
    return 0;
}
