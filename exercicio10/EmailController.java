package exercicio10;

import java.util.ArrayList;

public class EmailController {

    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Email> emailsEnviados = new ArrayList<Email>();

    public void sendEmail(Email email){
        String remetente = email.getOrigem();
        String destinatario = email.getDestino();
        
        boolean existeRemetente = false;
        boolean existeDestinatario = false;

        Funcionario remFunc = new Funcionario();
        Funcionario destFunc = new Funcionario();

        for (Funcionario f: funcionarios){
            if (f.getEmail() == remetente){
                remFunc = f;
                existeRemetente = true;
            }
            if (f.getEmail() == destinatario){
                destFunc = f;
                existeDestinatario = true;
            }
        }

        System.out.println("============================================");
        if (existeRemetente && existeDestinatario){
            emailsEnviados.add(email);
            remFunc.addEmailsEnviado(email);
            destFunc.addEmailsRecebido(email);
            System.out.println("Email enviado com SUCESSO! ;-)");
            System.out.println("Título: " + email.getTitulo() + "; "
                + email.getOrigem() + " -> " + email.getDestino());
        }else{
            System.out.println("NÃO ENVIADO: Email de remetente ou destinatário NÃO ENCONTRADO!");
            System.out.println(email.getOrigem() + " -> " + email.getDestino());
        }
        System.out.println("============================================");

    }


    public static boolean isEmailAddressValid(String emailAddress){
        int atPos = emailAddress.indexOf("@");
        return atPos > 0 && atPos < emailAddress.length()-1;
    }


    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void addFuncionario(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }
    public void delFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }

    public ArrayList<Email> getEmailsEnviados() {
        return emailsEnviados;
    }


    
}
