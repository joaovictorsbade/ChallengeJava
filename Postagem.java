
public class Postagem {
	
	private int id;
	private String titulo;
	private String dscriPost;
	private String cpf;
	
	public Postagem(int id, String titulo, String dscriPost, String cpf){
		this.id = id;
		this.titulo = titulo;
		this.dscriPost = dscriPost;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDscriPost() {
		return dscriPost;
	}
	public void setDscriPost(String dscriPost) {
		this.dscriPost = dscriPost;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	

}
