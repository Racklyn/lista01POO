package exercicio08;

import java.util.Arrays;

public class Aluno implements IInfo {
    private String nomeCompleto = "";
    private String matricula = "";
    private Nota[] notas;
    private double notaSemestral = 0;
    private double notaFinal = 0;

    public Aluno(){

    }

    public Aluno(String nomeCompleto, String matricula, Nota[] notas){
        setNomeCompleto(nomeCompleto);
        setMatricula(matricula);
        setNotas(notas);
    }


    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        if (nomeCompleto.length() <= 50 && nomeCompleto.split(" ").length > 1){
            this.nomeCompleto = nomeCompleto;
        }else{
            System.out.println("NOME INVÁLIDO: Digite nome e sobrenome, totalizando no máximo 50 caracteres.");
        }
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        if (matricula.length()==8 && matricula.startsWith("201")){
            this.matricula = matricula;
        }else{
            System.out.println("MATRÍCULA INVÁLIDA: A matrícula deve conter exatamente 8 caracteres e começar com \'201\'");
        }
    }
    public Nota[] getNotas() {
        return notas;
    }
    public void setNotas(Nota[] notas) {
        
        if (notas.length >=5 ){
            this.notas = Arrays.copyOfRange(notas, 0, 5);
            
            double menorNota = 10;
            double soma = 0;
    
            for (Nota n: this.notas){
                double valor = n.getValor();
                soma += valor;
                if (valor < menorNota){
                    menorNota = valor;
                }
            }

            //Eliminando menor nota para cálculo:
            soma -= menorNota;
            this.notaSemestral = soma/4;
            this.atualizarNotaFinal();
        }else{
            System.out.println("Quantidade de NOTAS INVÁLIDA: É necessário inserir 5 notas");
        }

    }
    public double getNotaFinal() {
        return notaFinal;
    }
    private void atualizarNotaFinal(){
        // Aplicando bonificação:
        double notaFinal;
        if (this.notaSemestral < 6){
            notaFinal = this.notaSemestral - this.notaSemestral * 0.25;
        }else if (this.notaSemestral < 7){
            notaFinal = 7;
        }else if (this.notaSemestral <= 8){
            notaFinal =  this.notaSemestral + this.notaSemestral * 0.15;
        }else {
            notaFinal = 10;
        }

        this.notaFinal = notaFinal;
    }

    @Override
    public String retornarInfo() {
        String notasInfo = "";
        for (Nota n: this.notas){
            notasInfo += n.retornarInfo() + "\n";
        }
        return "Matrícula: " + matricula
            + "\nNome: " + nomeCompleto
            + "\nNotas------------------\n"
            + notasInfo
            + "-----------------------\n"
            + String.format("Semestral: %.2f ; Final: %.2f", notaSemestral, notaFinal);
    }
    
}
