import org.jetbrains.kotlin.gradle.plugin.KotlinPluginWrapper
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	application
	id ("com.github.johnrengelman.shadow") version "2.0.4"
	id("org.springframework.boot") version "2.1.5.RELEASE"
	id("io.spring.dependency-management") version "1.0.7.RELEASE"
	kotlin("jvm") version "1.2.71"
	kotlin("plugin.spring") version "1.2.71"
}

// Tweak to be sure to have compiler and dependency versions the same
extra["kotlin.version"] = plugins.getPlugin(KotlinPluginWrapper::class.java).kotlinPluginVersion

repositories {
	mavenCentral()
}

application {
	mainClassName = "com.rra.project.kanbandesk.KanbanDeskApplication.kt"
}

tasks {
	withType<KotlinCompile> {
		kotlinOptions {
			jvmTarget = "1.8"
			freeCompilerArgs = listOf("-Xjsr305=strict")
		}
	}
}

val test by tasks.getting(Test::class) {
	useJUnitPlatform()
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.boot:spring-boot-dependencies:2.1.2.RELEASE")
	}
}

dependencies {

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")


    implementation("org.springframework:spring-test")
    implementation("org.springframework:spring-context")
    implementation("io.projectreactor.netty:reactor-netty")
    implementation("com.samskivert:jmustache")

    implementation("org.slf4j:slf4j-api")
    implementation("ch.qos.logback:logback-classic")

    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310")

    testImplementation("io.projectreactor:reactor-test")
    testImplementation("org.assertj:assertj-core")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.junit.jupiter:junit-jupiter-api")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}
