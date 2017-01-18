#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <regex>
using namespace std;

template< typename T >
typename vector<T>::iterator 
   insert_sorted( vector<T> & vec, T const& item )
{
    return vec.insert
        ( 
            upper_bound( vec.begin(), vec.end(), item ),
            item 
        );
}

bool is_gmail(const string& email)
{
   // define a regular expression
   static regex pattern
        ("(\\w+)(\\.|_)?(\\w*)@(gmail)(\\.(\\w+))+");

   // try to match the string with the regular expression
   return regex_match(email, pattern);
}

int main() {
    int N; cin >> N;
    vector<string> names;
    for(int a0 = 0; a0 < N; a0++){
        string firstName;
        string emailID;
        cin >> firstName >> emailID;
        if(is_gmail(emailID)){
            insert_sorted(names, firstName);
        }
    }
    for(int a0=0;a0<N;++a0) cout << names[a0]<<endl;
    return 0;
}