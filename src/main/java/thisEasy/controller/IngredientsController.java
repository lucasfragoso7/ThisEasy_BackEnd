package thisEasy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import thisEasy.abstracts.Controller;
import thisEasy.entity.Ingredients;
import thisEasy.service.IngredientsService;

@RestController
@RequestMapping("/ingredients")
public class IngredientsController extends Controller<Ingredients, IngredientsService> {


	


}