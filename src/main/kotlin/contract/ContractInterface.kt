package contract

import model.Product

interface ContractInterface {
    interface IModel{
        fun addProduct(product: IProduct)
        fun removeProduct(product: IProduct)
        fun incrementProduct(product: IProduct)
        fun decrementProduct(product: IProduct)
        fun counterProduct(product: IProduct):Int
    }
    interface IView{
        fun initView()
    }
    interface IPresenter{
        fun getAdd():Unit
        fun getRemove():Unit
        fun getIncrement():Unit
        fun getDecrement():Unit
        fun getCounter():Unit
    }
    interface IProduct{
        var id:Int
        var name:String
        var count:Int
        var owner:String
    }
}