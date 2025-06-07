import java.util.Scanner;

public class Main {
    private final static Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {
        int option = -1;
        GeometricArea geometricArea = null;
        while (true) {
            System.out.println("Digite a forma geométrica para calcular a area: ");
            System.out.println("1- Quadrado");
            System.out.println("2- Retangulo");
            System.out.println("3- Circulo");
            System.out.println("4- Sair do programa");
            option = scanner.nextInt();
            if(option == 1) {
                geometricArea = createSquare();
            } else if(option == 2) {
                geometricArea = createRectangle();
            } else if(option == 3){
                geometricArea = createCircle();
            }else if(option == 4){
                break;
            } else{
                System.out.println("Opção inválida!");
                continue;
            }
            System.out.println("O resultado do cálculo da área foi de " + geometricArea.getArea());
        }
    }
    private static GeometricArea createSquare(){
        System.out.println("Digite o valor dos lados: ");
        var side = scanner.nextDouble();
        return new Square(side);
    }

    private static GeometricArea createRectangle(){
        System.out.println("Digite o valor da base: ");
        var base = scanner.nextDouble();
        System.out.println("Digite o valor da altura: ");
        var height = scanner.nextDouble();
        return new Rectangle(base, height);
    }

    private static GeometricArea createCircle(){
        System.out.println("Digite o valor do raio ");
        var radius = scanner.nextDouble();
        return new Circle(radius);
    }
}
