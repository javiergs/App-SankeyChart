This repository provides a simple Java Swing application that renders a **Sankey (flow) diagram** using **JFreeChart**’s `FlowPlot`.  
It demonstrates how to build datasets, generate color palettes, and embed a chart inside a Swing GUI.

<p align="center">
  <img width="600" src="https://upload.wikimedia.org/wikipedia/commons/1/1b/Sankey_diagram_showing_the_use_of_energy_in_the_UK_%281956%29.png" alt="Example Sankey Diagram"/>
</p>

> *This example is fully self-contained and intended for teaching, demos, and quick experimentation.*

---

## 🚀 Features

- Java Swing application with an embedded Sankey chart  
- Uses `FlowPlot` from **JFreeChart**  
- Automatically generated color palette using HSB color space  
- Example dataset showing a multi-step resource flow  
- Clean, well-structured code suitable for extension  

---

## 📦 Requirements

- Java 11 or higher  
- Maven (recommended)  
- JFreeChart 1.5+ with flow plot support  

---

## 📚 Maven Dependency

Add the following to your `pom.xml`:

```xml
<dependency>
    <groupId>org.jfree</groupId>
    <artifactId>jfreechart</artifactId>
    <version>1.5.4</version>
</dependency>
