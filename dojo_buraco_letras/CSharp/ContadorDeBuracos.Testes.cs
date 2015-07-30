using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Exemplo.Testes
{
    [TestClass]
    public class Com_Um_Contador_De_Buracos
    {
        [TestMethod]
        public void Quando_Passo_A_Palavra_ABELHA_Recebo_4()
        {
            var cb = new ContadorDeBuracos();
            var palavra = "ABELHA";
            var resultado = cb.Contar(palavra);
            Assert.AreEqual(4, resultado);
        }

        [TestMethod]
        public void Quando_Passo_Nulo_Recebo_0()
        {
            var cb = new ContadorDeBuracos();
            string palavra = null;
            var resultado = cb.Contar(palavra);
            Assert.AreEqual(0, resultado);
        }

        [TestMethod]
        public void Quando_Passo_Numeros_Recebo_0()
        {
            var cb = new ContadorDeBuracos();
            string palavra = "123";
            var resultado = cb.Contar(palavra);
            Assert.AreEqual(0, resultado);
        }
    }
}
