package uk.gov.ons.ctp.integration.mockenvoy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.godaddy.logging.Logger;
import com.godaddy.logging.LoggerFactory;

import uk.gov.ons.ctp.common.error.RestExceptionHandler;
import uk.gov.ons.ctp.common.jackson.CustomObjectMapper;
import uk.gov.ons.ctp.integration.mockenvoy.endpoint.MockEnvoyEndpoints;

/** The 'main' entry point for the mock-envoy application. */
@SpringBootApplication
@EnableCaching
public class MockEnvoyApplication {
  private static final Logger log = LoggerFactory.getLogger(MockEnvoyApplication.class);

  /**
   * The main entry point for this application.
   *
   * @param args runtime command line args
   */
  public static void main(final String[] args) {
    log.warn("PMB: In main()");
    try {
      Thread.sleep(324234234);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.exit(-1);

    SpringApplication.run(MockEnvoyApplication.class, args);
  }

  /**
   * Custom Object Mapper
   *
   * @return a customer object mapper
   */
  @Bean
  @Primary
  public CustomObjectMapper customObjectMapper() {
    return new CustomObjectMapper();
  }

  /**
   * Bean used to map exceptions for endpoints
   *
   * @return the service client
   */
  @Bean
  public RestExceptionHandler restExceptionHandler() {
    return new RestExceptionHandler();
  }
}
