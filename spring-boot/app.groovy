/**+https://docs.spring.io/spring-boot/docs/2.2.2.RELEASE/reference/htmlsingle/#getting-started-installing-the-cli*/
@RestController
class ThisWillActuallyRun {

    @RequestMapping("/")
    String home() {
        return "Hello, World!"
    }

}