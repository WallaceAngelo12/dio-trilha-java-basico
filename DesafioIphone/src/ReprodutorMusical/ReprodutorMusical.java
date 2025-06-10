package ReprodutorMusical;

public class ReprodutorMusical implements ReprodutorMusicalInter {
    private String musica;
    private boolean tocando = false;


    public  String getMusica() {
        return musica;
    }

    public void selecionarMusica(String musica) {
        this.musica = musica;
        tocando = true;
    }

    public void tocar(){
        if(tocando==false){
            System.out.println("primeiro selecione a musica");
            return;
        }
        System.out.println("Reprodutor Musical tocando " + musica);

    }

    public void pausar(){
        System.out.println("Reprodutor Musical pausando");

    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
}
