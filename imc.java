// programa para calcular Índice de Massa Corporal
//Atividade Ciclo3

import javax.swing.*;

public class imc {
    public static void main(String[] args) {

        String peso;
        String altura;


        peso = JOptionPane.showInputDialog("Digite seu peso Kg: ");
        float p = Float.parseFloat(peso);

        altura = JOptionPane.showInputDialog("Digite sua altura cm: ");
        float a = Float.parseFloat(altura);

        float imc = p/(a*a);

        System.out.println("Seu IMC = "+imc);


        // tabela IMC https://pt.wikipedia.org/wiki/%C3%8Dndice_de_massa_corporal:
        if (imc <= 17) {
            System.out.println("Muito abaixo do peso");
        } else if ((imc >17) && (imc <=18.49)) {
            System.out.println("Abaixo do peso");
        } else if ((imc > 18.49) && (imc<=24.99)) {
            System.out.println("Peso normal");
        } else if ((imc > 24.99) && (imc <=29.99)) {
            System.out.println("Acima do peso");
        }else if ((imc > 29.99) && (imc <=34.99)) {
            System.out.println("Obesidade II (severa)");
        }else {
            System.out.println("Obesidade III (mórbida)");


    }

}

}
