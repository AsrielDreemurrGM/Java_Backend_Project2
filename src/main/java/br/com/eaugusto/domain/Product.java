package br.com.eaugusto.domain;

/**
 * Represents a product with identifying code, description, and pricing details.
 * Implements Persistable to provide a unique identifier (code).
 * 
 * @author Eduardo Augusto (https://github.com/AsrielDreemurrGM/)
 * @since June 24, 2025
 */
public class Product implements Persistable {

	private String code;
	private String name;
	private String description;
	private double value;
	private String brand;

	public String getDescription() {
		return description;
	}

	public double getValue() {
		return value;
	}

	public String getBrand() {
		return brand;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns a formatted string representing product details.
	 */
	@Override
	public String toString() {
		return "Informações do Produto:\n" + "Nome: " + name + "\n" + "Código: " + code + "\n" + "Descrição: "
				+ description + "\n" + "Valor: R$ " + String.format("%.2f", value) + "\n" + "Marca: " + brand;
	}

	/**
	 * Returns the unique product code as the persistence identifier.
	 */
	@Override
	public String getCodeOrCPF() {
		return this.code;
	}
}
