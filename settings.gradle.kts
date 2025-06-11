plugins {
    id("org.hiero.gradle.build") version "0.4.1"
}

javaModules {
    // This is the java directories
    directory("gradle-training") {
        // This group needs to correspond to a group you own in Maven Central when publishing
        group="org.pandas.example-gradle"
    }
}