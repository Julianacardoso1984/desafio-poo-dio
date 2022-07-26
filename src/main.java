import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class main {
    public static void main(String[]args ){
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria= new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("Descricao mentoria de java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso1);
        System.out.println(mentoria);




    }
}
