package spring.boot.issue.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.Compression;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;

@SpringBootApplication
public class DemoApplication {

    public static void main(final String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public EmbeddedServletContainerFactory tomcatContainer() {
        final TomcatEmbeddedServletContainerFactory tomcatContainerFactory = new TomcatEmbeddedServletContainerFactory();
        tomcatContainerFactory.setPort(8080);

        final Compression compression = new Compression();
        compression.setEnabled(true);
        final String[] mimeTypes = {MediaType.APPLICATION_JSON_UTF8_VALUE};
        compression.setMimeTypes(mimeTypes);
        compression.setMinResponseSize(10);
        return tomcatContainerFactory;
    }
}
