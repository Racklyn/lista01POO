package exercicio10;

import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String cargo;
    private String matricula;
    private String email;
    private ArrayList<Email> emailsEnviados = new ArrayList<Email>();
    private ArrayList<Email> emailsRecebidos = new ArrayList<Email>();

    public Funcionario(String nome, String cargo, String matricula, String email) {
        if (EmailController.isEmailAddressValid(email)){
            this.nome = nome;
            this.cargo = cargo;
            this.matricula = matricula;
            this.email = email;
        }else{
            System.out.println("E-MAIL INVÁLIDO: cadastrado não realizado");
        }
    }

    public Funcionario(){

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (EmailController.isEmailAddressValid(email)){
            this.email = email;
        }else{
            System.out.println("Email INVÁLIDO!");
        }
    }
    public ArrayList<Email> getEmailsEnviados() {
        return emailsEnviados;
    }
    public void addEmailsEnviado(Email email) {
        this.emailsEnviados.add(email);
    }
    public ArrayList<Email> getEmailsRecebidos() {
        return emailsRecebidos;
    }
    public void addEmailsRecebido(Email email) {
        this.emailsRecebidos.add(email);
    }

    public void imprimir() {
        System.out.println(nome + " (" + email + ")");
        System.out.println(matricula + " - " + cargo);
        System.out.println("------------------------");
        System.out.println("E-mails enviados ("+ emailsEnviados.size()+"):");
        for (Email e: emailsEnviados){
            System.out.println("  * Assunto: \'"+e.getTitulo()+"\'    Para: " + e.getDestino());
        }
        System.out.println("------------------------");
        System.out.println("E-mails recebidos ("+ emailsRecebidos.size()+"):");
        for (Email e: emailsRecebidos){
            System.out.println("  * Assunto: \'"+e.getTitulo()+"\'    De: " + e.getOrigem());
        }
        System.out.println();
    }
    
}
