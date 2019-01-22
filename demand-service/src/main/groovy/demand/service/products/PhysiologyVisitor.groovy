package demand.service.products;


trait PhysiologyVisitor
{
    def visit (Closure code)
    {
        Product.values().each { product ->
            RhFactor.values().each { rhFactor ->
                CmvStatus.values().each { cmvStatus ->
                    code.call(product,rhFactor, cmvStatus)
                }
            }
        }
    }

}
