package contract

interface ContractInterface {
    interface IModel{
        fun addProduct()
        fun removeProduct()
        fun incrementProduct()
        fun decrementProduct()
        fun counterProduct():Int
    }
    interface IView{
        fun initView()
    }
    interface IPresenter{
        fun getAdd()
        fun getRemove()
        fun getIncrement()
        fun getDecrement()
        fun getCounter()
    }
    interface IProduct{
        var name:String
        var count:Int
        var owner:String
    }
}