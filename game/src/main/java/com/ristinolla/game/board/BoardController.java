package com.ristinolla.game.board;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class BoardController {

    private Board board;

    // Info and reset board
    @GetMapping
    public String info(){
        board = new Board();
        return
        "Tic-tac-toe" + "<br>" +
        "Go to /game to see the board" + "<br>" +
        "Return here to reset the game" + "<br>" +
        "Play by making POST requests with row and col between 1-3";
    }

    // shows the board and whose turn it currently is
    @GetMapping("/game")
    public String game(){
        return board.toString();
    }

    @PostMapping("/game")
    public String playGame(@RequestParam String row,@RequestParam String col) {
        int rowInt = Integer.parseInt(row);
        int colInt = Integer.parseInt(col);
        return board.play(rowInt, colInt);
    }
}
