package com.mohamedalaa4j.theshoestore

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ShoeListViewModel:ViewModel() {

    private val list:ArrayList<Shoe> = ArrayList<Shoe>()

    private val _shoesList = MutableLiveData<ArrayList<Shoe>>()
    val shoesList : LiveData<ArrayList<Shoe>> get() = _shoesList

    init {
        list.add(Shoe("Sneakers",36.5,"Adidas","Single touch and close fastening straps Perforated Detail for optimal breathability. Adidas logo branding. Midsole cushioning provides ultra support. Rubber outsole for traction and durability"))
        list.add(Shoe("Flat Heels",37.5,"ALDO","ALDO SHOES - FLAT HEELS-for Men-NAVY-8 16086395"))
        list.add(Shoe("Lace-Up Flat Sneakers",38.0,"Desert","Comfortable LEATHER upper material classic lace-up closure Soft footbed ensures all-day comfort Sturdy PVC outsole offers added comfort"))
        list.add(Shoe("Half Boots",35.0,"Italiano","Rubber sole imported outside very comfortable and breathable walking good all-time design luxury bedding prevents sweat and odor"))
        list.add(Shoe("Jordan",39.0,"NIKE","Inspired by MJ's postseason tradition of wearing dark shoes during road games, the latest Jordan is built for game seven"))
        list.add(Shoe("Sneakers",34.5,"PUMA","GIRLS PUMA VIKKY V2 CAT JR PUMA BLACK-PUMA WHI BLACK-WHITE 36 EU"))
        list.add(Shoe("High Knee heels boot",34.5,"VARNA","VARNA High Knee heels boot Size - Leather"))
        list.add(Shoe("XO Style",34.5,"Sandal With Heels","wide heel is comfortable A comfortable foot sole with a sponge layer The face material is of the finest imported raw materials"))

        _shoesList.value = list
    }

    fun addShoe(name:String,size:Double,company:String,description:String){
        list.add(Shoe(name,size,company,description))
        _shoesList.value = list
    }
}