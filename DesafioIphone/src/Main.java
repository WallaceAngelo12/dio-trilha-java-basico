import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
import ReprodutorMusical.ReprodutorMusical;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int option = 0;
    int menu;

    AparelhoTelefonico aparelho = new AparelhoTelefonico();
    NavegadorInternet navegador = new NavegadorInternet();
    ReprodutorMusical reprodutor = new ReprodutorMusical();


    while (option != -1) {
        System.out.println("Menu iphone");
        System.out.println("1. Aparelho Telefonico");
        System.out.println("2. Navegar na internet");
        System.out.println("3. Reprodutor Musical");
        System.out.println("4. Sair");
        option = scanner.nextInt();
        switch (option) {
            case 1 -> {

                System.out.println("O que deseja fazer? ");
                System.out.println("1. ligar");
                System.out.println("2. atender");
                System.out.println("3. iniciar Correio de Voz");
                System.out.println("4. Sair");
                menu = scanner.nextInt();
                switch (menu) {
                    case 1 -> {
                        System.out.println("Disque um número: ");
                        scanner.nextLine();
                        String numero = scanner.nextLine();
                        aparelho.ligar(numero);
                    }

                    case 2 -> {
                        aparelho.atender();
                    }
                    case 3 -> {
                        aparelho.iniciarCorreioVoz();
                    }
                    case 4 -> {
                        System.out.println("Saindo");
                    }
                    default -> System.out.println("Opção inválida!");
                }

            }
            case 2 -> {
                System.out.println("O que deseja fazer? ");
                System.out.println("1. exibir página");
                System.out.println("2. Adicionar Nova Aba");
                System.out.println("3. atualizar página");
                System.out.println("4. Sair");
                menu = scanner.nextInt();
                switch (menu) {
                    case 1 -> {
                        System.out.println("Qual página deseja acessar? ");
                        scanner.nextLine();
                        String url = scanner.nextLine();
                        navegador.exibirPagina(url);
                    }
                    case 2 -> {
                        navegador.adcionarAba();
                    }
                    case 3 -> {
                        navegador.atualizarPagina();
                    }
                    case 4 -> {
                        System.out.println("Saindo");
                    }
                    default -> System.out.println("Entrada inválida!");
                }

            }
            case 3 -> {
                System.out.println("O que deseja fazer? ");
                System.out.println("1. tocar musica");
                System.out.println("2. pausar musica");
                System.out.println("3. selecionar Musica");
                System.out.println("4. Sair");
                menu = scanner.nextInt();
                switch (menu) {
                    case 1 -> {
                        reprodutor.tocar();
                    }
                    case 2 -> {
                        reprodutor.pausar();
                    }
                    case 3 -> {
                        System.out.println("Digite o nome da musica: ");
                        scanner.nextLine();
                        String musica = scanner.nextLine();
                        reprodutor.selecionarMusica(musica);
                    }
                    case 4 -> {
                        System.out.println("Saindo");
                    }
                    default -> System.out.println("Digite uma entrada válida.");
                }
            }
            case 4 -> {
                System.out.println("saindo");
                option = -1;
            }
            default -> System.out.println("Digite ua entrada válida.");

        }
    }
}
