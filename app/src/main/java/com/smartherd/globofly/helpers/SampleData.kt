package com.smartherd.globofly.helpers

import com.smartherd.globofly.models.Destination
import java.util.*

object SampleData {

	val DESTINATIONS = ArrayList<Destination>()

	private var COUNT = 5

	private var dummy_description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce accumsan quis justo quis hendrerit. Curabitur a ante neque. Fusce nec mauris sodales, auctor sem at, luctus eros. Praesent aliquam nibh neque. Duis ut suscipit justo, id consectetur orci. Curabitur ultricies nunc eu enim dignissim, sed laoreet odio blandit."

	init {
		// Add some sample items
		val newDestination1 = Destination()
		newDestination1.id = 1
		newDestination1.city = "New Delhi"
		newDestination1.description = dummy_description
		newDestination1.country = "India"
		DESTINATIONS.add(newDestination1)

		val newDestination2 = Destination()
		newDestination2.id = 2
		newDestination2.city = "Bangkok"
		newDestination2.description = dummy_description
		newDestination2.country = "Thailand"
		DESTINATIONS.add(newDestination2)

		val newDestination3 = Destination()
		newDestination3.id = 3
		newDestination3.city = "New York"
		newDestination3.description = dummy_description
		newDestination3.country = "USA"
		DESTINATIONS.add(newDestination3)

		val newDestination4 = Destination()
		newDestination4.id = 4
		newDestination4.city = "London"
		newDestination4.description = dummy_description
		newDestination4.country = "United Kingdom"
		DESTINATIONS.add(newDestination4)

		val newDestination5 = Destination()
		newDestination5.id = 5
		newDestination5.city = "Sydney"
		newDestination5.description = dummy_description
		newDestination5.country = "Australia"
		DESTINATIONS.add(newDestination5)

	}

	fun addDestination(item: Destination) {
		item.id = COUNT
		DESTINATIONS.add(item)
		COUNT += 1
	}

	fun getDestinationById(id: Int): Destination? {
		for (i in DESTINATIONS.indices) {
			if (DESTINATIONS[i].id == id) {
				return DESTINATIONS[i]
			}
		}

		return null
	}

	fun deleteDestination(id: Int) {
		var destinationToRemove: Destination? = null

		for (i in DESTINATIONS.indices) {
			if (DESTINATIONS[i].id == id) {
				destinationToRemove = DESTINATIONS[i]
			}
		}

		if (destinationToRemove != null) {
			DESTINATIONS.remove(destinationToRemove)
		}
	}

	fun updateDestination(destination: Destination) {
		for (i in DESTINATIONS.indices) {
			if (DESTINATIONS[i].id == destination.id) {
				val destinationToUpdate = DESTINATIONS[i]

				destinationToUpdate.city = destination.city
				destinationToUpdate.description = destination.description
				destinationToUpdate.country = destination.country
			}
		}
	}
}
