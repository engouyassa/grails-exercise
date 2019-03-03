package com.ennshop

class Customer {

	String name
	String address
	String city
	String state
	String zip
	String phoneNumber
	Date dob
	static hasMany = [orders: Purchase]
	
    static constraints = {
		name blank: false
		address blank: false
		city blank: false
		state blank: false
		zip	maxSize: 5
		phoneNumber	maxSize: 10
    }
}
