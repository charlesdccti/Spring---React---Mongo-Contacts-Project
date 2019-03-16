package contacts;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts")
public class Contact {

	private String id;
	private String name;
	private String address;
	private String city;
	private String phone;
	private String email;

	public Contact() {
		super();
	}

	public Contact(String name, String address, String city, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}

	@Id
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", phone=" + phone
				+ ", email=" + email + "]";
	}

}
