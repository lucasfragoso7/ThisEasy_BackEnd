package thisEasy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thisEasy.abstracts.Controller;
import thisEasy.entity.Ambry;
import thisEasy.service.AmbryService;

@RestController
@RequestMapping("/ambry")
public class AmbryController extends Controller<Ambry, AmbryService> {

}
