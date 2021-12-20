package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    // 수동으로 빈을 Config에서 생성해야할 경우 Config는 스프링에서만 사용하니 필드 주입 가능
    // 그래도 필드주입은 지양하자!!
//    @Autowired MemberRepository memberRepository;
//    @Autowired DiscountPolicy discountPolicy;

//    @Bean
//    OrderService orderService() {
//        return new OrderServiceImpl(memberRepository, discountPolicy);
//    }
}
