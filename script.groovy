@Grab(group='org.jsoup', module='jsoup', version='1.13.1')
import org.jsoup.Jsoup

// Use Jsoup to fetch and parse HTML from a website
def url = 'https://en.wikipedia.org/wiki/Groovy_(programming_language)'
def doc = Jsoup.connect(url).get()

// Print the title of the Wikipedia page
println "Title: ${doc.title()}"
