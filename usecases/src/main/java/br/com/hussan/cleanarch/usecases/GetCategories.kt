package br.com.hussan.cleanarch.usecases

import br.com.hussan.cleanarch.data.datasource.CategoryDatasource
import br.com.hussan.cleanarch.domain.Category
import io.reactivex.Flowable

class GetCategories(private val dataSource: CategoryDatasource) {
    operator fun invoke(): Flowable<List<Category>> {
        return dataSource.getCategories()
    }
}
