var soma = 0,
    letras = {'A': 1, 'B': 2, 'D': 1, 'O': 1, 'P': 1, 'Q': 1, 'R': 1},
    palavra = 'INCONSTITUCIONALISSIMAMENTE';

for (var i = 0; i <= palavra.length; i++) {
    letra = palavra.charAt(i);
    if (letra in letras) {
       soma = soma + letras[letra];
    }
}
       console.log("Existem " + soma + " buracos em " + palavra);




//
// for (letra in palavra) {//melhor aqui, viu?
//     if (letra in letras) {
//         i = i + letras[letra];
//         console.log("Existem " + i + "buracos em " + palavra);
//     }
// }
