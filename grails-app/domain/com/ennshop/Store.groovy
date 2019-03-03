package com.ennshop

class Store {
	
		String name
		String address
		String city
		String state
		String zip
		String phoneNumber
		static hasMany = [itemsSold: Product]
		
		static constraints = {
			name blank: false
			address blank: false
			city blank: false
			state blank: false, maxSize:2
			zip	maxSize: 5
			phoneNumber	maxSize: 10
		}
	}
	  