package model
import contract.ContractInterface.*
class MainModel :IModel {
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

    override fun counterProduct(product: IProduct): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
data class Product(override var id: Int,override var name: String, override var count: Int, override var owner: String) :IProduct