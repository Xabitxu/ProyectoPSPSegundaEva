package model;

public class App {
    private int id;
    private String nombre;
    private String descripcion;
    private String categoria;
    private String rutaApk;      
    private String rutaImagen;  
    private String hash;       
    
    public App() {}
    
    public App(int id, String nombre, String descripcion, String categoria, 
               String rutaApk, String rutaImagen, String hash) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.rutaApk = rutaApk;
        this.rutaImagen = rutaImagen;
        this.hash = hash;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getRutaApk() {
		return rutaApk;
	}

	public void setRutaApk(String rutaApk) {
		this.rutaApk = rutaApk;
	}

	public String getRutaImagen() {
		return rutaImagen;
	}

	public void setRutaImagen(String rutaImagen) {
		this.rutaImagen = rutaImagen;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	@Override
	public String toString() {
		return "App [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", categoria=" + categoria
				+ ", rutaApk=" + rutaApk + ", rutaImagen=" + rutaImagen + ", hash=" + hash + "]";
	}
    
}
