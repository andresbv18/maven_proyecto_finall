package maven.proyecto.finall;

public class Libro {
	public String codigo;
	public String nombre;
	public String autor;
	public int anyoPublicacion;
	public String editorial;
	public int cantidadPaginas;
	public double precio;
    public int tiempoPrestado;
	public int tiempoRetorno;
	public String estado ;
	public int numeroPrestado;
	public String codigoAutorizacion;
	public String tiempoLectura;
	public String cedula;
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getCodigoAutorizacion() {
		return codigoAutorizacion;
	}
	public void setCodigoAutorizacion(String codigoAutorizacion) {
		this.codigoAutorizacion = codigoAutorizacion;
	}
	public String getTiempoLectura() {
		return tiempoLectura;
	}
	public void setTiempoLectura(String tiempoLectura) {
		this.tiempoLectura = tiempoLectura;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}
	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public int getCantidadPaginas() {
		return cantidadPaginas;
	}
	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double price) {
		this.precio = price;
	}
	public int getTiempoPrestado() {
		return tiempoPrestado;
	}
	public void setTiempoPrestado(int tiempoPrestado) {
		this.tiempoPrestado = tiempoPrestado;
	}
	public int getTiempoRetorno() {
		return tiempoRetorno;
	}
	public void setTiempoRetorno(int tiempoRetorno) {
		this.tiempoRetorno = tiempoRetorno;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getNumeroPrestado() {
		return numeroPrestado;
	}
	public void setNumeroPrestado(int numeroPrestado) {
		this.numeroPrestado = numeroPrestado;
	}
	
}
