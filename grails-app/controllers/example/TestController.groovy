package example

import org.codehaus.groovy.grails.web.mapping.LinkGenerator

class TestController {

	LinkGenerator grailsLinkGenerator

    def index() {
    	render grailsLinkGenerator.link(resource: 'book', id: 1, absolute: true)
    }
}
