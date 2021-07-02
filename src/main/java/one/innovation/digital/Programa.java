package one.innovation.digital;

import one.innovation.digital.imc.CalculadorDeImc;
import one.innovation.digital.pessoa.Pessoa;

public class Programa {

    public static void main(String[] args) {
// << O PONTO VERMELHO SIGNIFICA BREAKPOINT, ENTAO ELE PARA O PROCESSO E AGUAR ALGUMA AÇÃO
// FUNCIONA SOMENTE NO MODO DEBUG
//podendo vizualizar variaveis e passar linha por linha
//MUITO LEGAL QUE ELE ESCREVE OS VALORES DAS VARIAVEIS COMENTADAS NA FRENTE DO CODIGO

//Step over pula linha a linha


//EVALUATE PODE VIZUALIZAR EXPRESSOES

        final Pessoa pessoa = new Pessoa("André", 1.9, 100.00);

        final var calculadorDeImc = new CalculadorDeImc();
        final var imc = calculadorDeImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);
    }

}
