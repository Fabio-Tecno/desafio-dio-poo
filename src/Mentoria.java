
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentoria extends Conteudo {

    private LocalDate data = LocalDate.now();
    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
   
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return "Mentoria [Titulo = " + getTitulo() + 
        ", \nDescricao = " + getDescricao() + 
        ", \nData = " + data.format(formatador) + "]";
    
    }    
}
