#include <iostream>
using namespace std;

string get_grade(int score) {
    if (score >= 90 && score <= 100) return "A";
    else if (score >= 87 && score <= 89) return "A-";
    else if (score >= 84 && score <= 86) return "B+";
    else if (score >= 80 && score <= 83) return "B";
    else if (score >= 77 && score <= 79) return "B-";
    else if (score >= 74 && score <= 76) return "C+";
    else if (score >= 70 && score <= 73) return "C";
    else if (score >= 67 && score <= 69) return "C-";
    else if (score >= 64 && score <= 66) return "D+";
    else if (score >= 62 && score <= 63) return "D";
    else if (score >= 60 && score <= 61) return "D-";
    else return "F";
}

int main() {
    int score;
    cout << "Enter your score: ";
    cin >> score;
    cout << "Your grade is: " << get_grade(score) << endl;
    return 0;
}
