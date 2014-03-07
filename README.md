sushi-jax-ws
============

JAX-WS SOAP bindings for the COUNTER Sushi protocol.

This project contains only the automatically generated code used for the Java JAX-WS bindings.  Isolating the auto generated code into this project allows us to version any changes to the WSDL/API and have a stable library.  This also moves the code generation step outside of the normal build process which should make the AMX code cleaner.

## Updating the API

The API code files are generated each time that the project is built.  Simply run

    mvn clean compile

Any changes to the API should be made to the packaged WSDL/XSD files and then will be applied to the generated code.

## Included service implementation

The included service impl `SushiServiceInterfaceImpl` is provided only to show the proper JAX-WS annotation bindings that should be applied to any actual implementation.  Any implementation should be included in a separate library/project.
