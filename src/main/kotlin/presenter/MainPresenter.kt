package presenter
import contract.ContractInterface.*
import model.MainModel
import model.Product
import org.kodein.*
import org.kodein.di.Kodein
import org.kodein.di.generic.*
import org.kodein.di.subKodein
import view.MainView

class MainPresenter(var modell:MainModel,kodein: Kodein) :IPresenter{
    val hmodel by kodein.instance<MainModel>()
    val hproduct by kodein.instance<Product>()
    val hview by kodein.instance<MainView>()
    override fun getAdd() {

        return hmodel.addProduct(product = hview.clickAddButtons())

    }

    override fun getRemove() {
        return hmodel.removeProduct(product =hview.clickRemoveButton())
    }

    override fun getIncrement() {
        return hmodel.incrementProduct(hview.incrementProcess())
    }

    override fun getDecrement() {
        return hmodel.decrementProduct(hview.decrementProcess())
    }

    override fun getCounter() {
        val z=hmodel.counterProduct()
        hview.counterView(count =z )
    }

}