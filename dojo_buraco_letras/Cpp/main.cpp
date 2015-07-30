#include <iostream>
#include <stdio.h>
#include <string.h>

using namespace std;

int main(){
    char palavra[] = "WOW";
	int Contador_Buracos = 0;
	char aux;
	for (int i = 0; i < strlen(palavra); i++) {
		aux = palavra[i];
		if (aux == 'A'||aux == 'D'||aux == 'O'||aux == 'P'||aux == 'Q'||aux == 'R') {
			Contador_Buracos = Contador_Buracos + 1;
		} else if (aux == 'B') {
			Contador_Buracos = Contador_Buracos + 2;
		}
	}
   cout << Contador_Buracos << endl; 
   return 0;
}
