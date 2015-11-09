package org.grails.jesque.demo

import groovy.util.logging.Slf4j

@Slf4j
class DemoJesqueJob implements Runnable {

    static triggers = {
        cron name: 'DemoJesqueJobTrigger', cronExpression: '0/15 * * * * ? *'
    }

    def perform() {
        println "Executing Job"
    }

    @Override
    void run() {
        perform()
    }
}