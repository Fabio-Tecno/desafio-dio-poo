
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria {

    private String titulo;
    private String descricao;
    private LocalDate data;
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Mentoria [Titulo = " + titulo + 
        ", \nDescricao = " + descricao + 
        ", \nData = " + data.format(formatador) + "]";
    
    }
}
