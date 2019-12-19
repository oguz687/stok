package model
import contract.ContractInterface.*
import di.Dependency.*
import org.bson.Document
import org.koin.*
import org.koin.core.KoinComponent
import org.koin.core.inject
import tornadofx.getProperty

class MainModel :IModel,KoinComponent {
    private val database:Database by inject<Database>()

    override fun addProduct(product: IProduct) {

        database.ekle(product = product)

    }

    override fun removeProduct(product: IProduct) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun incrementProduct(product: IProduct) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun decrementProduct(product: IProduct) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun counterProduct():Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.

    }



}
data class Product(override var id: Int,override var name: String, override var count: Int, override var owner: String) :IProduct,KoinComponent