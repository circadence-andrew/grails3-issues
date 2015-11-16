

// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.rejectIfNoRule = false
grails.plugin.springsecurity.fii.rejectPublicInvocations = false
grails.plugin.springsecurity.userLookup.userDomainClassName = 'com.example.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'com.example.UserRole'
grails.plugin.springsecurity.authority.className = 'com.example.Role'
grails.plugin.springsecurity.securityConfigType = 'InterceptUrlMap'
grails.plugin.springsecurity.interceptUrlMap = [
	'/':                ['IS_AUTHENTICATED_FULLY'],
	'/error':           ['permitAll'],
	'/index':           ['IS_AUTHENTICATED_FULLY'],
	'/index.gsp':       ['IS_AUTHENTICATED_FULLY'],
	'/shutdown':        ['permitAll'],
	'/assets/**':       ['permitAll'],
	'/**/js/**':        ['permitAll'],
	'/**/css/**':       ['permitAll'],
	'/**/images/**':    ['permitAll'],
	'/**/favicon.ico':  ['permitAll'],
  '/logout/**':       ['permitAll'],
  '/login/**':        ['permitAll'],
]

