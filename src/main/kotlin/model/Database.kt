package model
import com.mongodb.*
import contract.ContractInterface
import org.bson.Document
import org.koin.core.inject
import java.util.*

class Database() {
//    val cre=database.createCollection("ürünler")
    val client=MongoClient(MongoClientURI("mongodb://localhost:27017"))
    val database=client.getDatabase("stok")
    val collection=database.getCollection("ürünler")
    init {
        this.client
        this.database
        this.collection
        val doc=Document().append("product","rgerg")
        collection.insertOne(doc)
    }
}
fun main(){
    val ornt= Database()

}