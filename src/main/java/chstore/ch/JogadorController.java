
package chstore.ch;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author gessyca.lm
 */
@Named
public class JogadorController {
    
    @Inject
    JogadorJPA jogadorJPA;
    private Jogador jogador;
    
    @PostConstruct
    public void inicializar(){
        jogador = new Jogador();
    }
    
    public void salvar(){
        jogadorJPA.salvar(jogador);
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
 
}
