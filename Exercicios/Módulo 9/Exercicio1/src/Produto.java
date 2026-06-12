import java.text.DateFormat;
import java.util.Date;

public class Produto {
	
	private static final DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
	
	private String nome;
	private double peso;
	private Date dataValidade;
	
	public Produto(String nome, double peso, Date dataValidade) {
		this.nome = nome;
		this.peso = peso;
		this.dataValidade = dataValidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public Date getDataValidade() {
		return dataValidade;
	}
	
	public String getFormattedDataValidate() {
        return df1.format(dataValidade);
    }
	
}
