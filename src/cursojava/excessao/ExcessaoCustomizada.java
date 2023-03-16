package cursojava.excessao;

public class ExcessaoCustomizada extends Exception{
    public ExcessaoCustomizada(String erro) {
        super("vixe erro ao processar arquivo"+erro);
    }
}
