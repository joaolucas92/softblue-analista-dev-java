import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Album {

	private List<Foto> fotos = new ArrayList<>();

	public void adicionar(int id, Date data, String local) {
		Foto f = new Foto();
		f.setId(id);
		f.setData(data);
		f.setLocal(local);
		fotos.add(f);
	}

	public void listarFotos() {
		for (Foto f : fotos) {
			System.out.println(f.toString());
		}
	}

}
