package thisEasy.service;

import org.springframework.stereotype.Service;

import thisEasy.abstracts.Services;
import thisEasy.entity.People;
import thisEasy.repository.PeopleRepository;

@Service
public class PeopleService extends Services<People, PeopleRepository> {

}
