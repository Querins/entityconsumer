package com.example.kafkaconsumer.repo;

import com.example.kafkaconsumer.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends ElasticsearchCrudRepository<User, Integer> { }
