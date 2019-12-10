package model
import org.litote.kmongo.*

class Database() {
    val clienht = KMongo.createClient()
    val db = clienht.getDatabase("deneme")
    val col = db.getCollection("coldene")
    fun ekle() {
        col.insertOne("vdhfdt")
    }
}
