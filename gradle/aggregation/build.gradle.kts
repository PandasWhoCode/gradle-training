plugins {
    id("org.hiero.gradle.feature.publish-maven-central-aggregation")
}

dependencies {
    // Different scopes for different purposes (testing, builds, etc.)
    published(project(":lib")) // publish lib, include transitive dependencies as well, no need to list lib2
}