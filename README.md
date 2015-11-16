# Grails 3 Issues

This repo demonstrates two separate issues:

* StackOverflowError in LibraryControllerSpec unit test
* HibernateException in LibraryControllerIntegrationSpec integration test

Grails version information:
```
| Grails Version: 3.0.9
| Groovy Version: 2.4.5
| JVM Version: 1.7.0_85
```

## StackOverflowError in Unit Test

```
java.lang.StackOverflowError
    at java.lang.Exception.&lt;init&gt;(Exception.java:54)
    at java.lang.RuntimeException.&lt;init&gt;(RuntimeException.java:51)
    at java.lang.NullPointerException.&lt;init&gt;(NullPointerException.java:60)
    at org.codehaus.groovy.util.HashCodeHelper.updateHash(HashCodeHelper.java:84)
    at java.util.AbstractSet.hashCode(AbstractSet.java:126)
    at org.codehaus.groovy.util.HashCodeHelper.updateHash(HashCodeHelper.java:84)
    at org.codehaus.groovy.util.HashCodeHelper.updateHash(HashCodeHelper.java:84)
    at java.util.AbstractSet.hashCode(AbstractSet.java:126)
    at org.codehaus.groovy.util.HashCodeHelper.updateHash(HashCodeHelper.java:84)
    at org.codehaus.groovy.util.HashCodeHelper.updateHash(HashCodeHelper.java:84)
    at java.util.AbstractSet.hashCode(AbstractSet.java:126)
    ... (this just repeats until the end of the trace)
```

## HibernateException in Integration Test

```
org.hibernate.HibernateException: No Session found for current thread
    at org.grails.orm.hibernate.GrailsSessionContext.currentSession(GrailsSessionContext.java:117)
    at org.hibernate.internal.SessionFactoryImpl.getCurrentSession(SessionFactoryImpl.java:1014)
    at org.grails.orm.hibernate.validation.HibernateDomainClassValidator.validate(HibernateDomainClassValidator.java:64)
    at org.grails.orm.hibernate.AbstractHibernateGormInstanceApi.save(AbstractHibernateGormInstanceApi.groovy:140)
    at org.grails.datastore.gorm.GormEntity$Trait$Helper.save(GormEntity.groovy:165)
    at com.example.LibraryControllerIntegrationSpec.$tt__setupData(LibraryControllerSpec.groovy:22)
    at com.example.LibraryControllerIntegrationSpec.setupData_closure1(LibraryControllerSpec.groovy)
    at groovy.lang.Closure.call(Closure.java:426)
    at groovy.lang.Closure.call(Closure.java:442)
    at grails.transaction.GrailsTransactionTemplate$1.doInTransaction(GrailsTransactionTemplate.groovy:67)
    at org.springframework.transaction.support.TransactionTemplate.execute(TransactionTemplate.java:133)
    at grails.transaction.GrailsTransactionTemplate.executeAndRollback(GrailsTransactionTemplate.groovy:64)
    at com.example.LibraryControllerIntegrationSpec.$tt__$spock_feature_0_0(LibraryControllerSpec.groovy:33)
    at com.example.LibraryControllerIntegrationSpec.test save_closure2(LibraryControllerSpec.groovy)
    at groovy.lang.Closure.call(Closure.java:426)
    at groovy.lang.Closure.call(Closure.java:442)
    at grails.transaction.GrailsTransactionTemplate$1.doInTransaction(GrailsTransactionTemplate.groovy:67)
    at org.springframework.transaction.support.TransactionTemplate.execute(TransactionTemplate.java:133)
    at grails.transaction.GrailsTransactionTemplate.executeAndRollback(GrailsTransactionTemplate.groovy:64)
    at com.example.LibraryControllerIntegrationSpec.test save(LibraryControllerSpec.groovy)
```
