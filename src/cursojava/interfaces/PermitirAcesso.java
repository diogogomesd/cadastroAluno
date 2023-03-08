package cursojava.interfaces;

//essa inteface é o contrato de autenticacao
public interface PermitirAcesso {

    public boolean autenticar(String login, String senha);
    public boolean autenticar();
}
