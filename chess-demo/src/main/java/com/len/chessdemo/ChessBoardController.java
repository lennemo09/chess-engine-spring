package com.len.chessdemo;

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
        for (int i = 0; i < 8; i++) {
            b.getBoard()[1][i] = new Pawn();
            b.getBoard()[6][i] = new Pawn();
        }
        Board save = boardRepository.save(b);
        logger.info("##############################",save.getBoard());
        return b;
    }

    @PutMapping("/board")
    public Board makeMove(@RequestBody BoardRequest request) {
        Board b = boardRepository.findById(request.getBoardId()).get();
        Board save = boardRepository.save(b);
        return b;
    }
}
