package Com.ValueAnnotation.Problem;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

@Component
@PropertySources({
    @PropertySource("classpath:application.properties")
})
public class MyApp {
@Value("${app.name}")
private String name;

@Value("${app.version}")
private String version;

public void displayInformation() {
	System.out.println("Name:"+name);
	System.out.println("Version:"+version);
}

}
