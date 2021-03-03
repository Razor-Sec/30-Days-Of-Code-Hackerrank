#include <bits/stdc++.h>
using namespace std;

int main() {
  int array[10000];
  int N;
  cin >> N;

  for (int i=0; i < N;i++){
  	cin >> array[i];
  }
  for (int j=N-1;j >= 0; j--)
  	cout << array[j]<<" ";

  return 0;
}
