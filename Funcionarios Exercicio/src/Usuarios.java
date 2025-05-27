public abstract class Usuarios {

    protected String nome;
    protected String email;
    protected String senha;
    protected boolean admin;


    public Usuarios(String nome, String email, String senha, boolean admin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.admin = admin;
    }

    public void realizarLogin(String email, String senha){
        if(this.email.equals(email) && this.senha.equals(senha)){
            System.out.println("Login efetuado com sucesso!");
        }else{
            System.out.println("Email ou senha incorretos!");
        }
    }

    public void realizarLogout(){
        System.out.println("Logout efetuado com sucesso!");
    }

    public void alterarDados(String novoNome, String novoEmail){
        this.nome = novoNome;
        this.email = novoEmail;
        System.out.println("Dados alterados com sucesso!");
    }

    public void alterarSenha(String novaSenha){
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso!");
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }


    public boolean isAdmin() {
        return admin;
    }
}

