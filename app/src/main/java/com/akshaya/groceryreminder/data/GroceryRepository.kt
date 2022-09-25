package com.akshaya.groceryreminder.data

import androidx.lifecycle.LiveData
import com.akshaya.groceryreminder.data.db.GroceryDao
import com.akshaya.groceryreminder.model.GroceryModel

class GroceryRepository(private val groceryDao: GroceryDao) {

    val readAllItems: LiveData<List<GroceryModel>> = groceryDao.readItem()

    suspend fun insert(item: GroceryModel) = groceryDao.insertItem(item)

    suspend fun delete(item: GroceryModel) = groceryDao.deleteItem(item)

    suspend fun deleteAllItems() = groceryDao.deleteAllItems()

}