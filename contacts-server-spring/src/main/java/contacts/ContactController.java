package contacts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	private ContactService service;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact addContact(@RequestBody Contact contact) throws Exception {
		return service.addContact(contact);
	}

	@RequestMapping(method = RequestMethod.PUT, path = "/{id}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact updateContact(@PathVariable("id") String id, @RequestBody Contact contact) throws Exception {
		return service.updateContact(id, contact);
	}

	@RequestMapping(method = RequestMethod.DELETE, path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteContact(@PathVariable("id") String id) throws Exception {
		service.deleteContact(id);
	}

	@RequestMapping(method = RequestMethod.GET, path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Contact getContact(@PathVariable("id") String id) throws Exception {
		return service.getContact(id);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Contact> getAllContacts() throws Exception {
		return service.getAllContacts();
	}

}
