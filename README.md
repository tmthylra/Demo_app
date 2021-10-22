##Two ways to run:

### 1. Production build
1. Run the following command `./mvnw package` from the root project directory to produce a runnable jar file.
2. Run that jar file from a terminal by running `java -jar target/demo-#.#.#.jar`.
3. Now go to http://localhost:8080.
###2. Development build
1. Open a project in an IDE and run the backend by building and running the java code.
2. Open a terminal navigate to `demo/src/main/client` and run `npm start`
3. **NOTE**: This runs the backend server at localhost:8080 which has no frontend
and the frontend on a node server at localhost:3000
