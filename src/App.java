
import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso = new Curso();
        curso.setTitulo("Programação Java");
        curso.setDescricao("Curso para exercitar o POO com a linguagem Java");
        curso.setCargaHoraria(8);
        
        Curso curso1 = new Curso();
        curso1.setTitulo("Lógica de Programação");
        curso1.setDescricao("Curso para exercitar o raciocínio com a linguagem JavaScript");
        curso1.setCargaHoraria(15);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria para abordar detalhes da trilha do curso");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso);
        System.out.println(curso1);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Spring");
        bootcamp.setDescricao("Framework para desenvolvimento de API");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(mentoria);

        Dev devFabio = new Dev();
        devFabio.setNome("Fabio");
        devFabio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Fabio: " + devFabio.getConteudosIncritos());
        devFabio.progredir();
        devFabio.progredir();
        devFabio.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos Fabio: " + devFabio.getConteudosIncritos());
        System.out.println("Conteudos concluidos Fabio: " + devFabio.getConteudosConcluidos());
        System.out.println("XP:" + devFabio.calcularTotalXp());

    
    }
}
