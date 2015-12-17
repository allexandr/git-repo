/*

*/

#include <iostream>
using namespace std;

int main() {
	int a, b, c, d;
	cin >> a >> b >> c >> d;
	if (((a - 1 == c) && (b == d)) || ((a + 1 == c) && (b == d)) || ((a - 1 == c) && (b - 1 == d)) || ((a == c) && (b - 1 == d)) ||
		((a + 1 == c) && (b - 1 == d)) || ((a - 1 == c) && (b + 1 == d)) || ((a == c) && (b + 1 == d)) || ((a + 1 == c) && (b + 1 == d)))
		cout << "YES";
	else
		cout << "NO";
	return 0;	
}