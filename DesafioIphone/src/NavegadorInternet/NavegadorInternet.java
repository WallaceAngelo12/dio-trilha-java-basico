package NavegadorInternet;

public class NavegadorInternet implements NavegadorInterface{

    private String url;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    public void exibirPagina(String url){
        setUrl(url);
        System.out.println("Exibindo a página " + url);

    }

    public void adcionarAba(){
        System.out.println("Adcionando nova aba");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando a página");
    }
}
