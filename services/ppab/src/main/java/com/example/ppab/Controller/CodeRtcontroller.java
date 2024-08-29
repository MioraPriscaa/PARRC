
import com.example.ppab.Model.Codert;
import com.example.ppab.Service.CodeRtservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/codeRt")
public class CodeRtcontroller {
    @Autowired
    private CodeRtservice codeRtservice;
    @PostMapping("/inserer_codert")
    public String inserercodeRt(@RequestBody Codert codeRt){
        codeRtservice.inserercodert(codeRt);
        return "nouveau codeRt";
    }
    @GetMapping("/liste_CodeRt")
    public List<Codert> listeCodeRt(){
        return codeRtservice.listecodert();
    }
}
