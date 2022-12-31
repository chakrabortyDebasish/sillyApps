#include<iostream>
#include<math.h>
using namespace std;

int bmiCalculator(int weight, float height) {
    float bmi = weight/pow(height,2);
    return round(bmi);
}

int main() {
    int weight;
    float height;
    cin>>weight>>height;
    
    cout<<bmiCalculator(weight,height);
    
    return 0;   
}

