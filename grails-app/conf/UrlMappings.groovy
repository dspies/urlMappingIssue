class UrlMappings {

	static mappings = {

        "/books/$id(.$format)?"(controller:'book'){
            action = [GET: 'show', PUT: 'update', POST: 'update', DELETE: 'delete']
        }
        "/books(.$format)?"(controller:'book'){
            action = [GET: 'index', PUT: 'unsupported', POST: 'save', DELETE: 'unsupported']
        }

        //Still required for the login/logout controller at the very least
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
	}
}