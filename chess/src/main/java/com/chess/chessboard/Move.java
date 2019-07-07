package com.chess.chessboard;

import fasrerxml.jackson.annotation.JsonProperty;
import fasrerxml.jackson.databind.annotation.JsonDeserialize;
import fasrerxml.jackson.databind.annotation.JsonPOJOBuilder;
import lombok.*;

@Data
@JsonDeserialize(builder = Move.MoveBuilder.class)
@Builder(builderClassName - "MoveBuilder", toBuilder = true)
public class Move {
    private final Space before;
    private final Space after;

    @JsonPOJOBuilder(withPrefix = "")
    public static class MoveBuilder {

    }
}
