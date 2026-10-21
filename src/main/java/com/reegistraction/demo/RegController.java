

@RestController
public class RegController{

private final RegService regService;

    @Post("/register")
    public String create(RegistrationDto dto){
        this.regService.create(dto);
    }

}