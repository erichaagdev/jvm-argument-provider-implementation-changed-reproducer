plugins {
  id("java")
}

repositories {
  mavenCentral()
}

dependencies {
  implementation("org.junit.jupiter:junit-jupiter:5.9.2")
}

tasks.test {
  useJUnitPlatform()
  jvmArgumentProviders.add(FooArgumentProvider())
}

class FooArgumentProvider : CommandLineArgumentProvider {
  override fun asArguments() = listOf("-Dcom.example.foo=bar")
}

// foo
