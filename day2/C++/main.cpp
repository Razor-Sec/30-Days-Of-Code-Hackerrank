#include <cmath>
#include <cstdio>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	double mcost, tcost, taxCost;
	cin >> mcost;
	cin >> tcost;
	cin >> taxCost;

	tcost = mcost * (tcost / 100);
	taxCost = mcost * (taxCost / 100);

	mcost = mcost + tcost + taxCost;

	if ((mcost - (int)mcost) > 0.5) {
		mcost = ceil(mcost);
	}
	else {
		mcost = floor(mcost);
	}

	cout << "The total meal cost is " << mcost << " dollars." << endl;

	return 0;
}
