package presenter
import contract.ContractInterface.*
import model.MainModel
class MainPresenter :IPresenter{
    private var modell : IModel = MainModel()
    override fun getAdd() {
        modell.addProduct()
    }

    override fun getRemove() {
        modell.removeProduct()
    }

    override fun getIncrement() {
        modell.incrementProduct()
    }

    override fun getDecrement() {
        modell.decrementProduct()
    }

    override fun getCounter() {
        modell.counterProduct()
    }

}