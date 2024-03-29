plugins {
    `kotlin-dsl`
}


repositories {
    mavenCentral()
    google()
}

dependencies {
    compileOnly(lib.android.gradle.plugin)
}

gradlePlugin {
    /**
     * Register convention plugins so they are available in the build scripts of the application
     */
    plugins {
        register("conventionAndroidLib") {
            id = "io.monstarlab.library"
            implementationClass = "io.monstarlab.demo.plugins.AndroidLibConvention"
        }

        register("conventionAndroidApp") {
            id = "io.monstarlab.application"
            implementationClass = "io.monstarlab.demo.plugins.AndroidAppConvention"
        }
    }
}