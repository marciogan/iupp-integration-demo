class Dependencies {

    object Iupp {
        const val GROUP = "br.com.iupp"
        const val VERSION = "1.0-SNAPSHOT"
    }

    object Versions {
        const val JAVA_VERSION = "11"
        const val KOTLIN_VERSION = "1.4.32"
        const val MICRONAUT_VERSION = "2.3.3"
        const val H2DATABASE_VERSION = "1.4.200"
        const val BENMANES_VERSION = "0.27.0"
        const val JOHNRENGELMAN_SHADOW = "6.1.0"
        const val MICRONAUT_APPLICATION = "1.4.2"
        const val CASSANDRA_VERSION = "4.0.0"
        const val LOG4J_VERISON = "2.14.1"
        const val DATASTAX_VERSION = "4.12.0"
        const val KOTEST_VERSION = "4.4.2"
        const val KOTEST_MICRONAUT_VERSION = "2.3.3"
        const val MOCKK_VERSION = "1.10.6"
        const val JACKSON_VERSION = "2.8.+"
        const val KTLINT_VERSION = "10.1.0"
    }

    object KotlinDependencies {
        const val STDLIB_JDK8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.KOTLIN_VERSION}"
        val REFLECT = "org.jetbrains.kotlin:kotlin-reflect:${Versions.KOTLIN_VERSION}"
        const val JACKSON = "com.fasterxml.jackson.module:jackson-module-kotlin:${Versions.JACKSON_VERSION}"
        const val JAVAX_ANNOT = "javax.annotation:javax.annotation-api"
    }

    object MicronautDependencies {
        const val MICRONAUT_BOM = "io.micronaut:micronaut-bom:${Versions.MICRONAUT_VERSION}"
        const val RUNTIME = "io.micronaut:micronaut-runtime"
        const val KOTLIN_RUNTIME = "io.micronaut.kotlin:micronaut-kotlin-runtime"
        const val INJECT_JAVA = "io.micronaut:micronaut-inject-java"
        const val JDBC_HIKARI = "io.micronaut.sql:micronaut-jdbc-hikari"
        const val HIBERNATE_JPA = "io.micronaut.sql:micronaut-hibernate-jpa"
        const val DATA_HIBERNATE_JPA = "io.micronaut.data:micronaut-data-hibernate-jpa"
        const val VALIDATION = "io.micronaut:micronaut-validation"
        const val DATA_PROCESSOR = "io.micronaut.data:micronaut-data-processor"
        const val HTTP_CLIENT = "io.micronaut:micronaut-http-client"
        const val HTTP_SERVER_NETTY = "io.micronaut:micronaut-http-server-netty"
        const val MANAGEMENT = "io.micronaut:micronaut-management"
        const val CASSANDRA = "io.micronaut.cassandra:micronaut-cassandra:${Versions.CASSANDRA_VERSION}"
    }

    object LogDependencies {
        const val SLF4J = "org.apache.logging.log4j:log4j-slf4j-impl:${Versions.LOG4J_VERISON}"
        const val LAYOUT = "org.apache.logging.log4j:log4j-layout-template-json:${Versions.LOG4J_VERISON}"
    }



    object DataStaxDependencies {
        const val CORE = "com.datastax.oss:java-driver-core:${Versions.DATASTAX_VERSION}"
    }

    object TestDependencies {
        const val JUNIT5 = "io.kotest:kotest-runner-junit5-jvm:${Versions.KOTEST_VERSION}"
        const val KOTEST = "io.micronaut.test:micronaut-test-kotest:${Versions.KOTEST_MICRONAUT_VERSION}"
        const val CORE = "io.kotest:kotest-assertions-core-jvm:${Versions.KOTEST_VERSION}"
        const val MOCKK = "io.mockk:mockk:${Versions.MOCKK_VERSION}"



    }

}
