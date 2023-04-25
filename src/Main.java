import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("curso C#");
        curso2.setDescricao("descrição curso c#");
        curso2.setCargaHoraria(20);



        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição de java");
        mentoria.setData(LocalDate.now());


       //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("desrição Bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAlessandro  = new Dev();
        devAlessandro.setNome("Alessandro ");
        devAlessandro.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Alessandro "+devAlessandro.getConteudosIncritos());
        devAlessandro.progredir();
        devAlessandro.progredir();
        System.out.println("*-*");
        System.out.println("Conteudos Inscritos Alessandro "+devAlessandro.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Alessandro "+devAlessandro.getConteudosConcluidos());
        System.out.println("XP "+devAlessandro.calcularTotalXp());

        System.out.println("--------------");

        Dev devAmanda = new Dev();
        devAmanda.setNome("Amanda");
        devAmanda.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Amanda "+devAmanda.getConteudosIncritos());
        devAmanda.progredir();
        devAmanda.progredir();
        devAmanda.progredir();
        System.out.println("*-*");
        System.out.println("Conteudos Inscritos Amanda "+devAmanda.getConteudosIncritos());
        System.out.println("Conteudos Concluidos Amanda "+devAmanda.getConteudosConcluidos());
        System.out.println("XP "+devAmanda.calcularTotalXp());








    }
}
