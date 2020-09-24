package br.com.alura.leilao.acceptance.steps;
import java.math.BigDecimal;

import br.com.alura.leilao.model.Lance;
import br.com.alura.leilao.model.Leilao;
import br.com.alura.leilao.model.Usuario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PropondoLanceSteps {


private Lance lance;
private Leilao leilao;
@Given("Dando um lance valido")
public void dando_um_lance_valido() {
	
	Usuario usuario = new Usuario("fulano");
	lance = new Lance(usuario, BigDecimal.TEN);
}

@When("Quando propoe o lance")
public void quando_propoe_o_lance() {
leilao = new Leilao("Tablet SFG");
leilao.propoe(lance);
}
@Then("Entao o lance e aceito")
public void entao_o_lance_e_aceito() {
    
	// **** TO DO ******
	
    }



	
}
