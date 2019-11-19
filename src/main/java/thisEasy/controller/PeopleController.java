package thisEasy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thisEasy.abstracts.Controller;
import thisEasy.entity.People;
import thisEasy.service.PeopleService;

@RestController
@RequestMapping("/´people")
public class PeopleController extends Controller<People , PeopleService> {


}
