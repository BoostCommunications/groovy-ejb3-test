package no.boost.groovytest

import javax.ejb.Stateless;
import javax.ejb.Local;

@Stateless
@Local(AGroovySessionBeanLocal.class)
class AGroovySessionBean implements AGroovySessionBeanLocal {
    def anOperation(parameter) {
        println Hello $parameter
        return "Hi $parameter"
    }
}
