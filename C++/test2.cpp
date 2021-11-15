
/**
4- Reads the population (تعداد السكان في بلدة) of town A,
 its growth rate (معدل النمو), the population of town B,
  and its growth rate. It outputs the number of years after
   which the population of town A is greater than that of town B
    and the values of their population at that time.

	Made with ❤ by Ayham Al-Ali
**/

#include <iostream>
using namespace std;

int main()
{
	int popA, popB, years = 1;
	double groA, groB;

	cout<< "Enter Population of town A: ";
	cin>> popA;
	cout<< "Enter Growth Rate of town A: ";
	cin>> groA;

	cout<< "Enter Population of town B: ";
	cin>> popB;
	cout<< "Enter Growth Rate of town B: ";
	cin>> groB;

	int t_popA = popA, t_popB = popB; // Temp vars to keep backup of the original input values

	if (popA > popB || groA < groB) {
 		cout<< "ERROR: Invalid Data.";
 		return 0;
	}

	while(t_popA < t_popB && groA > groB)
	{
		t_popA = (groA / 100) * t_popA + t_popA;
		t_popB = (groB / 100) * t_popB + t_popB;
		years++;

	}

	cout << "\nPopulation of Town A will surpass Population of Town B after: " << years << " year(s).\n";
	cout << "Population of Town A will be: " << t_popA << "\n";
	cout << "Population of Town B will be: " << t_popB << "\n";

	return 0;

}
