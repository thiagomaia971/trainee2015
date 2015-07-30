using System.Collections.Generic;

namespace Exemplo
{
    public class ContadorDeBuracos
    {
        Dictionary<char, int> buracos = new Dictionary<char, int>() { 
                { 'A', 1 }, { 'B', 2 }, { 'D', 3 }, { 'O', 4 }, { 'P', 1 }, { 'Q', 1 }, {'R', 1 }
            };

        int contadorBuracos = 0;
        int qtd = 0;

        public int Contar(string palavra)
        {
            if (string.IsNullOrEmpty(palavra)) return 0;

            foreach (char letra in palavra)
            {
                buracos.TryGetValue(letra, out qtd);
                contadorBuracos += qtd;
            }
            return contadorBuracos;
        }

    }
}
