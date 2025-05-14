public class Carro {
    boolean ligado = false;
    int marcha = 0;
    int velocidade = 0;

    void ligar(){
        if(ligado == true){
            System.out.println("O carro já está ligado");
            return;
        }

        ligado = true;
        System.out.println("O carro foi ligado");
    }
    void desligar(){
       if (ligado == false){
           System.out.println("O carro ja está desligado");
           return;
       }
       if (marcha != 0 && velocidade != 0){
           System.out.println("O carro precisa parar antes de desligar");
           return;
       }
       ligado = false;
       System.out.println("O carro foi desligado");
    }

    void acelerar(){
        if(ligado == false){
            System.out.println("O carro precisa estar ligado para acelerar");
            return;
        }
        if(marcha == 0){
            System.out.println("Se o carro estiver no ponto morto ele não pode acelerar");
            return;
        }
        if(velocidade >= 120){
            System.out.println("O carro está em velocidade máxima");
            return;
        }
        if(marcha == 1 && velocidade >= 0 && velocidade <= 20){
            velocidade += 1;
        } else if (marcha== 2 && velocidade >= 21 && velocidade <= 40) {
            velocidade += 1;
        } else if (marcha== 3 && velocidade >= 41 && velocidade <=60) {
            velocidade += 1;
        } else if (marcha== 4 && velocidade >= 61 && velocidade <=80) {
            velocidade += 1;
        } else if (marcha== 5 && velocidade >= 81 && velocidade <=100) {
             velocidade += 1;
        } else if (marcha== 6 && velocidade >= 101 && velocidade <=120) {
            velocidade += 1;
        }
        System.out.println("Acelerando... A velocidade do carro é: " + velocidade);
    }

    void frear(){
        if(ligado == false){
            System.out.println("O carro precisa estar ligado para frear");
            return;
        }
        if(velocidade <= 0){
            System.out.println("O carro já está parado");
            return;
        }
        if(marcha == 1 && velocidade >= 0 && velocidade <= 20){
            velocidade -= 1;
        } else if (marcha== 2 && velocidade >= 21 && velocidade <= 40) {
            velocidade -= 1;
        } else if (marcha== 3 && velocidade >= 41 && velocidade <=60) {
            velocidade -= 1;
        } else if (marcha== 4 && velocidade >= 61 && velocidade <=80) {
            velocidade -= 1;
        } else if (marcha== 5 && velocidade >= 81 && velocidade <=100) {
            velocidade -= 1;
        } else if (marcha== 6 && velocidade >= 101 && velocidade <=120) {
            velocidade -= 1;
        }
        System.out.println("Freando... A velocidade do carro é: " + velocidade);
    }

    void verificarVelocidade(){
        if(ligado == false){
            System.out.println("O carro precisa estar ligado para verificar a velocidade");
            return;
        }
        System.out.println("A velocidade do carro é: " + velocidade + " km/h");
    }

    void trocarMarcha(int marchaInput){
        if(ligado == false){
            System.out.println("O carro precisa estar ligado para trocar a marcha");
            return;
        }
        if (marchaInput == marcha){
            System.out.println("A marcha do carro  já está na posição atual");
            return;
        }
        if (marchaInput < 0 || marchaInput > 6){
            System.out.println("A marcha deve estar entre 0 e 6");
            return;
        }

        if (Math.abs(marchaInput - marcha) == 1){
            marcha = marchaInput;
            System.out.println("A marcha do carro foi trocada para: " + marcha);
        } else {
            System.out.println("A marcha deve ser uma unidade a frente ou trás da atual");
        }
    }

    void virarDireita(){
        if(velocidade >0 && velocidade <= 40){
            System.out.println("virando para a direita");
        }else{
            System.out.println("Não é possível virar para a direita, a velocidade deve ser entre 1 e 40");
        }
    }

    void virarEsquerda(){
        if(velocidade >0 && velocidade <= 40){
            System.out.println("virando para a esquerda");
        }else{
            System.out.println("Não é possível virar para a esquerda, a velocidade deve ser entre 1 e 40");
        }
    }
}