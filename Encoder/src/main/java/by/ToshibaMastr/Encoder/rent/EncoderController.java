package by.ToshibaMastr.Encoder.rent;

import by.ToshibaMastr.Encoder.services.EncoderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class EncoderController {
    @Autowired
    EncoderService encoderService;

    @GetMapping("/CaesarsCipher")
    public String CaesarsCipher(@RequestParam(name = "string") String string,
                                @RequestParam(name = "shift") Integer shift){
        return encoderService.CaesarsCipher(string, shift);
    }
}
