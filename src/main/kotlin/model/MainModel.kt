package model
import contract.ContractInterface.*
class MainModel :IModel {
    override fun addProduct() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun removeProduct() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun incrementProduct() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun decrementProduct() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun counterProduct(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
class Product(override var name: String, override var count: Int, override var owner: String) :IProduct{

}