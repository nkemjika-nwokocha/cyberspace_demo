



public class RegistrationDto {
   @Size(min = 3, max = 32)
    private String fullname;

    @Size(min = 3, max = 32)
    private String regId;
}