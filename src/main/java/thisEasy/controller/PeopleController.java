package thisEasy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thisEasy.abstracts.Controller;
import thisEasy.abstracts.Services;
import thisEasy.entity.People;

@RestController
@RequestMapping("/People")
public class PeopleController extends Controller<People> {

	public PeopleController(Services<People> services) {
		super(services);
		}


}
