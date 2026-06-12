import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Autor implements Recordable {
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private String nome;
	private Date dataNascimento;

	public Autor(String nome, Date dataNascimento) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
	}
	
	public Autor() {
	
	}

	public String getNome() {
		return nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}


	@Override
	public String toString() {
		return "Autor => Nome: " + nome + "\n Data de Nascimento: " + sdf.format(dataNascimento);
	}

	@Override
	public void read(DataInputStream in) throws IOException {
		nome = in.readUTF();
		if (nome.equals(NULL_DATA)) {
			nome = null;
		}
		
		long time = in.readLong();
		if (time == -1) {
			dataNascimento = null;
		} else {
			dataNascimento = new Date(time);
		}
	}

	@Override
	public void write(DataOutputStream out) throws IOException {
		if (nome != null) {
			out.writeUTF(nome);
		} else {
			out.writeUTF(NULL_DATA);
		}
		
		if (dataNascimento != null) {
			out.writeLong(dataNascimento.getTime());
		} else {
			out.writeLong(-1);
		}
	}

}
