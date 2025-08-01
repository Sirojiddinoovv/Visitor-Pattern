# Collateral Management Service

A Kotlin-based Spring Boot application designed to manage and process collateral data in financial systems.

## ✨ Features

- REST API to create and retrieve collateral information
- Support for polymorphic collateral types (e.g., Real Estate, Equipment, Vehicles)
- Uses **Visitor Pattern** to handle type-specific logic while keeping business logic extensible and clean
- AOP-based validations including AML (Anti-Money Laundering) checks
- Centralized exception handling and response formatting
- Custom JSON (de)serialization via Jackson TypeIdResolver

## 🧠 Design Highlight: Visitor Pattern

This project leverages the **Visitor Pattern** to encapsulate behavior based on the collateral type without polluting the domain models. This approach allows:
- Centralized handling of type-specific business logic
- Clean extension of new collateral types
- Better separation of concerns and maintainability

Each `CollateralType` delegates type-specific processing to a visitor, enabling logic like value calculation, transformation, or risk evaluation to be decoupled from the data model.

## 🛠️ Tech Stack

- Kotlin
- Spring Boot
- Gradle Kotlin DSL
- Jackson
- JPA (Hibernate)

## ▶️ How to Run

```bash
./gradlew bootRun
```

The application will start on `http://localhost:8080`.

## 🧪 Running Tests

```bash
./gradlew test
```

## 📁 Project Structure

```
src/
 └── main/
     ├── kotlin/
     │    └── uz/nodir/collateral/
     │         ├── controller/       # REST Controllers
     │         ├── model/            # DTOs and Entity classes
     │         ├── service/          # Business Logic
     │         ├── repository/       # JPA Repositories
     │         ├── exceptions/       # Error Handling
     │         └── utils/            # Utilities
     └── resources/
          └── application.yml       # Application configuration
```

## 🧑‍💻 Author

Created by **Nodirbek**

## 📄 License

This project is licensed under the MIT License.
