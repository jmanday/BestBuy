package com.example.bestbuy.repository

import com.example.bestbuy.data.datasource.ProductDataSource
import com.example.bestbuy.mapper.toProduct
import com.example.bestbuy.mapper.toProductDetail
import com.example.core_data.utils.transformationsMapNotNull

class ProductRepositoryImpl(
    private val netProductDataSource: ProductDataSource
) : ProductRepository {

    override fun getProducts() =
        transformationsMapNotNull(netProductDataSource.getProductList()) {
            it?.map { productEntity ->
                productEntity.toProduct()
            }
        }

    override fun getProductById(idProduct: Int) =
        transformationsMapNotNull(netProductDataSource.getProductById(idProduct)) {
            it?.toProductDetail()
        }
}