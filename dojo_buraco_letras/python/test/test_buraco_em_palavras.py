import unittest
from app.dojo import ContaBuraco

class Teste_Buracos_na_Palavra(unittest.TestCase):
    def test_dado_a_palavra_ABELHA_retorne_4(self):
        contador = ContaBuraco()
        palavra = 'ABELHA'
        resultado = contador.contar(palavra)

        self.assertEqual(4, resultado)

    def test_dado_a_palavra_abelha_retorne_0(self):
        contador = ContaBuraco()
        palavra = 'abelha'
        resultado = contador.contar(palavra)

        self.assertEqual(0, resultado)

    def test_dado_apenas_numeros_retorne_0(self):
        contador = ContaBuraco()
        palavra = 2345666
        resultado = contador.contar(palavra)

        self.assertEqual(0, resultado)

if __name__ == '__main__':
    unittest.main()
