// tell gradle what kind of project this is are we a library, appplication, or test
plugins {
    id("org.hiero.gradle.module.library")
}

testModuleInfo {
    requires("org.junit.jupiter.api")
}