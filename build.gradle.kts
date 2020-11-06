allprojects {
    group = "org.example"
    version = "1.0-SNAPSHOT"
}

subprojects {
    apply(plugin = "java")
//    apply(plugin = "com.google.osdetector")
    repositories {
        mavenCentral()
        mavenLocal()
        jcenter()
        google()
    }

    configure<JavaPluginConvention> {
        sourceCompatibility = JavaVersion.VERSION_15
        targetCompatibility = JavaVersion.VERSION_15
    }

    dependencies {
        val implementation by configurations
        implementation("io.netty", "netty-all", "4.1.53.Final")
        implementation("org.conscrypt", "conscrypt-openjdk", "2.5.1" )
        implementation("org.slf4j", "slf4j-log4j12", "1.7.30")
 //       compile 'org.conscrypt:conscrypt-openjdk:2.5.0:' + osdetector.classifier
//        compile group: 'org.slf4j', name: 'slf4j-log4j12', version: '1.7.30'

    }

}