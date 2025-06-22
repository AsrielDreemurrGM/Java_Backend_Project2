package br.com.eaugusto.domain;

/**
 * @author Eduardo Augusto (github.com/AsrielDreemurrGM/)
 * @since Jun 22, 2025
 */
public class Client {

	private String name;
	private String cpf;
	private String telephoneNumber;
	private String address;
	private Integer addressNumber;
	private String city;
	private String state;

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public Integer getAddressNumber() {
		return addressNumber;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAddressNumber(Integer addressNumber) {
		this.addressNumber = addressNumber;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}
}
