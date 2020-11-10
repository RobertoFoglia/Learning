# pulsar-simple-example project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

# Pulsar
Here we use a Java Client and we make an example with the instruction on the [Pulsar docs](https://pulsar.apache.org/docs/en/client-libraries-java/)

To start it
sudo docker run -it   -p 6650:6650   -p 8081:8080   --mount source=pulsardata,target=/pulsar/data   --mount source=pulsarconf,target=/pulsar/conf   apachepulsar/pulsar:2.6.1  bin/pulsar standalone

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `pulsar-simple-example-1.0.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/pulsar-simple-example-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/pulsar-simple-example-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.