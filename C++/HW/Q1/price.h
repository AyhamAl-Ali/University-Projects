#include "iostream"
using namespace std;

namespace pr {

class Price {


    // Private varaibles
    private:
        int dinars;
        int piasters;

    public:
        // Constructor
        Price(int dinars, int piasters) {

            if (dinars < 0) {
                cout << "ERROR: Dinars value must be greater than 0." << endl;
                return;
            };

            if (piasters < 0 || piasters > 99) {
                cout << "ERROR: Piasteres value must be in the range 0 to 99." << endl;
                return;
            };

            this->dinars = dinars;
            this->piasters = piasters;
        };

        // Setters
        void setDinars(int dinars) {

            if (dinars < 0) {
                cout << "ERROR: Dinars value must be greater than 0." << endl;
                return;
            };

            this->dinars = dinars;
        };

        void setPiasters(int dinars) {

            if (piasters < 0 || piasters > 99) {
                cout << "ERROR: Piasteres value must be in the range 0 to 99." << endl;
                return;
            };

            this->piasters = piasters;
        };

        // Getters
        int getDinars() {
            return dinars;
        };

        int getPiasteres() {
            return piasters;
        };

        // print function
        void printPrice(); // member function




};
};
