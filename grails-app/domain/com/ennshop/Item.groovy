package com.ennshop

class Item {

	String catalogNumber
	String description
	Float price
	static belongsTo = [order: Purchase]
	
    static constraints = {
		description inList: ['sporting goods', 'grocery', 'automotive', 'appliances']
    }
}
