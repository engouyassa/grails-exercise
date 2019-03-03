package com.ennshop

class Product {

	String catalogNumber
	String description
	Float price
	static belongsTo = [store: Store]
	
    static constraints = {
		description inList: ['sporting goods', 'grocery', 'automotive', 'appliances']
    }
}
