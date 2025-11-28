A simple Java Swing application that renders a **Sankey (flow) diagram** using **JFreeChart**’s `FlowPlot`.  

<p align="center">
<img width="912" height="712" alt="Screenshot 2025-11-28 at 4 22 11 AM" src="https://github.com/user-attachments/assets/38672ec7-be16-441e-8bca-d66f17688650" />
</p>

## 🚀 Features

- Java Swing application with an embedded Sankey chart  
- Uses `FlowPlot` from **JFreeChart**  
- Automatically generated color palette using HSB color space  
- Example dataset showing a multi-step resource flow  
- Clean, well-structured code suitable for extension  

## 📚 Maven Dependency

Add the following to your `pom.xml`:

```xml
<dependency>
    <groupId>org.jfree</groupId>
    <artifactId>jfreechart</artifactId>
    <version>1.5.4</version>
</dependency>
