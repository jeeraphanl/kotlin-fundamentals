
abstract class Player {

    abstract fun initPlayer(string: String)

    open fun play() {
        println("Player play")
    }

    open fun stop() {
        println("Player stop")
    }
}

class MoviePlayer : Player() {

    override fun initPlayer(playName: String) {
        println("initPlayer: $playName")
    }

    override fun play() {
        println("MoviePlayer play")
    }

    override fun stop() {
        println("MoviePlayer stop")
    }
}

fun main(args: Array<String>) {

    val player = MoviePlayer()
    player.initPlayer("Movie")
    player.play()
    player.stop()
}

/**
 * Cannot new instant
 * Can make abstract method like interface
 * Can make concrete method
 */