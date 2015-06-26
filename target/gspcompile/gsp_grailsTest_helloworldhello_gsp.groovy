import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_grailsTest_helloworldhello_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/helloworld/hello.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('captureHead','sitemesh',3,[:],-1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
createTagBody(2, {->
printHtmlPart(3)
invokeTag('textField','g',21,['name':("nameField")],-1)
printHtmlPart(4)
invokeTag('actionSubmit','g',22,['value':("Action"),'action':("update")],-1)
printHtmlPart(5)
expressionOut.print(message)
printHtmlPart(6)
})
invokeTag('form','g',27,[:],2)
printHtmlPart(7)
})
invokeTag('captureBody','sitemesh',28,[:],1)
printHtmlPart(8)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1435296532000L
public static final String EXPRESSION_CODEC = 'none'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'none'
public static final String TAGLIB_CODEC = 'none'
}
