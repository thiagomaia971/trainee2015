#!/usr/bin/env python3

class ContaBuraco():
    def contar(self, palavra):
        i = 0
        letras = {'A':1,'B':2,'D':1,'O':1,'P':1,'Q':1,'R':1}

        #int não são iteraveis
        if (isinstance(palavra, int)):
            palavra = str(palavra)

        for letra in palavra:
            if letra in letras:
                i = i + letras[letra]

        return i
