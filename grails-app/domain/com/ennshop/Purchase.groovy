package com.ennshop

class Purchase {
	
	Date created
	String storeWherePlaced
	static hasMany = [itemsPurchased: Item]
	static belongsTo = [buyer: Customer]
	
	static constraints = {
	}
}
