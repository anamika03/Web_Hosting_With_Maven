# Webpage Hosting with Maven

This repository demonstrates how to host a webpage on port 8080 using Maven.

## Prerequisites

Before you proceed, make sure you have the following prerequisites installed:

- Java Development Kit (JDK) version 11 or higher
- Apache Maven 3 or higher

## Getting Started

To host your webpage on port 8080, follow these steps:
   
1. Clone this repo on your local computer:

   ```shell
   git clone https://github.com/your-username/your-repo.git
   ```

2. Navigate to the project directory:

   ```shell
   cd your-repo
   ```

3. Build the project using Maven:

   ```shell
   mvn clean install
   mvn clean package
   ```

4. Execute the .jar/.war file generated in target folder:

   ```shell
   java -jar target/jar_file_name.jar
   ```

5. Open your web browser and visit `http://localhost:8080` to see your webpage.

## Customizing Your Webpage

To customize your webpage, follow these steps:

1. Locate the `index.html` file under the `src/main/resources/templates/` directory.

2. Edit the `index.html` as per your choice.

3. Save your changes.

4. Restart the web server:

   ```shell
   mvn clean
   mvn clean package
   java -jar target/jar_file_name.jar
   ```

   This will apply your modifications and make them accessible at `http://localhost:8080`.

## Contributing

If you'd like to contribute to this project, please follow these guidelines:

1. Fork the repository on GitHub.

2. Create a new branch with a descriptive name:

   ```shell
   git checkout -b my-new-feature
   ```

3. Make your changes and commit them with clear and concise messages:

   ```shell
   git commit -am 'Add some feature'
   ```

4. Push your changes to your forked repository:

   ```shell
   git push origin my-new-feature
   ```

5. Submit a pull request detailing your changes and their benefits.

## License

This project is licensed under the [MIT License](LICENSE).

## Acknowledgments

- [Apache Maven](https://maven.apache.org/)
- [Jetty](https://www.eclipse.org/jetty/)

## Contact

If you have any questions or suggestions, please feel free to contact at anamikasingh361996@gmail.com
