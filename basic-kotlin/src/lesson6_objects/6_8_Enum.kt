
enum class MusicType {
    POP, ROCK, JAZZ
}

enum class SportType(val sportName: String) {
    BADMINTON("Badminton"),
    FOOTBALL("Football")
}

fun main(args: Array<String>) {

    var musicType = MusicType.POP

    when (musicType) {
        MusicType.POP -> println("Pop: $musicType")
        MusicType.ROCK -> println("Rock: $musicType")
        MusicType.JAZZ -> println("Jazz: $musicType")
    }

    println(SportType.BADMINTON.sportName)
}