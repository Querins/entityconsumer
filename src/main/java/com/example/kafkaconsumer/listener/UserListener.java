package com.example.kafkaconsumer.listener;

import com.example.kafkaconsumer.entity.User;
import com.example.kafkaconsumer.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
public class UserListener {

    private UsersRepository repository;

    @Autowired
    public UserListener(UsersRepository repository) {
        this.repository = repository;
    }

    @KafkaListener(topics = "users", groupId = "group-id")
    public void receiveUser(@Payload User user) {
        System.out.println("User received: " + user.getName() + " " + user.getAge());
        User saved = repository.save(user);
        System.out.println("Saved user : " + saved.getName() + " to repo");
    }
}
