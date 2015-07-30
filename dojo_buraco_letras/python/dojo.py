#!/usr/bin/env python3

i = 0
letras = {'A':1,'B':2,'D':1,'O':1,'P':1,'Q':1,'R':1}
palavra = input("Insira uma palavra: ").upper()

for letra in palavra:
    if letra in letras:
        i = i + letras[letra]

print('Existem', i,'buracos em', palavra)

#>> Existem 4 buracos em INCONSTITUCIONALISSIMAMENTE
