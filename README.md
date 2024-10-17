# MoveSquare Backend
This project is a proof-of-concept for writing a backend library for a
rather minimalistic game. The game itself would be written as a
frontend which would declare this library as a dependency.

The goal is to simplify the frontend implementation, as it would only
need to send messages to the backend to update the game state, and
render the current state of the game as exported by the backend.

## Usage (Gradle)
Clients can include the published Maven package as a dependency by doing the following:

1. Adding this package repository to their existing Maven
   repositories:


```kotlin
repositories {
    maven {
        name = "GitHubPackages"
        url = uri("https://maven.pkg.github.com/BrandonIrizarry/MoveSquareBackend")
        credentials {
            username = System.getenv("GITHUB_USER")
            password = System.getenv("GITHUB_PAT")
        }
    }
}
```

In this example, `GITHUB_USER` and `GITHUB_PAT` are local environment
variables configured by the user. The former is self-explanatory. The
latter is the user's personal access token, which must be obtained
beforehand in order to authenticate with GitHub in this context.

More information about this topic can be found [here](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-gradle-registry).

2. Declaring the dependency itself:

```kotlin
dependencies {
    implementation("xyz.brandonirizarry:move-square-backend:VERSION")
}
```
Here, `VERSION` is to be substituted for a value such as `1.0`.

## Frontend clients using this backend
- [JavaFX](https://github.com/BrandonIrizarry/MoveSquareJavaFX)



