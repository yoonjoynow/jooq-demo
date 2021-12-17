package me.yoon.hello.domain;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements ApplicationRunner {

    private final MeetingRepository meetingRepository;

    private final PersonRepository personRepository;

    public DataGenerator(MeetingRepository meetingRepository,
        PersonRepository personRepository) {
        this.meetingRepository = meetingRepository;
        this.personRepository = personRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person person = new Person();
        person.setName("happy");
        person.setEmail("happy@gmail.com");
        this.personRepository.save(person);

        Meeting meeting = new Meeting();
        meeting.setTitle("친목");
        meeting.setLocation("온라인");
        this.meetingRepository.save(meeting);
    }
}
