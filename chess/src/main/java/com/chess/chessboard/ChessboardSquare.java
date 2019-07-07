package com.chess.chessboard;

import com.chess.piece.Piece;
import lombok.AllArgsConstractor;
import lombok.EqualsAndHashCode;
import lombok.ToSting;
import lombok.Getter;

@AllArgsConstractor
@Getter
@EqualsAndHashCode
@ToString
public class ChessboardSquare {
    private final Square space;
    private final Piece piece;
}
