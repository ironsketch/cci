
#include <string>
#include <cstring>
#include <stdio.h>

void permute(std::string & str);
void permute(std::string & str, int low, int high);
void swap(std::string & str, int first, int second);


int main()
{
	std::string permuteStr = "abc";

	permute(permuteStr);

	return 0;
}

void permute(std::string & str)
{
	int stringLen = str.length();

	permute(str, 0, stringLen - 1);
}

void permute(std::string & str, int low, int high)
{
	std::string tempStr = str;
	
	/*if "low" is 2 less than high, that means the base case
	 * has been reached. The program will then print the six
	 * possible combinations that can be formed by swapping 
	 * around the last three elements of the string (because 
	 * 3! == 6).*/
	if (low == (high - 2))
	{
		for (unsigned i = 0; i < 3; i++)
		{
			tempStr = str;
			
			//no swap is done on the first iteration of the for loop
			if (i != 0)
			{
				swap(tempStr, low, low + i);	
			}

			printf("%s ", tempStr.c_str());

			swap(tempStr, low + 1, low + 2);
			printf("%s ", tempStr.c_str());

		}
	}
	/*if base case has not been reached, then recurse the
	 * string but with "low" == low + 1. This, in effect, 
	 * moves the focus towards every character at low and after.
	 * The for loop will swap the character at low with every
	 * character after until the for loop terminates. This makes it
	 * so that every combination that can be formed by swapping around
	 * every character at low and after will eventually be printed out
	 * once the base case is reached. After the for loop terminates, 
	 * the program goes up the recursion stack until the program has reached
	 * the top of the stack and the top stack's for loop has terminated*/
	else
	{
		for (unsigned i = low; i <= high; i++)
		{
			permute(tempStr, low + 1, high);

			tempStr = str; 
			swap(tempStr, low, i + 1);
		}
	}
	
}


void swap(std::string & str, int first, int second)
{
	char tempVar = str[first];
	str[first] = str[second];
	str[second] = tempVar;
}


