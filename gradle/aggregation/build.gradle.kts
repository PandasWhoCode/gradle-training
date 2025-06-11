plugins {
    id("org.hiero.gradle.feature.publish-maven-central-aggregation")
}

dependencies {
    // Different scopes for different purposes (testing, builds, etc.)
    published(project(":lib")) // I want lib to be published and it uses gradles listed dependencies.
    // Only need to list the entru-point for the application
}