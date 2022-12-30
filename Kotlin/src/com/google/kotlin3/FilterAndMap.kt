package com.google.kotlin3

fun main() {
    val list = mutableListOf<ArtistData>(
        ArtistData("Europe", "The final countdown"),
        ArtistData("MR.Big", "Lean into it"),
        ArtistData("Europe", "Start from the dark"),
        ArtistData("Skid Row", "Slave to the grind"),
        ArtistData("mr.big", "What if"),
        ArtistData("mr.big", "Mr.Big"),
        ArtistData("mr.big", "Hey man"),
        ArtistData("mr.big", "Defying gravity"),
        ArtistData("Skid Row", "Skid row"),
        ArtistData("Skid Row", "Subhuman race"),
        ArtistData("Skid Row", "B sides ourselves")
    )
    val collection = ArtistsCollection(list)

    println(collection.list.filter { it.name == "Europe" }.map { "${it.id} -> ${it.name}" }.joinToString(", "))
    println(collection.list.filter { it.name.equals("mr.big", true) }
        .map { "${it.id} ${it.name.toLowerCase().capitalize()} => album: ${it.album.toLowerCase().capitalize()}" }
        .joinToString(", "))

    println(getArtistsAlbums("SkiD RoW", collection.list))

    val skidRow = ArtistData("Skid Row", "B sides ourselves")
    println(skidRow.toString())
}

fun getArtistsAlbums(anArtist: String, collection: MutableList<ArtistData>) =
    collection.filter { it.name.equals(anArtist, true) }.joinToString(", ") {
        if (it.id <= 9) "0${it.id} -> ${it.album}" else "${it.id} -> ${it.album}"
    }

class ArtistData(val name: String, val album: String) {
    var id = getInstanceCount()

    override fun toString(): String {
        return ArtistData::javaClass.name + "-" + name + "-" + album
    }

    companion object {
        private var count = 0;
        fun getInstanceCount(): Int {
            return ++count
        }
    }
}

class ArtistsCollection(val list: MutableList<ArtistData>)