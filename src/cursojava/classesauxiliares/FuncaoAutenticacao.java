package cursojava.classesauxiliares;

import cursojava.interfaces.PermitirAcesso;

//realmente permitir acesso quem tem o contrato de interface de permitir acessso e chamar o autenticar
public class FuncaoAutenticacao {

    private PermitirAcesso permitirAcesso;
    public boolean autenticar(){
        return permitirAcesso.autenticar();
    }
    public FuncaoAutenticacao(PermitirAcesso acesso){
        this.permitirAcesso = acesso;
    }
}
