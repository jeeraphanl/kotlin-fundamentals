
abstract class BasePlayer {

    abstract fun init()

    open fun play() {
        println("base player play")
    }

    open fun stop() {
        println("base player stop")
    }
}

class MoviePlayer : BasePlayer() {

    override fun init() {
        println("init movie player")
    }

    override fun play() {
        println("movie player play")
    }

    override fun stop() {
        println("movie player stop")
    }
}

fun main(args: Array<String>) {

    val player = MoviePlayer()
    player.init()
    player.play()
    player.stop()
}

/**
 * Cannot new instant
 * Can make abstract method like interface
 * Can make concrete method
 */

/**
 * Use an abstract class anytime you cannot complete a class
*/