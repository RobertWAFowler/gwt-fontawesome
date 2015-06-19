![](https://travis-ci.org/levigo/gwt-fontawesome.svg)

# gwt-fontawesome

`gwt-fontawesome` is a library providing [Font Awesome](http://fortawesome.github.io/Font-Awesome) 4.3.0 within gwt projects.

## Usage

Using this library is straight-forward. Inherit `gwt-fontawesome` in your gwt module:

```xml
<module>
    <inherits name="org.jadice.web.gwt.fontawesome.FontAwesome"/>
    
    <!-- ... -->
</module>
```

This will ensure that the CSS files will be injected into the running application.
Once inhertied, the Font Awesome CSS classes can be used anywhere required. For a full reference of existing icons and their use, refer to the offical Font Awesome documentation: http://fortawesome.github.io/Font-Awesome

## Code-Usage

In addition to writing plain markup, this library provides a enum containing all class names of Font Awesome 4.3.0. The enum values even allow generating the appropriate icon markup as a SafeHtml string.

Example:

```java
import org.jadice.web.gwt.fontawesome.client.FontAwesome;
import com.google.gwt.core.client.EntryPoint;


public class MyEntryPoint implements EntryPoint {

  @Override
  public void onModuleLoad() {
    SafeHtml chevron = FontAwesome.CHEVRON_RIGHT.toSafeHtml();
        
  }
}
```

The `SafeHtml` string `chevron` will contain the markup: `<i class="fa fa-chevron-right"></i>`.

Using the enum ensures that there are no typos, which will only become visible at runtime.
