package com.springCore.SpringCore0.constructor;

	public class Person {
		private String name;
		private int personId;

			public Person(String name,int personId) {
	
				this.name=name;
				this.personId=personId;
	}

			@Override
			public String toString() {
				return this.name+"  "+this.personId;
				
			}
			
			

	}
