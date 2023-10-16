package duke;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Veiculo {
	
	private String tipo;
	private String placa;
	private LocalDateTime inicio;
	private LocalDateTime fim;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String tipo, String placa) {
		// Atribuir valores a tipo e placa
		// Atribuir valor ao inicio (data hora local)
		
		this.tipo = tipo;
		this.placa = placa;
		
		this.inicio = LocalDateTime.now();

	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * @param placa the placa to set
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String toString() {
		// AAA-1234 dd/mm/yyyy 12:34   Tempo: 123 minutos
		DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String texto = this.getPlaca() + "\t";
		texto += this.inicio.format(formatoDataHora) + "\t";
		texto += "Tempo: " + Duration.between(this.inicio, LocalDateTime.now()).toMinutes();
		return texto;
	}
}
