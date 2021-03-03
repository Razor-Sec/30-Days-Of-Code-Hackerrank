#include <iostream>
#include <map>
using namespace std;

int main(){
	int n;
	string name,number,key;
	cin >> n;
	map<string,string>phonebook;
	for (int i = 0; i < n; ++i)
	{
		/* code */
		cin >> name >> number;
		phonebook[name]=number;

	}
	while(cin>>key){
		if (phonebook.find(key)!= phonebook.end())
		{
			/* code */
			cout << key <<"="<<phonebook.find(key)->second<<endl;

		}
		else{
			cout << "Not found"<<endl;
		}
	}

	cin.get();
	return 0;
}
