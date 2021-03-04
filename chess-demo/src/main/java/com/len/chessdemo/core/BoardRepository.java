package com.len.chessdemo.core;

import com.len.chessdemo.elements.Board;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoardRepository extends MongoRepository<Board,String> {

}
