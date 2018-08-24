package eu.bullcheat.factionsts3

import com.massivecraft.factions.Rel

fun Rel.toRank() = when (this) {
    Rel.RECRUIT -> 1
    Rel.MEMBER -> 2
    Rel.OFFICER -> 3
    Rel.LEADER -> 4
    else -> null
}