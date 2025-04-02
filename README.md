# Component
## Consumer
- The consumer is the caller of the service
- Invokes methods on the remote service as if it were a local interface
## Service Proxy
- ServiceProxy is a dynamic proxy on the consumer side
- Sends the request over HTTP to the web server on the provider side
## WebServer(Provider)
- The HTTP Server Running on the Provider's side
- Receives inbound RPC requests from the consumer
- Passes those requests to the internal Request Handler for further processing
## Request Handler
- Accepts the incoming requests
- Looks up the corresponding implementation class in the Local Registry
- Uses reflection to call the specified method on the actual service instance
- Constructs and returns an RPC response (containing either the return value or any errors that occurred)
## Local Registry
- A ConcurrentHashMap that holds references from service names to their concrete implementation classes
- Allows the Request Handler to resolve "which class/method should be called" when it sees a service name and method name in the request.
- Often used for service discovery within the provider
## Provider(ServiceImpl)
- The actual implementation of the service's bussiness logic
- Called by the request handler once the appropriate method is identified
- Executes the requested method and returns the result to be packaged into RPC response

![Blank diagram (2)](https://github.com/user-attachments/assets/6a93cc26-5892-436b-a743-514ccab9db7a)
