package site.dolshei.emspring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
//@EnableSwagger2
public class SwaggerConfiguration {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("site.dolshei.emspring.mvc"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("API 서버 문서")
                .description("API 문서 설명")
                .version("1.0.0")
                .build();
    }
/*

    @Bean
    public Docket docket() {
        ApiInfoBuilder apiInfo = new ApiInfoBuilder();
        apiInfo.title("API 서버 문서");
        apiInfo.description("API 서버 문서 입니다.");

        Docket docket = new Docket(DocumentationType.SWAGGER_2);
        docket.apiInfo(apiInfo.build());

        ApiSelectorBuilder apis = docket.select().apis(RequestHandlerSelectors.basePackage("site.dolshei.emspring.mvc.controller"));
        apis.paths(PathSelectors.ant("/**"));

        return apis.build();
    }
*/

}
