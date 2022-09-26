package exercicio08;

public class Program {
    public static void main(String[] args) {
        System.out.println("######################## ALUNO 1 ###################");
        Aluno a1 = new Aluno(
            "Jão da Sival",
            "20190123",
            new Nota[]{
                new Nota(10, "Atributos"),
                new Nota(6, "Básico de POO"),
                new Nota(5, "Classes"),
                new Nota(7.75, "Diagrama UML"),
                new Nota(8, "Encapsulamento")
            }
        );
        System.out.println("\n"+a1.retornarInfo()+"\n");


        System.out.println("######################## ALUNO 2 ###################");
        Aluno a2 = new Aluno(
            "ZéNiguém",
            "20190123",
            new Nota[]{
                new Nota(1.5, "Atributos"),
                new Nota(7, "Básico de POO"),
                new Nota(2, "Classes"),
                new Nota(3.2, "Diagrama UML"),
                new Nota(5, "Encapsulamento")
            }
        );
        a2.setNomeCompleto("Zé Ninguém");
        System.out.println("\n"+a2.retornarInfo()+"\n");


        System.out.println("######################## ALUNO 3 ###################");
        Aluno a3 = new Aluno(
            "Pelé Do Futebol",
            "20101010",
            new Nota[]{
                new Nota(10, "Atributos")
            }
        );
        a3.setNotas(new Nota[]{
            new Nota(10, "Atributos"),
            new Nota(10, "Básico de POO"),
            new Nota(10, "Classes"),
            new Nota(10, "Diagrama UML"),
            new Nota(10, "Encapsulamento")
        });
        System.out.println("\n"+a3.retornarInfo()+"\n");


        System.out.println("######################## ALUNO 4 ###################");
        Aluno a4 = new Aluno(
            "Pedrinho Acordado",
            "0029012343",
            new Nota[]{
                new Nota(9.8, "Atributos"),
                new Nota(6.4, "Básico de POO"),
                new Nota(7, "Classes"),
                new Nota(7.8, "Diagrama UML"),
                new Nota(8.5, "Encapsulamento")
            }
        );
        a4.setMatricula("20100100");
        System.out.println("\n"+a4.retornarInfo()+"\n");


        System.out.println("######################## ALUNO 5 ###################");
        Aluno a5 = new Aluno(
            "Maria Tonha",
            "20121111",
            new Nota[]{
                new Nota(3, "Atributos"),
                new Nota(4, "Básico de POO"),
                new Nota(7, "Classes"),
                new Nota(5.5, "Diagrama UML"),
                new Nota(7.8, "Encapsulamento")
            }
        );
        System.out.println("\n"+a5.retornarInfo()+"\n");


    }
}
