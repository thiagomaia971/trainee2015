using System.IO;
using System;

class Program{
    static void Main(){
        int[,] numeros = new int[7, 2] {{'A', 1}, {'B', 2}, {'D', 1}, {'O', 1}, {'P', 1}, {'Q', 1}, {'R', 1}};
        String palavra="WOOOW BADASS";
        int count=0;
        for(int i=0;i<palavra.Length;i++){
            for(int j=0;j<numeros.GetUpperBound(0);j++){
                if (palavra[i] == numeros[j,0]){
                    count+=numeros[j,1];
                    break;
                }
            }
        }
        Console.WriteLine("Buracos:");
        Console.WriteLine(count);
    }
}
