plugins {
    id("org.hiero.gradle.build") version "0.4.1"
}

javaModules {
    // This is the java directories
    directory("gradle-training") {

        // This is the group to correspond to the java directory
        group = "com.pandaswhocode.example-gradle"
    }
}