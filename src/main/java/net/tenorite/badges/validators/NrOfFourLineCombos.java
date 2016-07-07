package net.tenorite.badges.validators;

import net.tenorite.badges.Badge;
import net.tenorite.game.PlayingStats;

public final class NrOfFourLineCombos extends AbstractNrOfCombos {

    public NrOfFourLineCombos(Badge type) {
        super(type, PlayingStats::getNrOfFourLineCombos);
    }
    
}