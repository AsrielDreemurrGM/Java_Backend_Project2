<h1>Java Backend Project 2</h1>
<p>
  This is my second backend project using Java, focused on deepening core concepts like <strong>TDD (Test-Driven Development)</strong>, 
  <strong>Generics</strong>, and <strong>Unit Testing</strong> with a structured and modular approach.<br />
  It follows the same CRUD foundation as the first project, but this time with a strong emphasis on writing tests first and applying best development practices.
</p>
<p>
  🔗 <strong>Want to have a look at the first project?</strong>
  Check out <a href="https://github.com/AsrielDreemurrGM/Java_CRUD_Example">Project 1 - Java CRUD Example</a>, it’s the starting point of my Java journey.
</p>
<h2>📌 Features</h2>
<ul>
  <li>Application of the <strong>TDD</strong> methodology: tests are created before implementation;</li>
  <li>Usage of <code>Generics</code> for both DAO and Service layers to reduce code repetition;</li>
  <li>Custom domain models like <code>Client</code> and <code>Product</code> implementing a <code>Persistable</code> interface;</li>
  <li><code>GenericMapDAO</code> and <code>GenericService</code> for reusable CRUD operations across entities;</li>
  <li>Unit tests using <strong>JUnit 5</strong>, structured for DAO and Service layers with mock implementations for isolation;</li>
  <li>Dependency injection used to wire DAOs into services in the test setup;</li>
  <li>Detailed Javadoc comments across classes and test files;</li>
</ul>
<h2>🗂️ Project Structure</h2>
<ul>
  <li><code>br.com.eaugusto.domain</code>: Domain models like <code>Client</code> and <code>Product</code>, and the <code>Persistable</code> interface;</li>
  <li><code>br.com.eaugusto.dao</code>: DAO interfaces and implementations, including <code>ClientDAO</code> and <code>ProductDAO</code>;</li>
  <li><code>br.com.eaugusto.dao.generics</code>: Generic DAO interfaces and base implementations using <code>Map</code> storage;</li>
  <li><code>br.com.eaugusto.services</code>: Service interfaces and classes, such as <code>ClientService</code> and <code>ProductService</code>;</li>
  <li><code>br.com.eaugusto.services.generics</code>: Generic service interfaces and implementations using the generic DAO layer;</li>
  <li><code>br.com.eaugusto</code> (test): Contains test classes for DAO and service layers using mock implementations and dependency injection;</li>
</ul>
<h2>🧪 Testing Approach</h2>
<ul>
  <li>Follows the <strong>test-first</strong> approach with JUnit 5;</li>
  <li>Includes coverage for CRUD operations on both service and DAO layers;</li>
  <li>Mock classes like <code>ClientDAOMock</code> and <code>ProductDAOMock</code> simulate data access for isolated tests;</li>
  <li>Each test class includes setup logic, method verification, and meaningful assertions;</li>
  <li>Coverage tools like <strong>EclEmma</strong> are being used for visual feedback during development.</li>
</ul>
<h2>📅 Commit Highlights</h2>
<h3>June 25, 2025</h3>
<ul>
  <li>Added Javadoc to <code>ProductServiceTest</code> for clarity and documentation;</li>
  <li>Completed <code>ProductService</code> and its test class, following the TDD pattern;</li>
  <li>Updated <code>Product</code> to use a default constructor and setter-based initialization in tests.</li>
</ul>
<h3>June 24, 2025</h3>
<ul>
  <li>Created <code>Product</code> entity and DAO with full test coverage using <code>ProductDAOMock</code> and <code>ProductDAOTest</code>;</li>
  <li>Applied generic DAO structure to both <code>Client</code> and <code>Product</code> workflows.</li>
</ul>
<h3>June 23, 2025</h3>
<ul>
  <li>Implemented <code>delete</code> and <code>modify</code> actions in DAO and service layers with respective tests.</li>
</ul>
<h3>June 22, 2025</h3>
<ul>
  <li>Initial project setup with domain models, DAO, and service layers for <code>Client</code>;</li>
  <li>Set up TDD structure and created first unit tests.</li>
</ul>
<h2>📚 Learning Goals</h2>
<ul>
  <li>Practice TDD effectively in a real-world-style CRUD application;</li>
  <li>Use generics to build flexible, reusable service and DAO layers;</li>
  <li>Write clean, modular tests that simulate business logic and edge cases;</li>
  <li>Understand the integration of Swing (coming soon) into backend-driven Java apps.</li>
</ul>
