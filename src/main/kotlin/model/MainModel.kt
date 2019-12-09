package model
import contract.ContractInterface.*
import org.kodein.di.*
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.*
class MainModel :IModel {
//    val kodeind=Kodein {
//        bind<MainModel>() with singleton { MainModel() }
//    }
    override fun addProduct(product: IProduct) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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
data class Product(override var id: Int,override var name: String, override var count: Int, override var owner: String) :IProduct