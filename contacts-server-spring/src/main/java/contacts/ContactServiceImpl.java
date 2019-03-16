package contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository repository;

	@Transactional
	@Override
	public Contact addContact(Contact contact) throws Exception {
		if (contact.getId() != null) {
			throw new Exception("Can't add contact with id");
		}
		System.err.println(contact.toString() + "Added");
		return repository.save(contact);
	}

	@Transactional
	@Override
	public Contact updateContact(String id, Contact contact) throws Exception {
		Contact origin = getContact(id);
		if (origin == null) {
			throw new Exception("Can't update contact with id: " + id);
		}
		contact.setId(id);
		System.err.println("Contact with ID: " + id + "Updated");
		return repository.save(contact);
	}

	@Transactional
	@Override
	public void deleteContact(String id) throws Exception {
		Contact origin = getContact(id);
		if (origin == null) {
			throw new Exception("Can't delete contact with id: " + id);
		}
		repository.deleteById(id);
		System.err.println("Contact Deleted");
	}

	@Transactional
	@Override
	public Contact getContact(String id) throws Exception {
		System.err.println("Contact with ID: " + id + " Found");
		return repository.findContactById(id);
	}

	@Transactional
	@Override
	public List<Contact> getAllContacts() throws Exception {
		List<Contact> allContacts = repository.findAll();
		System.err.println("All Contacts: " + allContacts.toString());
		return allContacts;
	}

}
