package abstractfactory

class RestServiceStackImpl: IServiceStackAbstractFactoryy {
    override fun getProductService(): IProductService = ProductServiceRestImpl()

    override fun getEmployeeService(): IEmployeeService= EmployeeServiceRestImpl()
}