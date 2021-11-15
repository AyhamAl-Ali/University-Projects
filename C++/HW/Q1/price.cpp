#include "iostream"
#include "price.h" // including price header

using namespace std;
using namespace pr; // using namename pr from price header

// Calling Price constructor
Price price = Price(5, 85); // 5.85 JD

// print function
void printPrice() {
    cout << "Price in JD: " << price.getDinars() << " dianr(s) and " << price.getPiasteres() << " piaster(s)." << endl;
};


int main() {

    // call print function
    printPrice();

};

