package model
import com.mongodb.*
import org.bson.Document


class Database {
    val client=MongoClient(MongoClientURI("mongodb://localhost:27017"))
    val database=client.getDatabase("stok")
    val cre=database.createCollection("ürünler")
    val col=database.getCollection("ürünler")
    val doc=Document().append("isim","soyisim")
    fun ekle(){
        col.insertOne(doc)
    }

}
//fun main(){
//    val ornt= Database()
//    ornt.ekle()
//}