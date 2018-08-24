package eu.bullcheat.factionsts3

import java.util.*
import java.util.concurrent.ConcurrentLinkedQueue

val actionQueue = ConcurrentLinkedQueue<Action>()

sealed class Action
data class ActionCreateChannel(val name: String, val uuid: UUID, val leader: String?) : Action()
data class ActionDeleteChannel(val name: String, val uuid: UUID) : Action()
data class ActionLink(val player: UUID, val secret: String?)
data class ActionUnlink(val player: UUID)
data class ActionAddPlayerToChannel(val channel: UUID, val player: UUID, val rank: Rank?)
data class ActionRemovePlayerFromChannel(val channel: UUID, val player: UUID)
data class ActionSetPlayerChannelRank(val channel: UUID, val player: UUID, val rank: Rank?)

data class Rank(val teamspeakID: Int)