package com.chess.piece;
import com.chess.chessboard.Move;
import lombok.AllArgsConstractor;
import lombok.EqualsAndHashCode;
import lombok.ToSting;
import lombok.Getter;


@AllArgsConstractor
@Getter
@EqualsAndHashCode
@ToString
public abstract class Piece {
    private final Color color;
    private final Type type;

    public abstract boolean doMove(Move move);

    protected Piece(Color color, Type type) {
        this.color = color;
        this.type = type;
    }

    public enum Color{
        WHITE,
        BLACK
    }
    public enum Type {
        KING,
        QUEEN,
        BISHOP,
        KNIGHT,
        ROOK,
        PAWN
    }
}
