package thisEasy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thisEasy.abstracts.Controller;
import thisEasy.abstracts.Services;
import thisEasy.entity.Ambry;

@RestController
@RequestMapping("/Ambry")
public class AmbryController extends Controller<Ambry> {

	public AmbryController(Services<Ambry> services) {
		super(services);
		}


}
