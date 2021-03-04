package com.len.chessdemo.core;

import com.len.chessdemo.elements.Board;
import com.len.chessdemo.utils.Move;
import com.len.chessdemo.utils.Position;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChessBoardController {
    Logger logger = LoggerFactory.getLogger(ChessBoardController.class);

    @Autowired
    private BoardRepository boardRepository;

    @GetMapping("/board")
    public Board getBoard() {
        Board b = new Board();
        Board save = boardRepository.save(b);
        logger.info("##############################",save.getBoard());
        return b;
    }

    @PutMapping("/board")
    public Board makeMove(@RequestBody BoardRequest request) {
        Board b = boardRepository.findById(request.getBoardId()).get();
        Position fromPos = new Position(request.getFromX(), request.getFromY());
        Position toPos = new Position(request.getToX(), request.getToY());

        b.makeMove(new Move(request.getBoardId(), fromPos, toPos));
        Board save = boardRepository.save(b);
        return b;
    }
}
