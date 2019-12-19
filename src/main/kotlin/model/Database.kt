package model
import com.mongodb.*
import contract.ContractInterface
import org.bson.Document
import org.koin.core.inject

class Database {
    val client=MongoClient(MongoClientURI("mongodb://localhost:27017"))
    val database=client.getDatabase("stok")
//    val cre=database.createCollection("ürünler")
    val col=database.getCollection("ürünler")
    val doc=Document().append("isim","soyisim")

    fun ekle(product: ContractInterface.IProduct){
        val doc=Document().append("product",product)
        col.insertOne(doc)
    }

}
fun main(){
    val ornt= Database()
    ornt.ekle(product = Product(32,"FD",23,"DFSD"))

}