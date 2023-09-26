package abstractfactory

interface IServiceStackAbstractFactoryy {
    fun getEmployeeService(): IEmployeeService
    fun getProductService(): IProductService
}