import groovy.json.JsonSlurper

// Using a public API endpoint for demonstration purposes
def randomNumber = new Random().nextInt(1000) + 1 // Generate an ID from 1 to 1000

// Construct API URL for data request
def requestUrl = "https://pokeapi.co/api/v2/pokemon/${randomNumber}"

// Start connection to API
def httpConn = new URL(requestUrl).openConnection() as HttpURLConnection
httpConn.requestMethod = "GET"

// Process response from API
if (httpConn.responseCode == 200) {
    def resultText = httpConn.inputStream.text
    def parser = new JsonSlurper()
    def creatureData = parser.parseText(resultText)

    println "Fetched Creature: ${creatureData.name.capitalize()} (ID: ${creatureData.id})"
} else {
    println "Unable to retrieve creature information. Status Code: ${httpConn.responseCode}"
}
