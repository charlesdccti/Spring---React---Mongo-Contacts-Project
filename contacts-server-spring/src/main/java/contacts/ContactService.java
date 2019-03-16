package contacts;

import java.util.List;

public interface ContactService {

	public Contact addContact(Contact contact) throws Exception;

	public Contact updateContact(String id, Contact contact) throws Exception;

	public void deleteContact(String id) throws Exception;

	public Contact getContact(String id) throws Exception;

	public List<Contact> getAllContacts() throws Exception;

}
