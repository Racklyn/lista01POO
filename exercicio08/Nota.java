package exercicio08;

public class Nota implements IInfo {
    private double valor = 0;
    private String nomeAssunto;

    public Nota(double valor, String nomeAssunto){
        setValor(valor);
        setNomeAssunto(nomeAssunto);
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        if (!(valor < 0 || valor > 10)){
            this.valor = valor;
        }else{
            System.out.println("NOTA INVÁLIDA: O valor da nota deve estar em [0,10]");
        }
    }
    public String getNomeAssunto() {
        return nomeAssunto;
    }
    public void setNomeAssunto(String nomeAssunto) {
        if (nomeAssunto.length() > 0){
            this.nomeAssunto = nomeAssunto;
        }else{
            System.out.println("NOME DO ASSUNTO INVÁLIDO: Não pode ser vazio");
        }
    }

    @Override
    public String retornarInfo() {
        return String.format("(%.2f) - ", valor) + nomeAssunto;
    }
    
}
