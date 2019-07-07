package com.chess.chessboard;

import jdk.nashorn.internal.objects.annotations.Getter;

import java.util.Set;

@Getter
@Equals
@ToString
public class Chessboard {
    public final Set<ChessboardSquare> squares;

    public Chessboard(Set<ChessboardSquare> squares) {
        this.squares
    }
}
