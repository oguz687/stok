package view
import contract.ContractInterface
import javafx.scene.Parent
import javafx.scene.control.Label
import tornadofx.*
class StokApp : App() {
    override val primaryView = MainView::class
}
class MainView :View(), ContractInterface.IView {
    override val root = hbox {
        button("Press me")
        label("Waiting")
        resize(1020.0,149.0)
    }
    override fun initView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
